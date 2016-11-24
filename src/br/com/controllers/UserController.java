package br.com.controllers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.beans.User;
import br.com.services.UserService;

@Component
@ManagedBean
@RequestScoped
public class UserController{

	@Autowired
	UserService userService;

	private User user;
	
	
	public UserController() {
		// TODO Auto-generated constructor stub
		this.user = new User();
	}

	
	public void addUser(){
		System.out.println(this.user.getNome());
		userService.add(new User());
		this.user = new User();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
