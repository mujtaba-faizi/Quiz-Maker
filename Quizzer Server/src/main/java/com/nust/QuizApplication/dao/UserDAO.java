package com.nust.QuizApplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nust.QuizApplication.model.User;


@Repository
@Transactional
public class UserDAO {
	
	@Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    public int signupUser(User user) {
        int isSuccess = (int)getSession().save(user);
        if(isSuccess >= 1){
            return user.getId();
        }else{
            return 0;
        }        
    }
    
    public boolean signinUser(User user)
    {
    	Criteria c=sessionFactory.getCurrentSession().createCriteria(User.class);   
    	c.add(Restrictions.like("username",user.getUsername()));  
    	c.add(Restrictions.like("password",user.getPassword())); 
    	List list=c.list();
    	System.out.println(list);
    	if(list.isEmpty())
    		return false;
    	else
    		return true;
    } 
	
}



