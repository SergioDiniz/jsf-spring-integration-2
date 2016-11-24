package br.com.dao;

import java.util.List;

import br.com.beans.User;

public interface UserDao {

	void add (User user);
	User find(int id);
	List<User> list();
	
}
