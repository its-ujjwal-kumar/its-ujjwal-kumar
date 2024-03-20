package ourproject.com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ourproject.com.model.Receptionist;
import ourproject.com.model.Room;
import ourproject.com.model.User;

	public class HibernateUtil
	{
		private final static  SessionFactory  sessionFactory=buildSessionFactory();
		private static SessionFactory buildSessionFactory() {
	   
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            return new Configuration().configure("Hotel.cfg.xml")
	            		
	            		.addAnnotatedClass(User.class)
	            		.addAnnotatedClass(Receptionist.class)
	            		.addAnnotatedClass(Room.class)
	            		.buildSessionFactory();
	            
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	    
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	    public static Session getSesssion()
	    {
	    	return getSessionFactory().openSession(); //Session opened
	    }

			    }