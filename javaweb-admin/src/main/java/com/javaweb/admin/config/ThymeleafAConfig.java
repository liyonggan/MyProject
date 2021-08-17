// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.admin.config;

import com.javaweb.admin.constant.*;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Thymeleaf模板配置
 */
@Configuration
public class ThymeleafAConfig {

    @Resource
    private void configureThymeleafStaticVars(ThymeleafViewResolver viewResolver) {
        if (viewResolver != null) {
            Map<String, Object> vars = new HashMap<>();

            /**
             * 会员性别
             */
            vars.put("MEMBER_GENDER_LIST", MemberConstant.MEMBER_GENDER_LIST);
            /**
             * 会员设备类型
             */
            vars.put("MEMBER_DEVICE_LIST", MemberConstant.MEMBER_DEVICE_LIST);
            /**
             * 会员登陆状态
             */
            vars.put("MEMBER_LOGINSTATUS_LIST", MemberConstant.MEMBER_LOGINSTATUS_LIST);
            /**
             * 会员注册来源
             */
            vars.put("MEMBER_SOURCE_LIST", MemberConstant.MEMBER_SOURCE_LIST);
            /**
             * 会员状态
             */
            vars.put("MEMBER_STATUS_LIST", MemberConstant.MEMBER_STATUS_LIST);
            viewResolver.setStaticVariables(vars);
        }
    }
}
