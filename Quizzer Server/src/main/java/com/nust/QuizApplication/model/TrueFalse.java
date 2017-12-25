package com.nust.QuizApplication.model;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="Question_index")
public class TrueFalse extends Question{

	private String ans;

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