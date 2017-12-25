package com.nust.QuizApplication.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Question_index")
public class Num extends Question{

	private int ans;

	/**
	 * @return the ans
	 */
	public int getAns() {
		return ans;
	}

	/**
	 * @param ans the ans to set
	 */
	public void setAns(int ans) {
		this.ans = ans;
	}
}
