package br.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.beans.User;
import br.com.dao.UserDao;

@Service("userService")
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public void add(User user) {
		dao.add(user);
	}

	@Override
	public User find(int id) {
		return dao.find(id);
	}

	@Override
	public List<User> list() {
		return dao.list();
	}

}
