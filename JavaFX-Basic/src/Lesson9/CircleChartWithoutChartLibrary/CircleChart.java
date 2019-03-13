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
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author MyHN
 */
public class CircleChart extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        VBox vBox = new VBox();
        Statistic index = new Statistic();
        index.addValues(new ChartData("2014", 50, Color.RED));
        index.addValues(new ChartData("2015", 80, Color.YELLOW));
        index.addValues(new ChartData("2016", 100, Color.GREEN));
        index.addValues(new ChartData("2017", 120, Color.BROWN));
        
        
        HBox subBox;
        Rectangle subRec;
        Text subText;
        Arc arc;
        double point = 0, length;
        for(int i = 0; i < index.getValues().size(); i++) {
            // infomation
            subBox = new HBox();
            subBox.setAlignment(Pos.CENTER);
            subBox.setSpacing(10);
            subBox.setPadding(new Insets(10));
            subRec = new Rectangle();
            subRec.widthProperty().bind(pane.widthProperty().divide(10));
            subRec.heightProperty().bind(pane.heightProperty().divide(10));
            subRec.setFill(index.getValues().get(i).getColor());
            subText = new Text(index.getValues().get(i).getYear());
            subBox.getChildren().addAll(subRec, subText);
            
            // Chart
            arc = new Arc();
            arc.centerXProperty().bind(pane.widthProperty().divide(2));
            arc.centerYProperty().bind(pane.heightProperty().divide(2));
            arc.radiusXProperty().bind(pane.widthProperty().divide(4));
            arc.radiusYProperty().bind(pane.widthProperty().divide(4));
            arc.setStartAngle(point);
            length = index.getValues().get(i).getPercent(index.getSum()) * 3.6;
            arc.setLength(length );
            System.out.println(length);
            point += length;
            arc.setType(ArcType.ROUND);
            arc.setFill(index.getValues().get(i).getColor());
            vBox.getChildren().add(subBox);
            pane.getChildren().add(arc);
        }
        
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
