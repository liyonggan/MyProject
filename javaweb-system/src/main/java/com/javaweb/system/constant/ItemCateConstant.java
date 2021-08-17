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
 * 栏目 模块常量
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
public class ItemCateConstant {

    /**
     * 有无封面
     */
    public static Map<Integer, String> ITEMCATE_ISCOVER_LIST = new HashMap<Integer, String>() {
        {
            put(1, "有");
            put(2, "无");
        }
    };
    /**
     * 状态
     */
    public static Map<Integer, String> ITEMCATE_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "启用");
            put(2, "停用");
        }
    };
}