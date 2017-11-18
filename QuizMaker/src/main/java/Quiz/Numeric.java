package Quiz;

public class Numeric {

	private int ans;
	private String ques;
	private int quizID;
	private int index;   //primary key
	
	public Numeric(int a, int b, String c, int d){
		quizID=a;
		index=b;
		ques=c;
		ans=d;
	}
	
	public int getAns(){
		return ans;
	}

	public String getQues(){
		return ques;
	}
	
	public int getquizID(){
		return quizID;
	}
	
	public int getindex(){
		return index;
	}
}
