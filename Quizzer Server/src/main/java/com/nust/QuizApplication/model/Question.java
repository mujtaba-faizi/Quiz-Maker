package com.nust.QuizApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)  
public class Question {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)		
		private int id;
		private String question;
		
	    @ManyToOne
	    @JoinColumn(name="quiz_id")
	    private Quiz quiz;

		public void setId(int ID)
		{
			this.id = ID;
		}
		
		
	    public void setQuestion(String str) {
	        this.question=str;
	    }
	    
	    public void setQuiz(Quiz quiz)
	    {
	    	this.quiz = quiz;
	    }
	    
	    public Quiz getQuiz()
	    {
	    	return quiz;
	    }
	    
	    public String getQuestion(){
	        return question;
	    }
	    
	    public int getId()
	    {
	    	return id;
	    }
}
