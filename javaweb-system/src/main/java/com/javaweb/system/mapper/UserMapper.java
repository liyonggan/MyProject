package com.javaweb.system.mapper;

import com.javaweb.system.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 后台用户管理表 Mapper 接口
 * </p>
 *
 * @author 鲲鹏
 * @since 2021-01-28
 */
public interface UserMapper extends BaseMapper<User> {

    User queryUserByName(@Param("userName") String userName, @Param("mark") int mark);

    User selectById(@Param("id") int id);
}
