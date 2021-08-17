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

import com.javaweb.system.entity.LayoutDesc;
import com.javaweb.common.common.IBaseService;

/**
 * <p>
 * 布局描述 服务类
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
public interface ILayoutDescService extends IBaseService<LayoutDesc> {

    /**
     * 根据ID获取位置描述
     * @param itemId 页面位置ID
     * @param locId 位置ID
     * @return
     */
    LayoutDesc getLocDescById(Integer itemId, Integer locId);

}