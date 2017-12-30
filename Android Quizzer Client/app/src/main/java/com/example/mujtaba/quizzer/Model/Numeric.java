package com.example.mujtaba.quizzer.Model;

/**
 * Created by Mujtaba on 12/17/2017.
 */
public class Numeric extends Question{

    private int ans;
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
    public int getAns() {
        return ans;
    }

    /**
     * @param d the ans to set
     */
    public void setAns(int d) {
        this.ans = d;
    }

}
