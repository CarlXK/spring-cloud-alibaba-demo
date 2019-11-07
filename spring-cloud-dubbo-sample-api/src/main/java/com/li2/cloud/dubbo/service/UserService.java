package com.li2.cloud.dubbo.service;

import com.li2.cloud.dubbo.domain.User;

import java.util.Collection;

/**
 * {@link User} Service.
 *
 */
public interface UserService {

	boolean save(User user);

	boolean remove(Long userId);

	Collection<User> findAll();
}
