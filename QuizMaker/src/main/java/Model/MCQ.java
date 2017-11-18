package Model;

public class MCQ {

	private int ans;
	private String ques;
	private String MCQ1;
	private String MCQ2;
	private String MCQ3;
	private String MCQ4;
	private int quizID;  //act as foreign key for table "Quiz"
	private int index;   //primary key
	
	public MCQ(int g, int h, String a, int b, String c, String d, String e, String f) {
		quizID=g;
		index=h;
		ques=a;
		ans=b;
		MCQ1=c;
		MCQ2=d;
		MCQ3=e;
		MCQ4=f;
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
	
	public String getMCQ1(){
		return MCQ1;
	}
	
	public String getMCQ2(){
		return MCQ2;
	}
	
	public String getMCQ3(){
		return MCQ3;
	}
	
	public String getMCQ4(){
		return MCQ4;
	}

}
