package Controller;

import Model.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class LoginController {
	@FXML
	private TextField username;
	@FXML
	private TextField pass;
	@FXML
	private ChoiceBox<String> role;
	@FXML
	private Button button;

	@FXML
	 public void initialize(){    
		 ObservableList<String>ROLE=FXCollections.observableArrayList("Student","Instructor");
	       role.setItems(ROLE);	
	    }
	
	public void Login(ActionEvent event) throws Exception{
     
		String a=username.getText();
		String b=pass.getText();
		String c=role.getValue();
		User Faizi=new User(a,b,c);
		
        Stage stage = (Stage) role.getScene().getWindow();
        stage.close();
		Stage primaryStage=new Stage();
		
		if(role.getValue().equals("Student")) {

            Parent root = FXMLLoader.load(getClass().getResource("QuizTaking.fxml"));
            
            Scene scene = new Scene(root,600,600);
            primaryStage.setScene(scene);
            primaryStage.show();
		}
		
		else if(role.getValue()=="Instructor") {
            Parent root = FXMLLoader.load(getClass().getResource("QuizMaking.fxml"));
            
            Scene scene = new Scene(root,600,600);
            primaryStage.setScene(scene);
            primaryStage.show();
		}
		
	}
	
		    
}
