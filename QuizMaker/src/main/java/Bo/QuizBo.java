package Bo;

import java.util.ArrayList;
import java.util.List;

import DAO.QuizDAO;
import Model.Quiz;

public class QuizBo {
	 public List<Quiz> employeeRoster;

	    public QuizBo() {
	        employeeRoster = new ArrayList<Quiz>();
	    }
	    
	   public int addQuiz(String title, String desc, int totalScore) {
	        Quiz tempEmp = new Quiz();
	        tempEmp.setTitle(title);
	        tempEmp.setDesc(desc);
	        tempEmp.setTotalScore(totalScore);
	        employeeRoster.add(tempEmp);
	        return employeeRoster.indexOf(tempEmp);
	    }


	  
	    public void saveQuiz() {
	        QuizDAO empD = new QuizDAO();
	        empD.save(employeeRoster);
	    }

}
