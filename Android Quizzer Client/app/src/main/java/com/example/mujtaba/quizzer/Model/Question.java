package com.example.mujtaba.quizzer.Model;

/**
 * Created by Mujtaba on 12/30/2017.
 */

public class Question {
    private int id;
    private String question;
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

