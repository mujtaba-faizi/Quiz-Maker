package DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;

import Model.Quiz;
import Util.HibernateUtil;

public class QuizDAO {
	static ServiceRegistry  serviceRegistry ;
	static SessionFactory sessionFactory;
    static Session session;
	
	public QuizDAO(){
		// TODO Auto-generated method stub
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        //nested Transactions are not supported. Once you have started transaction here
        // can't do that in the save method.
        //session.beginTransaction();
	}
	
	public void save(List<Quiz> employeeRoster){
		Transaction t=session.beginTransaction();  
            session.persist(employeeRoster);
      		t.commit(); 
	}
	
	public void closeSession()
	{
        session.close();
        sessionFactory.close();
	}

}
