package com.springboot.auth.authorization.provider;

import com.springboot.auth.authorization.entity.Role;
import com.springboot.auth.authorization.entity.User;
import com.springboot.cloud.common.core.entity.vo.Result;

import java.util.HashSet;
import java.util.Set;

public class OrganizationProviderFallback implements OrganizationProvider {

    @Override
    public Result<User> getUserByUniqueId(String uniqueId) {
        System.out.println("11111111111111111");
        return Result.success(new User());
    }

    @Override
    public Result<Set<Role>> queryRolesByUserId(String userId) {
        return Result.success(new HashSet<Role>());
    }
}
