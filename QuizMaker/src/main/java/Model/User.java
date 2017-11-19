package Model;

public class User {
private String username;
private String password;
private String role;

public User(String a, String b, String c){
	setUsername(a);
	setPassword(b);
	setRole(c);
}

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

}
