package garden_planner.gui;

import garden_planner.model.GardenBed;
import garden_planner.model.GardenPlanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class GuiMain extends Application {
    Stage window;
    Scene scene2 , scene1;

    private GardenPlanner planner;
   
    public GuiMain(){
        planner = new GardenPlanner();
        planner.createBasicDesign();
    }
 
    public void start(Stage primaryStage) throws Exception{
        BorderPane pane = new BorderPane();
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("garden_gui.fxml"));



        GardenPlanner planner;
        planner = new GardenPlanner();
        planner.createBasicDesign();

        Rectangle r = new Rectangle();
        r.setHeight(80);
        r.setWidth(100);
        r.setX(100);
        r.setY(50);
        r.setArcHeight(20);
        r.setArcWidth(20);
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-background-color: #007700;");
        pane.setPrefSize(800,600);
        Scene scene = new Scene(pane);
        

        for(GardenBed bed: planner.getBeds()) { 
            System.out.println("   "+ bed);
            String[] words = bed.toString().split("\\s");
            System.out.println(words[0]);
            if (words[0].toLowerCase().equals("rectangle")){
                Rectangle rect = new Rectangle();
                rect.setHeight(bed.getHeight()*100); 
                rect.setWidth(bed.getWidth()*100);
                rect.setY(bed.getTop()*100);
                rect.setX(bed.getLeft()*100);
                rect.setStroke(Color.BLACK); 
                rect.setFill(Color.BLUE);
                pane.getChildren().add(rect); 
            }
            else if (words[0].toLowerCase().equals("circle")){
                Circle cir = new Circle();
                cir.setCenterX(bed.getTop()*100);
                cir.setCenterY(bed.getLeft()*100);
                cir.setRadius(50);
                cir.setFill(Color.RED);
                cir.setStroke(Color.BLACK);
                pane.getChildren().add(cir);
            }


        }
        
        Button button2 = new Button("Show Garden");
        button2.setOnAction(e -> window.setScene(scene1));

        
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(button2,root);
        button2.setAlignment(Pos.BASELINE_RIGHT);
        scene2 = new Scene(layout2, 450, 350);

        Button button1 = new Button("Go to main page");
        button1.setOnAction(e -> window.setScene(scene2));

        
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(button1, pane);
        layout1.setStyle("-fx-background-color: #007700;");
        button1.setAlignment(Pos.BOTTOM_LEFT);
        scene1 = new Scene(layout1, 800, 600);



        window.setScene(scene1);
        window.setTitle("Garden Bed");
        window.show();



        primaryStage.setTitle("Garden Bed");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
