import javafx.application.Application;
import javafx.stage.Stage; // just like JFrame
import javafx.scene.Group;
import javafx.scene.Scene; //just like JPanel
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineJoin;

public class shapes2d extends Application{

	
				public void start(Stage stage) throws Exception {
					Group layout = new Group();
					Scene scene = new Scene(layout,500,250);
					
					//Creating a rectangle
					Rectangle rec =  new Rectangle();
					rec.setX(20); //sets X coordinate
					rec.setY(50); //sets Y coordinate
					rec.setHeight(150); //sets Height
					rec.setWidth(250); //sets Width
					rec.setFill(Color.GREEN); //sets Color
					rec.setStroke(Color.BLACK); //adds boundary
					rec.setStrokeWidth(5); //makes boundary bigger
					rec.setStrokeLineJoin(StrokeLineJoin.ROUND); //makes the joints round
					
					//creates a Circle
					Circle circa =  new Circle();
					circa.setRadius(60);
					circa.setLayoutX(130);
					circa.setLayoutY(125);
					circa.setFill(Color.RED);
					
					layout.getChildren().add(rec); //adds rectangle to group layout
					layout.getChildren().add(circa); //adds circle to group layout
					stage.setScene(scene);
					stage.setTitle("2D Shape");
					stage.setOpacity(0.9);
					stage.show();
					
				}
				
		public static void main(String[] args) {
                   launch(args);			
		}
}



