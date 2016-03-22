package com.web.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.web.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	
//	include sl4j jars
//	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	 
	    private SessionFactory sessionFactory;
	     
	    public void setSessionFactory(SessionFactory sf){
	        this.sessionFactory = sf;
	    }

	@Override
	public void addUser(User user) {
		  Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
//        logger.info("Person saved successfully, user Details="+p);
		
	}

}
