/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5.HappyFace;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class HappyFace extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Pane pane = new Pane();
       Circle face = new Circle();
       face.centerXProperty().bind(pane.widthProperty().divide(2));
       face.centerYProperty().bind(pane.heightProperty().divide(2));
       face.radiusProperty().bind((pane.widthProperty().add(pane.heightProperty())).divide(8));
       face.setFill(Color.YELLOW);
       pane.getChildren().add(face);
       Circle eye1 = new Circle();
       eye1.centerXProperty().bind(face.centerXProperty().subtract(face.radiusProperty().divide(2)));
       eye1.centerYProperty().bind(face.centerYProperty().subtract(face.radiusProperty().divide(2)));
       eye1.radiusProperty().bind(face.radiusProperty().divide(8));
       eye1.setFill(Color.RED);
       Circle eye2 = new Circle();
       eye2.centerXProperty().bind(face.centerXProperty().add(face.radiusProperty().divide(2)));
       eye2.centerYProperty().bind(face.centerYProperty().subtract(face.radiusProperty().divide(2)));
       eye2.radiusProperty().bind(face.radiusProperty().divide(8));
       eye2.setFill(Color.RED);
       Arc mouth = new Arc();
       mouth.centerXProperty().bind(face.centerXProperty());
       mouth.centerYProperty().bind(face.centerYProperty());
       mouth.setFill(null);
       mouth.radiusXProperty().bind(face.radiusProperty().multiply(2/3.0));
       mouth.radiusYProperty().bind(face.radiusProperty().multiply(2/3.0));
       mouth.setStartAngle(-150);
       mouth.setLength(120);
       mouth.setType(ArcType.OPEN);
       mouth.setStroke(Color.BLUE);
       mouth.setStrokeWidth(5);
       pane.getChildren().addAll(eye1, eye2, mouth);
       Scene scene = new Scene(pane, 600, 600);
       primaryStage.setTitle("Happy Face!");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
