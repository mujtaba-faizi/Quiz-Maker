package com.nust.QuizApplication.model;

import javax.persistence.*;

@Entity
public class User {
private String username;
private String password;
private String role;
private int score;
@GeneratedValue(strategy = GenerationType.IDENTITY)   //strategy identity indicates autoincrement 
@Id
private int id;   //primary key


/**
 * @return the username
 */
public String getUsername() {
	return username;
}

/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}

/**
 * @return the password
 */
public String getPassword() {
	return password;
}

/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}

/**
 * @return the role
 */
public String getRole() {
	return role;
}

/**
 * @param role the role to set
 */
public void setRole(String role) {
	this.role = role;
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the score
 */
public int getScore() {
	return score;
}

/**
 * @param score the score to set
 */
public void setScore(int score) {
	this.score = score;
}

}
