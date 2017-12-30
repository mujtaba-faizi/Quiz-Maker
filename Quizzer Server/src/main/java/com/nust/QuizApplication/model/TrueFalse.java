package com.nust.QuizApplication.model;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="Question_index")
public class TrueFalse extends Question{

	private String ans;
	private String ques;
	
    @Override
    public String getQuestion(){return ques;}
    @Override
    public void setQuestion(String ques){
        this.ques=ques;
    }

	/**
	 * @return the ans
	 */
	public String getAns() {
		return ans;
	}

	/**
	 * @param d the ans to set
	 */
	public void setAns(String d) {
		this.ans = d;
	}
}