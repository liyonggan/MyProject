// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.query;

import com.javaweb.common.common.BaseQuery;
import lombok.Data;

/**
 * <p>
 * 站点查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Data
public class ItemQuery extends BaseQuery {

    /**
     * 站点名称
     */
    private String name;

    /**
     * 站点类型:1普通站点 2其他
     */
    private Integer type;

    /**
     * 是否二级域名:1是 2否
     */
    private Integer isDomain;

    /**
     * 状态：1在用 2停用
     */
    private Integer status;

}
