package com.nust.QuizApplication.dao;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nust.QuizApplication.model.Question;

@Repository
@Transactional
public class QuestionDAO {
	@Autowired
  private SessionFactory sessionFactory;

  private Session getSession() {
      return sessionFactory.getCurrentSession();
  }

  public int save(Question ques) {
	  
      int isSuccess = (int)getSession().save(ques);

      if(isSuccess >= 1){
          return ques.getId();
      }else{
          return 0;
      }        
  }
}
