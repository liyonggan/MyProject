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
 * 部门 模块常量
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
public class DeptConstant {

    /**
     * 类型
     */
    public static Map<Integer, String> DEPT_TYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "公司");
            put(2, "部门");
        }
    };
    /**
     * 是否有子级
     */
    public static Map<Integer, String> DEPT_HASCHILD_LIST = new HashMap<Integer, String>() {
        {
            put(1, "是");
            put(2, "否");
        }
    };
}