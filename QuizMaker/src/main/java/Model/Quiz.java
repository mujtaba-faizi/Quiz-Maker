package Model;

public class Quiz {

	private int totalScore;  //assuming each question carries 5 score
	private int ID;          //primary key
	private String title;
	private String desc;
	
	public Quiz(int a, int b,String c, String d){
		totalScore=b;
		ID=a;
		title=c;
		desc=d;
	}
	
	public int getScore() {
		return totalScore;
	}
	
	public int getID() {
		return ID;
	}
	
	public String gettitle() {
		return title;
	}
	
	public String getdesc() {
		return desc;
	}
}
