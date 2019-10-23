package com.springboot.auth.authorization.service.impl;

import com.springboot.auth.authorization.entity.User;
import com.springboot.auth.authorization.provider.OrganizationProvider;
import com.springboot.auth.authorization.service.IUserService;
import com.springboot.cloud.common.core.entity.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private OrganizationProvider organizationProvider;

    @Override
    public User getByUniqueId(String uniqueId) {
        Result<User> userByUniqueId = organizationProvider.getUserByUniqueId(uniqueId);
        return  userByUniqueId.getData();
    }
}
