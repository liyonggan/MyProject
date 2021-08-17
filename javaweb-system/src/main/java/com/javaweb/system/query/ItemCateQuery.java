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
 * 栏目查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
public class ItemCateQuery extends BaseQuery {

    /**
     * 上级ID
     */
    private Integer pid;

    /**
     * 栏目名称
     */
    private String name;

    /**
     * 有无封面:1有 2无
     */
    private Integer isCover;

    /**
     * 状态：1启用 2停用
     */
    private Integer status;

}
