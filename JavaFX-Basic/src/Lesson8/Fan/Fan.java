/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.Fan;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class Fan extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle fan = new Circle();
        fan.centerXProperty().bind(pane.widthProperty().divide(2));
        fan.centerYProperty().bind(pane.heightProperty().divide(2));
        fan.radiusProperty().bind(pane.heightProperty().divide(4));
        fan.setFill(null);
        fan.setStroke(Color.ORANGE);
        fan.setStrokeWidth(5);
        Arc[] arcArr = new Arc[4];
        for (int i = 0; i < 4; i++) {
            arcArr[i] = new Arc();
            arcArr[i].centerXProperty().bind(fan.centerXProperty());
            arcArr[i].centerYProperty().bind(fan.centerYProperty());
            arcArr[i].radiusXProperty().bind(fan.radiusProperty().multiply(0.8));
            arcArr[i].radiusYProperty().bind(fan.radiusProperty().multiply(0.8));
            arcArr[i].setStartAngle(i * 90);
            arcArr[i].setLength(30);
            arcArr[i].setType(ArcType.ROUND);
            arcArr[i].setFill(Color.GRAY);
        }
        pane.getChildren().add(fan);
        pane.getChildren().addAll(arcArr);
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("Fan!");
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
