import javafx.application.Application;
import javafx.scene.control.Button;  //nodes like button,text field,check box
import javafx.scene.layout.StackPane; //layout on which nodes are placed
import javafx.stage.Stage; // just like JFrame
import javafx.scene.Scene; //just like JPanel
import javafx.event.*;

public class Hello_World extends Application {  
  
	public void start(Stage primaryStage) throws Exception {
				Button b1 = new Button("Print Hello World");
				b1.setOnAction(event); //works similar to addActionListener constructor in swing
				StackPane layout = new StackPane();
				layout.getChildren().add(b1); //adds button to StackPane layout
				Scene scene = new Scene(layout,350,100); //adds layout to Scene and set size
				primaryStage.setScene(scene);
				primaryStage.setTitle("JavaFX ApplicatiSon");
				primaryStage.setOpacity(0.7);
				primaryStage.show(); //necessary to show stage
	}
	
	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
        public void handle(ActionEvent arg0)  { 
        	System.out.println("Hello World"); 
        } 
    };
	
    		public static void main(String[] args) {
    			launch(args);
    		}

  
} 