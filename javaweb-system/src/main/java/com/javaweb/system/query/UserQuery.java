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
 * 用户查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-04-20
 */
@Data
public class UserQuery extends BaseQuery {

    /**
     * 姓名/手机号
     */
    private String keywords;

    /**
     * 性别:1男 2女 3保密
     */
    private Integer gender;

    /**
     * 状态：1正常 2禁用
     */
    private Integer status;

}
