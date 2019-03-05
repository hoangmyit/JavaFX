/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4.TrafficeLight;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class TrafficLight extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        VBox pane = new VBox();
        pane.setSpacing(10);
        pane.setPadding(new Insets(20));
        Rectangle rec = new Rectangle(160, 500, null);
        rec.setStroke(Color.BLACK);
        rec.setStrokeWidth(3);
        Circle cirlBlue = new Circle(70, Color.BLUE);
        Circle cirlRed = new Circle(70, Color.RED);
        Circle cirlYellow = new Circle(70, Color.YELLOW);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(cirlBlue, cirlYellow, cirlRed);
        root.getChildren().add(pane);
        root.getChildren().add(rec);
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Traffic Light");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
