package com.tian.service.impl;

import com.tian.dto.User;
import com.tian.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 欢迎关注公众号：java后端技术全栈
 *
 * @author 田维常
 * @date 2020/11/13 14:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByUserId(Long userId) {
        // TODO: 2020/11/13 业务逻辑
        return new User(10000L,"老田");
    }
}
