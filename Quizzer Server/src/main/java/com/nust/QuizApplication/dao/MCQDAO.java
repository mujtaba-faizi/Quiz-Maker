package com.nust.QuizApplication.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nust.QuizApplication.model.MCQ;

@Repository
@Transactional
public class MCQDAO {
	@Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
	public String save(MCQ mcq){
		int isSuccess = (int)getSession().save(mcq); 
       if(isSuccess >= 1)	return "Successful";
       else	return "Unsuccessful";    
    }      
}
