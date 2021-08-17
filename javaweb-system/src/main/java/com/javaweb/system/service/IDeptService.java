package com.javaweb.system.service;

import com.javaweb.common.common.IBaseService;
import com.javaweb.system.entity.Dept;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 部门表 服务类
 * </p>
 *
 * @author 鲲鹏
 * @since 2021-01-28
 */
public interface IDeptService extends IBaseService<Dept> {

    /**
     * 根据部门ID获取部门名称
     *
     * @param deptId     部门ID
     * @param delimiter 拼接字符
     * @return
     */
    String getDeptNameById(Integer deptId, String delimiter);

}
