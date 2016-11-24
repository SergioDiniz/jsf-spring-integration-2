package br.com.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.UploadedFile;
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
	private UploadedFile file;
	
	public UserController() {
		// TODO Auto-generated constructor stub
		this.user = new User();
	}

	
	public void addUser() throws IOException{
		
		File root = new File("/Users/sergiodiniz/uploads/");
		String nomeArquivo = this.file.getFileName();
		String formatoArquivo = nomeArquivo.substring(nomeArquivo.lastIndexOf("."), nomeArquivo.length());
		nomeArquivo = System.currentTimeMillis() + formatoArquivo;
		
		
		FileInputStream input = (FileInputStream) file.getInputstream();
		FileOutputStream out = new FileOutputStream(new File(root, nomeArquivo));
		
		byte[] buffer = new byte[(int) file.getSize()];
		int contador = 0;
		while((contador = input.read(buffer)) != -1){
			out.write(buffer, 0, contador);
		}
		input.close();
		out.close();
		
		this.user.setArquivo(nomeArquivo);
		this.user.setTipoArquivo(formatoArquivo);
		System.out.println(this.user.getNome());
		userService.add(this.user);
		this.user = new User();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public UploadedFile getFile() {
		return file;
	}


	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	
	
}
