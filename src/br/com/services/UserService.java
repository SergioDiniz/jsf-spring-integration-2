package br.com.services;

import java.util.List;

import br.com.beans.User;

public interface UserService {

	public void add (User user);
	public User find(int id);
	public List<User> list();
	
}
