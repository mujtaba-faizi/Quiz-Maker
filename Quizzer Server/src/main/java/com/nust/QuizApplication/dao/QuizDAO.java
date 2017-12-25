package com.nust.QuizApplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nust.QuizApplication.model.Quiz;


@Repository
@Transactional
public class QuizDAO {
	@Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public int save(Quiz quiz) {
        int isSuccess = (int)getSession().save(quiz);
        if(isSuccess >= 1){
            return (int) quiz.getId();
        }else{
            return 0;
        }        
    }
    
    public List<Quiz> retrieveAllQuizzes()
    {
    	Criteria criteria = getSession().createCriteria(Quiz.class);
    	return (List<Quiz>)criteria.list();
    }
}

