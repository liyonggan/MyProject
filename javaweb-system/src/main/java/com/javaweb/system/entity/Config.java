// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.javaweb.common.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * <p>
 * 系统配置
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_config")
public class Config extends BaseEntity {

    /**
     * 配置标题
     */
    private String title;

    /**
     * 配置标签符
     */
    private String tag;

    /**
     * 配置值
     */
    private String value;

    /**
     * 配置项
     */
    private String options;

    /**
     * 配置分组ID
     */
    private Integer groupId;

    /**
     * 配置类型：hidden=隐藏 readonly=只读文本 number=数字 text=单行文本 textarea=多行文本 array=数组 password=密码 radio=单选框 checkbox=复选框 select=下拉框 icon=字体图标 date=日期 datetime=时间 image=单张图片 images=多张图片 file=单个文件 files=多个文件 ueditor=富文本编辑器 json=JSON
     */
    private String type;

    /**
     * 状态：1正常 2停用
     */
    private Integer status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 配置说明
     */
    private String note;

}