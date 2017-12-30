package com.example.mujtaba.quizzer.Model;

/**
 * Created by Mujtaba on 12/17/2017.
 */

public class Quiz {

    private int marks;  //assuming each question carries 5 score
    private int id;          //primary key
    private String title;
    private String description;
    private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user){this.user=user;}


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the iD
     */
    public int getID() {
        return id;
    }

    /**
     * @param iD the iD to set
     */
    public void setID(int iD) {
        id = iD;
    }

}