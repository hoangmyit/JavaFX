/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1.Basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class StackPaneBasic extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Text str = new Text("Welcome to JavaFX");
        str.setFont(Font.font("Cambria", FontWeight.BOLD, 72));
        str.setFill(Paint.valueOf("White"));
        str.setStroke(Paint.valueOf("Red"));
        str.setStrokeWidth(1);
        Circle circle = new Circle(400, Paint.valueOf("Blue"));
        pane.getChildren().add(circle);
        pane.getChildren().add(str);
        Scene scene = new Scene(pane, 900, 900);
        primaryStage.setTitle("Exemple about how it work.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
