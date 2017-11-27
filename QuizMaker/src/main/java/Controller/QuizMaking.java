package Controller;

import Bo.QuizBo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class QuizMaking {
	private static int Score;

	 @FXML
	    private Button Done;

	    @FXML
	    private Button MCQ;

	    @FXML
	    private Button Numeric;

	    @FXML
	    private Button TF;

	    @FXML
	    private TextField desc;

	    @FXML
	    private TextField title;
	    
	    public void TF(ActionEvent event) throws Exception{
	    	Score+=5;    //considering question is of 5 marks
	    	Stage primaryStage=new Stage();
	    	   Parent root = FXMLLoader.load(getClass().getResource("/fxml/TrueFalseQues.fxml"));
	     	    Scene scene = new Scene(root);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	    }
	    
	    public void MCQ(ActionEvent event) throws Exception{
	    	Score+=5;
	    	Stage primaryStage=new Stage();
	    	   Parent root = FXMLLoader.load(getClass().getResource("/fxml/MCQQues.fxml"));
	     	    Scene scene = new Scene(root);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	    }
	    
	    public void Num(ActionEvent event) throws Exception{
	    	Score+=5;
	    	Stage primaryStage=new Stage();
	    	   Parent root = FXMLLoader.load(getClass().getResource("/fxml/NumericQues.fxml"));
	     	    Scene scene = new Scene(root);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	    }
	    
	    
    public void Finish(ActionEvent event) throws Exception{
    	String a=title.getText();
    	String b=desc.getText();
    	
    	QuizBo quizhandler=new QuizBo();
    	quizhandler.addQuiz(a, b, Score);
    	quizhandler.saveQuiz();
     
        Stage stage = (Stage) title.getScene().getWindow();
        stage.close();		
	}
}
