package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;

import Model.User;
import Util.HibernateUtil;

public class UserDAO {
	static ServiceRegistry  serviceRegistry ;
	static SessionFactory sessionFactory;
    static Session session;
	
	public UserDAO(){
		// TODO Auto-generated method stub
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        //nested Transactions are not supported. Once you have started transaction here
        // can't do that in the save method.
        //session.beginTransaction();
	}
	
	public void save(List<User> newEmpList){
		Transaction t=session.beginTransaction();  
        for (User newEmpList1 : newEmpList) {
            session.persist( newEmpList1);
        }
  		t.commit(); 
	}

	
	public void closeSession()
	{
        session.close();
        sessionFactory.close();
	}



}
