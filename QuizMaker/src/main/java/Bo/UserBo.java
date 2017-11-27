package Bo;

import java.util.ArrayList;
import java.util.List;

import DAO.UserDAO;
import Model.User;


public class UserBo{
	    public List<User> employeeRoster;

	    public UserBo() {
	        employeeRoster = new ArrayList<User>();
	    }
	    
	   public int addUser(String name,String pass,String role) {
	        User tempEmp = new User();
	        tempEmp.setUsername(name);
	        tempEmp.setPassword(pass);
	        tempEmp.setRole(role);

	        employeeRoster.add(tempEmp);
	        return employeeRoster.indexOf(tempEmp);
	    }


	  
	    public void saveUser() {
	        UserDAO empD = new UserDAO();
	        empD.save(employeeRoster);
	    }


	}

