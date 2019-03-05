/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2.Chess;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class Chess extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       GridPane pane = new GridPane();
       Scene scene = new Scene(pane, 600, 600);
       Rectangle rec;
       Color color;
       double x;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                rec = new Rectangle();
                rec.widthProperty().bind(pane.widthProperty().divide(8));
                rec.heightProperty().bind(pane.heightProperty().divide(8));
                color = (i + j) % 2 == 0 ? Color.WHITE : Color.BLACK;
                rec.setFill(color);
                pane.add(rec, i, j);
            }
        }
        
        
        
        primaryStage.setTitle("Chess");
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
