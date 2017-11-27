package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;

import Model.Numeric;
import Util.HibernateUtil;

public class NumericDAO {
	static ServiceRegistry  serviceRegistry ;
	static SessionFactory sessionFactory;
    static Session session;
	
	public NumericDAO(){
		// TODO Auto-generated method stub
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        //nested Transactions are not supported. Once you have started transaction here
        // can't do that in the save method.
        //session.beginTransaction();
	}
	
	public void save(List<Numeric> alpha){
		Transaction t=session.beginTransaction();  
            session.persist(alpha);
      		t.commit(); 
	}

	public void closeSession()
	{
        session.close();
        sessionFactory.close();
	}

}
