package Model;

public class TrueFalse {

	private int ans;
	private String ques;
	private int quizID;
	private int index;   //primary key
	private final String type="TF";
	
	public TrueFalse(int a, int b, String c, int d){
		setQuizID(a);
		setIndex(b);
		setQues(c);
		setAns(d);
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
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
	public int getAns() {
		return ans;
	}

	/**
	 * @param ans the ans to set
	 */
	public void setAns(int ans) {
		this.ans = ans;
	}
}