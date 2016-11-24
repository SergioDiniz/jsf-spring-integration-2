package br.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.beans.User;
import br.com.dao.UserDao;

@Component
@Service("userService")
public class UserServiceImp implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public User find(int id) {
		return userDao.find(id);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

}
