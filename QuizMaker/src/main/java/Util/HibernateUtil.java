package Util;


import Model.Numeric;
import Model.TrueFalse;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Model.MCQ;
import Model.Quiz;
import Model.User;

public class HibernateUtil {

	// A SessionFactory is set up once for an application!
        private static SessionFactory sessionFactory=null;

private static SessionFactory buildSessionFactory() {

    try {
        Configuration cfg = new Configuration();
        
        cfg.addAnnotatedClass(User.class);
        cfg.addAnnotatedClass(Quiz.class);
        cfg.addAnnotatedClass(MCQ.class);
        cfg.addAnnotatedClass(Numeric.class);
        cfg.addAnnotatedClass(TrueFalse.class);
        cfg.configure();
        sessionFactory = cfg.buildSessionFactory();
        return sessionFactory;
        
    }
    catch (Exception e) {
        // The registry would be destroyed by the SessionFactory, but I had trouble building the SessionFactory
        // so destroy it manually.
        
        throw new ExceptionInInitializerError(e);
    }
}

public static SessionFactory getSessionFactory() {
    if(sessionFactory==null){
        buildSessionFactory();
    }
    return sessionFactory;
}
}