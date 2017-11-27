package Controller;

import Bo.NumericBo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NumericController {


    @FXML
    private TextField ans;

    @FXML
    private TextField ques;


    public void Finish(ActionEvent event) throws Exception{
    	String a=ques.getText();
    	String b=ans.getText();

        NumericBo alpha=new NumericBo();     //I have to extract the last element's id in the database nd increment it by 1 nd store it here(same for quizID)
        alpha.addNumeric(a, b);
        alpha.saveNumeric();
        
        Stage stage = (Stage) ques.getScene().getWindow();
        stage.close();		
	}
	
}
