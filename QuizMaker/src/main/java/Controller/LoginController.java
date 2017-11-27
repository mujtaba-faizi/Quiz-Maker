package Controller;

import Bo.UserBo;
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
	
	@FXML
	public void Login(ActionEvent event) throws Exception{
     
		String a=username.getText();
		String b=pass.getText();
		String c=role.getValue();
       
        Stage stage = (Stage) role.getScene().getWindow();
        stage.close();
		Stage primaryStage=new Stage();
		
		UserBo userhandler=new UserBo();   //persisting user information
		userhandler.addUser(a, b, c);
		userhandler.saveUser();
		
		if(role.getValue().equals("Student")) {
		 
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/QuizTaking.fxml"));
            
            Scene scene = new Scene(root,600,600);
            primaryStage.setScene(scene);
            primaryStage.show();
		}
		
		else if(role.getValue()=="Instructor") {
			
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/QuizMaking.fxml"));
            
            Scene scene = new Scene(root,600,600);
            primaryStage.setScene(scene);
            primaryStage.show();
		}
		
	}
	
		    
}
