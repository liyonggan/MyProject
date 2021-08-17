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
 * 系统消息查询条件
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-04
 */
@Data
public class MessageQuery extends BaseQuery {

    /**
     * 消息标题
     */
    private String title;

    /**
     * 发送方式：1系统 2短信 3邮件 4微信 5推送
     */
    private Integer type;

    /**
     * 发送状态：1已发送 2未发送
     */
    private Integer sendStatus;

}
