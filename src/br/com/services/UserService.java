package br.com.services;

import java.util.List;

import br.com.beans.User;

public interface UserService {

	void add (User user);
	User find(int id);
	List<User> list();
	
}
