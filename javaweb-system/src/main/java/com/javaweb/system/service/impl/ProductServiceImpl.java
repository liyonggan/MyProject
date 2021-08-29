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
import com.javaweb.common.common.BaseQuery;
import com.javaweb.common.config.CommonConfig;
import com.javaweb.common.utils.CommonUtils;
import com.javaweb.common.utils.DateUtils;
import com.javaweb.common.utils.JsonResult;
import com.javaweb.common.utils.StringUtils;
import com.javaweb.system.common.BaseServiceImpl;
import com.javaweb.system.constant.BrandConstant;
import com.javaweb.system.constant.ProductConstant;
import com.javaweb.system.entity.Brand;
import com.javaweb.system.entity.Product;
import com.javaweb.system.mapper.ProductMapper;
import com.javaweb.system.query.BrandQuery;
import com.javaweb.system.query.ProductQuery;
import com.javaweb.system.service.IBrandService;
import com.javaweb.system.service.IProductService;
import com.javaweb.system.utils.IdGenerater;
import com.javaweb.system.utils.ShiroUtils;
import com.javaweb.system.utils.UserUtils;
import com.javaweb.system.vo.BrandListVo;
import com.javaweb.system.vo.ProductListVo;
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
public class ProductServiceImpl extends BaseServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @Override
    public JsonResult getList(BaseQuery query) {
        ProductQuery productQuery = (ProductQuery) query;
        // 查询条件
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        // 产品名称
        if (!StringUtils.isEmpty(productQuery.getName())) {
            queryWrapper.like("name", productQuery.getName());
        }

        // 所属品牌
        if (productQuery.getBrand() != null) {
            queryWrapper.like("brand_id", productQuery.getBrand());
        }
        // 状态：1正常 0停用
        if (productQuery.getStatus() != null) {
            queryWrapper.eq("status", productQuery.getStatus());
        }
        queryWrapper.eq("mark", 1);
        queryWrapper.orderByDesc("id");

        // 查询数据
        IPage<Product> page = new Page<>(productQuery.getPage(), productQuery.getLimit());
        IPage<Product> data = productMapper.selectPage(page, queryWrapper);
        List<Product> brandList = data.getRecords();
        List<ProductListVo> productListVos = new ArrayList<>();
        if (!brandList.isEmpty()) {
            brandList.forEach(item -> {
                ProductListVo productListVo = new ProductListVo();
                // 拷贝属性
                BeanUtils.copyProperties(item, productListVo);
                // 状态描述
                if (productListVo.getStatus() != null && productListVo.getStatus() > 0) {
                    productListVo.setStatusName(ProductConstant.PRODUCT_STATUS_LIST.get(productListVo.getStatus()));
                }

                // 添加人名称
                if (productListVo.getCreateUser() != null && productListVo.getCreateUser() > 0) {
                    productListVo.setCreateUserName(UserUtils.getName((productListVo.getCreateUser())));
                }
                // 更新人名称
                if (productListVo.getUpdateUser() != null && productListVo.getUpdateUser() > 0) {
                    productListVo.setUpdateUserName(UserUtils.getName((productListVo.getUpdateUser())));
                }
                productListVos.add(productListVo);
            });
        }

        return JsonResult.success("操作成功", productListVos, data.getTotal());
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
    public JsonResult edit(Product entity) {

        boolean result = false;
        if (entity.getId() != null && entity.getId() > 0) {
            // 修改记录
            // 判断是否品牌已存在
            Integer count = productMapper.selectCount(new LambdaQueryWrapper<Product>()
                    .eq(Product::getName, entity.getName())
                    .ne(Product::getId, entity.getId())
                    .eq(Product::getMark, 1));
            if (count > 0) {
                return JsonResult.error("当前品牌名已存在");
            }
            entity.setUpdateUser(ShiroUtils.getUserId());
            entity.setUpdateTime(DateUtils.now());
            result = this.updateById(entity);

        } else {
            // 新增记录
            // 判断是否用户名已存在
            Integer count = productMapper.selectCount(new LambdaQueryWrapper<Product>()
                    .eq(Product::getName, entity.getName())
                    .eq(Product::getMark, 1));
            if (count > 0) {
                return JsonResult.error("当前产品名已存在");
            }
            entity.setId(IdGenerater.generaterId("PRODUCT_ID"));
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
        Product entity = this.getById(id);
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
    public JsonResult setStatus(Product entity) {
        if (entity.getId() == null || entity.getId() <= 0) {
            return JsonResult.error("记录ID不能为空");
        }
        if (entity.getStatus() == null) {
            return JsonResult.error("记录状态不能为空");
        }
        return super.setStatus(entity);
    }
}