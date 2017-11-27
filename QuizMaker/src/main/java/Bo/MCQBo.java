package Bo;

import java.util.ArrayList;
import java.util.List;

import DAO.MCQDAO;
import Model.MCQ;;

public class MCQBo {
	public List<MCQ> employeeRoster;

    public MCQBo() {
        employeeRoster = new ArrayList<MCQ>();
    }

    public int addMCQ(String name,String ans,String mCQ1,String mCQ2, String mCQ3,String mCQ4 ) {
        MCQ tempEmp = new MCQ();
        tempEmp.setQues(name);
        tempEmp.setAns(ans);
        tempEmp.setMCQ1(mCQ1);
        tempEmp.setMCQ2(mCQ2);
        tempEmp.setMCQ3(mCQ3);
        tempEmp.setMCQ4(mCQ4);
        employeeRoster.add(tempEmp);
        return employeeRoster.indexOf(tempEmp);
    }

	  
    public void saveMCQ() {
        MCQDAO empD = new MCQDAO();
        empD.save(employeeRoster);
    }

}
