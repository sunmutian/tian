package com.tian.service;

import com.tian.dto.User;

/**
 * 欢迎关注公众号：java后端技术全栈
 *
 * @author 田维常
 * @date 2020/11/13 14:43
 */
public interface UserService {

    User findByUserId(Long userId);
}
