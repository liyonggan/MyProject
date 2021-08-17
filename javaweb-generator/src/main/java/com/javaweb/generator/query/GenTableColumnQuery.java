// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.generator.query;

import com.javaweb.common.common.BaseQuery;
import lombok.Data;

/**
 * <p>
 * 代码生成列查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-10
 */
@Data
public class GenTableColumnQuery extends BaseQuery {

    /**
     * 是否主键：1是 2否
     */
    private Integer isPk;

    /**
     * 是否自增：1是 2否
     */
    private Integer isIncrement;

    /**
     * 是否必填：1是 2否
     */
    private Integer isRequired;

    /**
     * 是否为插入字段：1是 2否
     */
    private Integer isInsert;

    /**
     * 是否编辑字段：1是 2否
     */
    private Integer isEdit;

    /**
     * 是否列表字段：1是 2否
     */
    private Integer isList;

    /**
     * 是否查询字段：1是 2否
     */
    private Integer isQuery;

}
