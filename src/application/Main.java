package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Parent; 
public class Main extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
    	 Parent root = FXMLLoader.load(getClass()
                 .getResource("login.fxml"));
    	 primaryStage.setTitle("My Application");
         primaryStage.setScene(new Scene(root));
         primaryStage.show();
    }
 
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
 
