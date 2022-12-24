package com.backend.api.services;

import com.backend.api.models.User;

public interface UserService {
	
	Iterable<User> list();
	
	User create(User user);
}
