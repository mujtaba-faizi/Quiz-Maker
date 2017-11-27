package Bo;

import java.util.ArrayList;
import java.util.List;

import DAO.TrueFalseDAO;
import Model.TrueFalse;

public class TrueFalseBo {
	 public List<TrueFalse> employeeRoster;

	    public TrueFalseBo() {
	        employeeRoster = new ArrayList<TrueFalse>();
	    }
	    
	   public int addTF(String ques, String ans) {
	        TrueFalse tempEmp = new TrueFalse();
	        tempEmp.setQues(ques);
	        tempEmp.setAns(ans);
	        employeeRoster.add(tempEmp);
	        return employeeRoster.indexOf(tempEmp);
	    }


	  
	    public void saveTF() {
	        TrueFalseDAO empD = new TrueFalseDAO();
	        empD.save(employeeRoster);
	    }

}
