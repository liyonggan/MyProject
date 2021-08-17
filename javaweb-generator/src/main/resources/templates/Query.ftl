// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package ${packageName}.query;

import com.javaweb.common.common.BaseQuery;
import lombok.Data;

/**
 * <p>
 * ${tableAnnotation}查询条件
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Data
public class ${entityName}Query extends BaseQuery {

<#if model_column?exists>
    <#list model_column as model>
    <#if model.columnName = 'name'>
    /**
     * ${model.columnComment}
     */
    private String ${model.changeColumnName?uncap_first};

    </#if>
    <#if model.columnName = 'title'>
    /**
     * ${model.columnComment}
     */
    private String ${model.changeColumnName?uncap_first};

    </#if>
    <#if model.columnName = 'mobile'>
    /**
     * ${model.columnComment}
     */
    private String ${model.changeColumnName?uncap_first};

    </#if>
    <#if model.hasColumnCommentValue = true>
    /**
     * ${model.columnComment}
     */
    <#if model.columnNumberValue = true>
    private Integer ${model.changeColumnName?uncap_first};
    <#else>
    private String ${model.changeColumnName?uncap_first};
    </#if>

    </#if>
    </#list>
</#if>
}
