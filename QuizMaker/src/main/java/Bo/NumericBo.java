package Bo;

import java.util.ArrayList;
import java.util.List;

import DAO.NumericDAO;
import Model.Numeric;

public class NumericBo {
	public List<Numeric> employeeRoster;

    public NumericBo() {
        employeeRoster = new ArrayList<Numeric>();
    }

    public int addNumeric(String name,String ans ) {
        Numeric tempEmp = new Numeric();
        tempEmp.setQues(name);
        tempEmp.setAns(ans);
        employeeRoster.add(tempEmp);
        return employeeRoster.indexOf(tempEmp);
    }

	  
    public void saveNumeric() {
        NumericDAO empD = new NumericDAO();
        empD.save(employeeRoster);
    }

}
