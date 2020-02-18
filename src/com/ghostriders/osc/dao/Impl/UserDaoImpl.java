package com.ghostriders.osc.dao.Impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ghostriders.osc.dao.UserDao;
import com.ghostriders.osc.entity.User;
import com.ghostriders.osc.util.HibernateUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(user);
			// commit transaction.
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null) {
				transaction.rollback();
			}
		}

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		
	}

}
