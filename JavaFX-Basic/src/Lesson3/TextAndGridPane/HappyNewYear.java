/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3.TextAndGridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class HappyNewYear extends Application {
    final static double STOCK_WIDTH = 2;
    final static Color STOCK_COLOR = Color.CHOCOLATE;
    final static Color TEXT_COLOR = Color.YELLOW;
    final static Font TEXT_FONT = Font.font("Tahoma", FontWeight.BOLD, 72);
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        Text txtHappy = new Text("Happy");
        txtHappy.setFont(TEXT_FONT);
        txtHappy.setStroke(STOCK_COLOR);
        txtHappy.setStrokeWidth(STOCK_WIDTH);
        txtHappy.setFill(TEXT_COLOR);
        Text txtNew = new Text("New");
        txtNew.setFont(TEXT_FONT);
        txtNew.setStroke(STOCK_COLOR);
        txtNew.setStrokeWidth(STOCK_WIDTH);
        txtNew.setFill(TEXT_COLOR);
        Text txtYear = new Text("Year!");
        txtYear.setFont(TEXT_FONT);
        txtYear.setStroke(STOCK_COLOR);
        txtYear.setStrokeWidth(STOCK_WIDTH);
        txtYear.setFill(TEXT_COLOR);
        pane.add(txtHappy, 0, 0);
        pane.add(txtNew, 1, 1);
        pane.add(txtYear, 2, 2);
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("Happy New Year!");
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
