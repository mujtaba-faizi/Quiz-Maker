package Controller;

import Bo.MCQBo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MCQController {

    @FXML
    private TextField MCQ1;

    @FXML
    private TextField MCQ2;

    @FXML
    private TextField MCQ3;

    @FXML
    private TextField MCQ4;

    @FXML
    private ChoiceBox<String> ans;

    @FXML
    private TextField ques;

	@FXML
	private Button end;
    
	@FXML
	 public void initialize(){    
		 ObservableList<String>ROLE=FXCollections.observableArrayList("1","2","3","4");
	       ans.setItems(ROLE);	
	    }

    public void Finish(ActionEvent event) throws Exception{
    	String a=ques.getText();
    	String b=ans.getValue();
    	String c=MCQ1.getText();
    	String d=MCQ2.getText();
    	String e=MCQ3.getText();
    	String f=MCQ4.getText();

        MCQBo alpha=new MCQBo();     //I have to extract the last element's id in the database nd increment it by 1 nd store it here(same for quizID)
        alpha.addMCQ(a, b, c, d, e, f);
        alpha.saveMCQ();
        
        Stage stage = (Stage) end.getScene().getWindow();
        stage.close();		
	}
	
}
