// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaweb.common.common.BaseQuery;
import com.javaweb.common.common.IBaseService;
import com.javaweb.common.config.CommonConfig;
import com.javaweb.common.utils.CommonUtils;
import com.javaweb.common.utils.DateUtils;
import com.javaweb.common.utils.JsonResult;
import com.javaweb.common.utils.StringUtils;
import com.javaweb.system.common.BaseServiceImpl;
import com.javaweb.system.constant.BrandConstant;
import com.javaweb.system.constant.PositionConstant;
import com.javaweb.system.entity.Brand;
import com.javaweb.system.entity.Position;
import com.javaweb.system.entity.User;
import com.javaweb.system.entity.UserRole;
import com.javaweb.system.mapper.BrandMapper;
import com.javaweb.system.mapper.UserMapper;
import com.javaweb.system.query.BrandQuery;
import com.javaweb.system.query.PositionQuery;
import com.javaweb.system.service.IBrandService;
import com.javaweb.system.service.IPositionService;
import com.javaweb.system.utils.IdGenerater;
import com.javaweb.system.utils.ShiroUtils;
import com.javaweb.system.utils.UserUtils;
import com.javaweb.system.vo.BrandListVo;
import com.javaweb.system.vo.PositionListVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 品牌 服务实现类
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Service
public class BrandServiceImpl extends BaseServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        BrandQuery brandQuery = (BrandQuery) query;
        // 查询条件
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();
        // 岗位名称
        if (!StringUtils.isEmpty(brandQuery.getName())) {
            queryWrapper.like("name", brandQuery.getName());
        }
        // 状态：1正常 0停用
        if (brandQuery.getStatus() != null) {
            queryWrapper.eq("status", brandQuery.getStatus());
        }
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");

        // 查询数据
        IPage<Brand> page = new Page<>(brandQuery.getPage(), brandQuery.getLimit());
        IPage<Brand> data = brandMapper.selectPage(page, queryWrapper);
        List<Brand> brandList = data.getRecords();
        List<BrandListVo> brandListVoList = new ArrayList<>();
        if (!brandList.isEmpty()) {
            brandList.forEach(item -> {
                BrandListVo brandListVo = new BrandListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, brandListVo);
                // 状态描述
                if (brandListVo.getStatus() != null && brandListVo.getStatus() > 0) {
                    brandListVo.setStatusName(BrandConstant.BRAND_STATUS_LIST.get(brandListVo.getStatus()));
                }
                // logo
                if (!StringUtils.isEmpty(brandListVo.getLogo())) {
                    brandListVo.setLogo(CommonUtils.getImageURL(brandListVo.getLogo()));
                }
                // 添加人名称
                if (brandListVo.getCreateUser() != null && brandListVo.getCreateUser() > 0) {
                    brandListVo.setCreateUserName(UserUtils.getName((brandListVo.getCreateUser())));
                }
                // 更新人名称
                if (brandListVo.getUpdateUser() != null && brandListVo.getUpdateUser() > 0) {
                    brandListVo.setUpdateUserName(UserUtils.getName((brandListVo.getUpdateUser())));
                }
                brandListVoList.add(brandListVo);
            });
        }

        return JsonResult.success("操作成功", brandListVoList, data.getTotal());
    }

    /**
     * 获取记录详情
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public Object getInfo(Serializable id) {
        Brand entity = (Brand) super.getInfo(id);
        return entity;
    }

    /**
     * 添加或编辑记录
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    @Transactional
    public JsonResult edit(Brand entity) {
        // logo
        if (entity.getLogo().contains(CommonConfig.imageURL)) {
            entity.setLogo(entity.getLogo().replaceAll(CommonConfig.imageURL, ""));
        }

        boolean result = false;
        if (entity.getId() != null && entity.getId() > 0) {
            // 修改记录
            // 判断是否品牌已存在
            Integer count = brandMapper.selectCount(new LambdaQueryWrapper<Brand>()
                    .eq(Brand::getName, entity.getName())
                    .ne(Brand::getId, entity.getId())
                    .eq(Brand::getMark, 1));
            if (count > 0) {
                return JsonResult.error("当前品牌名已存在");
            }
            entity.setUpdateUser(ShiroUtils.getUserId());
            entity.setUpdateTime(DateUtils.now());
            result = this.updateById(entity);

        } else {
            // 新增记录
            // 判断是否用户名已存在
            Integer count = brandMapper.selectCount(new LambdaQueryWrapper<Brand>()
                    .eq(Brand::getName, entity.getName())
                    .eq(Brand::getMark, 1));
            if (count > 0) {
                return JsonResult.error("当前品牌名已存在");
            }
            entity.setId(IdGenerater.generaterId("BRAND_ID"));
            entity.setCreateUser(ShiroUtils.getUserId());
            entity.setCreateTime(new Date());
            entity.setMark(1);
            entity.setStatus(1);
            result = this.save(entity);
        }
        if (!result) {
            return JsonResult.error();
        }

        return JsonResult.success();
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
    @Override
    public JsonResult deleteById(Integer id) {
        if (id == null || id == 0) {
            return JsonResult.error("记录ID不能为空");
        }
        Brand entity = this.getById(id);
        if (entity == null) {
            return JsonResult.error("记录不存在");
        }
        return super.delete(entity);
    }

    /**
     * 设置状态
     *
     * @param entity 实体对象
     * @return
     */
    @Override
    public JsonResult setStatus(Brand entity) {
        if (entity.getId() == null || entity.getId() <= 0) {
            return JsonResult.error("记录ID不能为空");
        }
        if (entity.getStatus() == null) {
            return JsonResult.error("记录状态不能为空");
        }
        return super.setStatus(entity);
    }
}