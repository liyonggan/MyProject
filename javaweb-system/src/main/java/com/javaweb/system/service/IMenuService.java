// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.service;

import com.javaweb.system.entity.Menu;
import com.javaweb.common.common.IBaseService;
import com.javaweb.system.vo.MenuListVo;

import java.util.List;

/**
 * <p>
 * 菜单 服务类
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-07
 */
public interface IMenuService extends IBaseService<Menu> {

    /**
     * 根据用户ID获取菜单权限
     *
     * @param userId 用户ID
     * @return
     */
    List<Menu> getMenuListByUserId(Integer userId);

    /**
     * 获取导航菜单
     *
     * @param userId 人员ID
     * @return
     */
    List<MenuListVo> getNavbarMenu(Integer userId);
}