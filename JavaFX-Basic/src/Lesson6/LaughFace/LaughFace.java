/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6.LaughFace;

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
public class LaughFace extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Arc arc = new Arc();
        arc.centerXProperty().bind(pane.widthProperty().divide(2));
        arc.centerYProperty().bind(pane.heightProperty().divide(2));
        arc.radiusXProperty().bind(pane.widthProperty().divide(4));
        arc.radiusYProperty().bind(pane.widthProperty().divide(4));
        arc.setFill(Color.YELLOW);
        arc.setType(ArcType.ROUND);
        arc.setStartAngle(45);
        arc.setLength(270);
        Circle cir = new Circle();
        cir.centerXProperty().bind(arc.centerXProperty().add(arc.radiusXProperty().divide(4)));
        cir.centerYProperty().bind(arc.centerYProperty().subtract(arc.radiusYProperty().divide(2)));
        cir.radiusProperty().bind(arc.radiusXProperty().divide(8));
        cir.setFill(Color.RED);
        pane.getChildren().add(arc);
        pane.getChildren().add(cir);
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
