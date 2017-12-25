package Model;

public class MCQ {

	private String ans;
	private String ques;
	private String MCQ1;
	private String MCQ2;
	private String MCQ3;
	private String MCQ4;
	private int quizID;  //act as foreign key for table "Quiz"
	private int index;   //primary key
	private final String type="MCQ";  //which type of question
	
	public MCQ(int g, int h,String a, String b, String c, String d, String e, String f) {
		setQuizID(g);
		setIndex(h);
		setQues(a);
		setAns(b);
		setMCQ1(c);
		setMCQ2(d);
		setMCQ3(e);
		setMCQ4(f);
	}


	/**
	 * @return the mCQ1
	 */
	public String getMCQ1() {
		return MCQ1;
	}


	/**
	 * @param mCQ1 the mCQ1 to set
	 */
	public void setMCQ1(String mCQ1) {
		MCQ1 = mCQ1;
	}


	/**
	 * @return the ques
	 */
	public String getQues() {
		return ques;
	}


	/**
	 * @param ques the ques to set
	 */
	public void setQues(String ques) {
		this.ques = ques;
	}


	/**
	 * @return the ans
	 */
	public String getAns() {
		return ans;
	}


	/**
	 * @param b the ans to set
	 */
	public void setAns(String b) {
		this.ans = b;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @return the mCQ2
	 */
	public String getMCQ2() {
		return MCQ2;
	}


	/**
	 * @param mCQ2 the mCQ2 to set
	 */
	public void setMCQ2(String mCQ2) {
		MCQ2 = mCQ2;
	}


	/**
	 * @return the mCQ3
	 */
	public String getMCQ3() {
		return MCQ3;
	}


	/**
	 * @param mCQ3 the mCQ3 to set
	 */
	public void setMCQ3(String mCQ3) {
		MCQ3 = mCQ3;
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
	 * @return the mCQ4
	 */
	public String getMCQ4() {
		return MCQ4;
	}


	/**
	 * @param mCQ4 the mCQ4 to set
	 */
	public void setMCQ4(String mCQ4) {
		MCQ4 = mCQ4;
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

}
