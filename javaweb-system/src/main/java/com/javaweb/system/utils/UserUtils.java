// +----------------------------------------------------------------------
// | JavaWeb混编版框架 [ JavaWeb ]
// +----------------------------------------------------------------------
// | 版权所有 2019~2020 南京JavaWeb研发中心
// +----------------------------------------------------------------------
// | 官方网站: http://www.javaweb.vip/
// +----------------------------------------------------------------------
// | 作者: 鲲鹏 <1175401194@qq.com>
// +----------------------------------------------------------------------

package com.javaweb.system.utils;

import com.javaweb.common.utils.SpringUtils;
import com.javaweb.system.entity.User;
import com.javaweb.system.mapper.UserMapper;

public class UserUtils {

    /**
     * 根据ID获取人员名称
     *
     * @param id 人员ID
     * @return
     */
    public static String getName(Integer id) {
        UserMapper userMapper = SpringUtils.getBean(UserMapper.class);
        User user = userMapper.selectById(id);
        return user.getRealname();
    }
}
