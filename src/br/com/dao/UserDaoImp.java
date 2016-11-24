package br.com.dao;

import java.util.Calendar;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import br.com.beans.User;

@Repository("userDao")
public class UserDaoImp implements UserDao {

	private Session session;
	
	public UserDaoImp() {
		this.session = new Configuration().configure().buildSessionFactory().openSession();
	}
	
	@Override
	public void add(User user) {
		user.setDataup(Calendar.getInstance());
		user.setDownloads(0);
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
		
	}

	@Override
	public User find(int id) {
		User u = new User();
		session.beginTransaction();
		u = session.find(User.class, id);
		session.getTransaction().commit();
		return u;
	}

	@Override
	public List<User> list() {
		Query<User> query = session.createQuery("from User");
		List<User> list = query.getResultList();
		return list;
	}

}
