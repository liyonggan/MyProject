// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 站点 模块常量
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
public class ItemConstant {

    /**
     * 站点类型
     */
    public static Map<Integer, String> ITEM_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "普通站点");
            put(2, "其他");
        }
    };
    /**
     * 是否二级域名
     */
    public static Map<Integer, String> ITEM_ISDOMAIN_LIST = new HashMap<Integer, String>() {
        {
            put(1, "是");
            put(2, "否");
        }
    };
    /**
     * 状态
     */
    public static Map<Integer, String> ITEM_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "在用");
            put(2, "停用");
        }
    };
}