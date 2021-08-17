// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.common.common;

import lombok.Data;

/**
 * 查询对象基类
 */
@Data
public class BaseQuery {
    /**
     * 页码(默认1)
     */
    private Integer page = 1;

    /**
     * 每页数(默认：20)
     */
    private Integer limit = 20;
}
