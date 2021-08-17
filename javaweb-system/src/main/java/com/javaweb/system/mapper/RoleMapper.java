// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.mapper;

import com.javaweb.system.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 系统角色 Mapper 接口
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据人员ID获取角色列表
     *
     * @param userId 人员ID
     * @return
     */
    List<Role> getRoleListByUserId(@Param("userId") Integer userId);

}
