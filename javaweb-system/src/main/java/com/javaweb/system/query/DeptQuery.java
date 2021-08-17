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
 * 部门查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
public class DeptQuery extends BaseQuery {

    /**
     * 部门名称
     */
    private String name;

    /**
     * 类型：1公司 2部门
     */
    private Integer type;

    /**
     * 是否有子级：1是 2否
     */
    private Integer hasChild;

}
