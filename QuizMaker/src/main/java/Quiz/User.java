package Quiz;

public class User {
private String username;
private String password;
private String role;
private int score;

public User(String a, String b, String c){
	username=a;
	password=b;
	role=c;
}

public String getUsername() {
	return username;
}

public String getPass() {
	return password;
}

public String getRole() {
	return role;
}

}
