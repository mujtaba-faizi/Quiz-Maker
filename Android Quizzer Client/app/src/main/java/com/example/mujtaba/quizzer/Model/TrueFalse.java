package com.example.mujtaba.quizzer.Model;

/**
 * Created by Mujtaba on 12/17/2017.
 */

public class TrueFalse extends Question{

    private String ans;
    private int quizID;
    private int index;   //primary key
    private String ques;

    @Override
    public String getQuestion(){return ques;}
    @Override
    public void setQuestion(String ques){
        this.ques=ques;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the quizID
     */
    public int getQuizID() {
        return quizID;
    }

    /**
     * @param quizID the quizID to set
     */
    public void setQuizID(int quizID) {
        this.quizID = quizID;
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