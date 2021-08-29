package com.javaweb.system.controller;


import com.javaweb.common.annotation.Log;
import com.javaweb.common.common.BaseController;
import com.javaweb.common.enums.BusinessType;
import com.javaweb.common.utils.JsonResult;
import com.javaweb.common.utils.StringUtils;
import com.javaweb.system.entity.Product;
import com.javaweb.system.entity.User;
import com.javaweb.system.query.BrandQuery;
import com.javaweb.system.query.ProductQuery;
import com.javaweb.system.query.UserQuery;
import com.javaweb.system.service.IBrandService;
import com.javaweb.system.service.IProductService;
import com.javaweb.system.service.IUserRoleService;
import com.javaweb.system.service.IUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 后台产品管理表 前端控制器
 * </p>
 *
 * @author
 * @since 2021-01-28
 */
@Controller
@RequestMapping("/product")
public class ProductController extends BaseController {

    @Autowired
    private IProductService productService;

    @Autowired
    private IBrandService brandService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @RequiresPermissions("sys:product:list")
    @ResponseBody
    @PostMapping("/brand/list")
    public JsonResult list(BrandQuery query) {
        return brandService.getList(query);
    }

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    @RequiresPermissions("sys:product:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(ProductQuery query) {
        return productService.getList(query);
    }

    /**
     * 添加记录
     *
     * @param entity 实体对象
     * @return
     */
    @RequiresPermissions("sys:product:add")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @ResponseBody
    @PostMapping("/add")
    public JsonResult add(@RequestBody Product entity) {
        return productService.edit(entity);
    }

    /**
     * 修改记录
     *
     * @param entity 实体对象
     * @return
     */
    @RequiresPermissions("sys:product:update")
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @ResponseBody
    @PostMapping("/update")
    public JsonResult update(@RequestBody Product entity) {
        return productService.edit(entity);
    }

    /**
     * 获取记录详情
     *
     * @param id    记录ID
     * @param model 模型
     * @return
     */
    @Override
    public String edit(Integer id, Model model) {
        Map<String, Object> info = new HashMap<>();
        if (id != null && id > 0) {
            info = productService.info(id);


        }
        model.addAttribute("info", info);
        return super.edit(id, model);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
    @RequiresPermissions("sys:product:delete")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return productService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
    @RequiresPermissions("sys:product:dall")
    @Log(title = "用户管理", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return productService.deleteByIds(ids);
    }

    /**
     * 设置状态
     *
     * @param entity 实体对象
     * @return
     */
    @RequiresPermissions("sys:product:status")
    @Log(title = "用户管理", businessType = BusinessType.STATUS)
    @ResponseBody
    @PostMapping("/setStatus")
    public JsonResult setStatus(@RequestBody Product entity) {
        return productService.setStatus(entity);
    }

}
