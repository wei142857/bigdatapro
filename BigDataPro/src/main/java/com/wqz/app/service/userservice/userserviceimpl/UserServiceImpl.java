package com.wqz.app.service.userservice.userserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wqz.app.dao.usermapper.UserMapper;
import com.wqz.app.entity.User;
import com.wqz.app.service.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;
	
	@Override
	public void saveUser(User user) {
		mapper.saveUser(user);
	}

}
