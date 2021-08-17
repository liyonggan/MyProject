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

import com.javaweb.common.common.IBaseService;
import com.javaweb.common.utils.JsonResult;
import com.javaweb.system.entity.Config;

import java.util.Map;


/**
 * <p>
 * 系统配置 服务类
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
public interface IConfigWebService {

    /**
     * 编辑配置信息
     *
     * @param map 参数
     * @return
     */
    JsonResult configEdit(Map<String, Object> map);

}