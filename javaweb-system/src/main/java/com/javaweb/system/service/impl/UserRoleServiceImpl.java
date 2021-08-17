package com.javaweb.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javaweb.system.entity.Role;
import com.javaweb.system.entity.UserRole;
import com.javaweb.system.mapper.UserRoleMapper;
import com.javaweb.system.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 人员角色表 服务实现类
 * </p>
 *
 * @author 鲲鹏
 * @since 2021-01-28
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

    /**
     * 根据用户ID获取角色ID
     *
     * @param userId 用户ID
     * @return
     */
    @Override
    public List<String> getRoleIdsByUserId(Integer userId) {
        QueryWrapper<UserRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        queryWrapper.eq("mark", 1);
        List<UserRole> userRoleList = list(queryWrapper);
        List<String> stringList = new ArrayList<>();
        if (!userRoleList.isEmpty()) {
            userRoleList.forEach(item -> {
                stringList.add(item.getRoleId().toString());
            });
        }
        return stringList;
    }
}
