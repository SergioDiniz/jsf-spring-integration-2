package br.com.beans;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="users")
public class User {

	@Id @GeneratedValue
	private int id;
	private String nome;
	private String arquivo;
	private String tipoArquivo;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataup;
	private int downloads;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArquivo() {
		return arquivo;
	}
	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public String getTipoArquivo() {
		return tipoArquivo;
	}
	public void setTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}
	public Calendar getDataup() {
		return dataup;
	}
	public void setDataup(Calendar dataup) {
		this.dataup = dataup;
	}
	public int getDownloads() {
		return downloads;
	}
	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}
	
	
	
	
}
