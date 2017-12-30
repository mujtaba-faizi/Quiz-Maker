package com.nust.QuizApplication.model;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="Question_index")
public class MCQ extends Question{
	
	private int ans;
	private String MCQ1;
	private String MCQ2;
	private String MCQ3;
	private String MCQ4;
	private String ques;
	
    @Override
    public String getQuestion(){return ques;}
    @Override
    public void setQuestion(String ques){
        this.ques=ques;
    }
	/**
	 * @return the mCQ1
	 */
	public String getMCQ1() {
		return MCQ1;
	}

	/**
	 * @param mCQ1 the mCQ1 to set
	 */
	public void setMCQ1(String mCQ1) {
		MCQ1 = mCQ1;
	}

	/**
	 * @return the ans
	 */
	public int getAns() {
		return ans;
	}


	/**
	 * @param b the ans to set
	 */
	public void setAns(int b) {
		this.ans = b;
	}

	/**
	 * @return the mCQ2
	 */
	public String getMCQ2() {
		return MCQ2;
	}


	/**
	 * @param mCQ2 the mCQ2 to set
	 */
	public void setMCQ2(String mCQ2) {
		MCQ2 = mCQ2;
	}


	/**
	 * @return the mCQ3
	 */
	public String getMCQ3() {
		return MCQ3;
	}


	/**
	 * @param mCQ3 the mCQ3 to set
	 */
	public void setMCQ3(String mCQ3) {
		MCQ3 = mCQ3;
	}


	/**
	 * @return the mCQ4
	 */
	public String getMCQ4() {
		return MCQ4;
	}


	/**
	 * @param mCQ4 the mCQ4 to set
	 */
	public void setMCQ4(String mCQ4) {
		MCQ4 = mCQ4;
	}

}
