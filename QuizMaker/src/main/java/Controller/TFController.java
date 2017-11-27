package Controller;

import Bo.TrueFalseBo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TFController {


    @FXML
    private ChoiceBox<String> ans;

    @FXML
    private TextField ques;


    
	@FXML
	 public void initialize(){    
		 ObservableList<String>ROLE=FXCollections.observableArrayList("True", "False");
	       ans.setItems(ROLE);	
	    }

    public void Finish(ActionEvent event) throws Exception{
    	String a=ques.getText();
    	String b=ans.getValue();

        TrueFalseBo alpha=new TrueFalseBo(); 
        alpha.addTF(a, b);
        alpha.saveTF();
        
        Stage stage = (Stage) ques.getScene().getWindow();
        stage.close();		
	}
	
}

