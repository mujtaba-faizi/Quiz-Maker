package Model;

import javax.persistence.*;

@Entity
public class Numeric {

	private String ans;
	private String ques;
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Id
	private int index;   //primary key
	@JoinColumn(name = "quiz_id")
	private Quiz quiz;  //act as foreign key for table "Quiz"
	
	/**
	 * @return the quiz
	 */
	public Quiz getQuiz() {
		return quiz;
	}

	/**
	 * @param quizID the quizID to set
	 */
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	/**
	 * @return the ans
	 */
	public String getAns() {
		return ans;
	}

	/**
	 * @param d the ans to set
	 */
	public void setAns(String d) {
		this.ans = d;
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