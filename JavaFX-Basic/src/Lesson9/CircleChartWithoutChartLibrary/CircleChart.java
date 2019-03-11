/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.CircleChartWithoutChartLibrary;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class CircleChart extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        VBox vBox = new VBox();
        
        // 2014
        HBox subBox2014 = new HBox();
        subBox2014.setAlignment(Pos.CENTER);
        subBox2014.setSpacing(10);
        subBox2014.setPadding(new Insets(10));
        Rectangle rec2014 = new Rectangle();
        rec2014.widthProperty().bind(pane.widthProperty().divide(10));
        rec2014.heightProperty().bind(pane.heightProperty().divide(10));
        rec2014.setFill(Color.RED);
        Text txt2014 = new Text("2014");
        subBox2014.getChildren().addAll(rec2014, txt2014);
        
        // 2015
        HBox subBox2015 = new HBox();
        subBox2015.setAlignment(Pos.CENTER);
        subBox2015.setSpacing(10);
        subBox2015.setPadding(new Insets(10));
        Rectangle rec2015 = new Rectangle();
        rec2015.widthProperty().bind(pane.widthProperty().divide(10));
        rec2015.heightProperty().bind(pane.heightProperty().divide(10));
        rec2015.setFill(Color.YELLOW);
        Text txt2015 = new Text("2015");
        subBox2015.getChildren().addAll(rec2015, txt2015);
        
        // 2016
        HBox subBox2016 = new HBox();
        subBox2016.setAlignment(Pos.CENTER);
        subBox2016.setSpacing(10);
        subBox2016.setPadding(new Insets(10));
        Rectangle rec2016 = new Rectangle();
        rec2016.widthProperty().bind(pane.widthProperty().divide(10));
        rec2016.heightProperty().bind(pane.heightProperty().divide(10));
        rec2016.setFill(Color.GREEN);
        Text txt2016 = new Text("2016");
        subBox2016.getChildren().addAll(rec2016, txt2016);
        
        // 2017
        HBox subBox2017 = new HBox();
        subBox2017.setAlignment(Pos.CENTER);
        subBox2017.setSpacing(10);
        subBox2017.setPadding(new Insets(10));
        Rectangle rec2017 = new Rectangle();
        rec2017.widthProperty().bind(pane.widthProperty().divide(10));
        rec2017.heightProperty().bind(pane.heightProperty().divide(10));
        rec2017.setFill(Color.BROWN);
        Text txt2017 = new Text("2017");
        subBox2017.getChildren().addAll(rec2017, txt2017);
        
        vBox.getChildren().addAll(subBox2014, subBox2015, subBox2016, subBox2017);
        pane.getChildren().addAll(vBox);
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("Circle Chart!");
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
