/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.Clock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MyHN
 */
public class Clock extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
       // define clock time
       int hour = 1;
       int minute = 40;
       int second = 26;
       Pane pane = new Pane();
       
       // define clock
       Circle clock = new Circle();
       clock.centerXProperty().bind(pane.widthProperty().divide(2));
       clock.centerYProperty().bind(pane.heightProperty().divide(2));
       clock.radiusProperty().bind(pane.heightProperty().divide(4));
       clock.setFill(Color.WHITE);
       clock.setStroke(Color.BLACK);
       clock.setStrokeWidth(2);
       Line hourHand = new Line();
       Line minuteHand = new Line();
       Line secondHand = new Line();
       
        // set position for numberTree
       Text numberTree = new Text("3");
       numberTree.yProperty().bind(clock.centerYProperty());
       numberTree.xProperty().bind(clock.centerXProperty().add(clock.radiusProperty().multiply(0.9)));
       
       // set position for numberSix
       Text numberSix = new Text("6");
       numberSix.xProperty().bind(clock.centerXProperty());
       numberSix.yProperty().bind(clock.centerYProperty().add(clock.radiusProperty().multiply(0.9)));
       
       // set position for numberNine
       Text numberNine = new Text("9");
       numberNine.yProperty().bind(clock.centerYProperty());
       numberNine.xProperty().bind(clock.centerXProperty().subtract(clock.radiusProperty().multiply(0.9)));
       
       // set position for numberTwelve
       Text numberTwelve = new Text("12");
       numberTwelve.xProperty().bind(clock.centerXProperty());
       numberTwelve.yProperty().bind(clock.centerYProperty().subtract(clock.radiusProperty().multiply(0.9)));
       
       // set scene
       pane.getChildren().addAll(clock, hourHand, minuteHand, secondHand, numberNine, numberSix, numberTree, numberTwelve);
       Scene scene = new Scene(pane, 600, 600);
       
       // Hour hand
       hourHand.startXProperty().bind(clock.centerXProperty());
       hourHand.startYProperty().bind(clock.centerYProperty());
       hourHand.endXProperty().bind(clock.centerXProperty()
               .add(clock.radiusProperty().multiply(0.5 * Math.cos(-Math.PI/2 + 2 * Math.PI * (hour % 12) / 12))));
       hourHand.endYProperty().bind(clock.centerYProperty()
               .add(clock.radiusProperty().multiply(0.5 * Math.sin(-Math.PI/2 + 2 * Math.PI * (hour % 12) / 12))));
       hourHand.setStroke(Color.BLUE);
       hourHand.setStrokeWidth(4);
      
       // Minute hand
       minuteHand.startXProperty().bind(clock.centerXProperty());
       minuteHand.startYProperty().bind(clock.centerYProperty());
       minuteHand.endXProperty().bind(clock.centerXProperty()
               .add(clock.radiusProperty().multiply(0.7 * Math.cos(-Math.PI/2 + 2 * Math.PI * minute / 60))));
       minuteHand.endYProperty().bind(clock.centerYProperty()
               .add(clock.radiusProperty().multiply(0.7 * Math.sin(-Math.PI/2 + 2 * Math.PI * minute / 60))));
       minuteHand.setStroke(Color.RED);
       minuteHand.setStrokeWidth(3);
      
       // Second hand
       secondHand.startXProperty().bind(clock.centerXProperty());
       secondHand.startYProperty().bind(clock.centerYProperty());
       secondHand.endXProperty().bind(clock.centerXProperty()
               .add(clock.radiusProperty().multiply(0.7 * Math.cos(-Math.PI/2 + 2 * Math.PI * second / 60))));
       secondHand.endYProperty().bind(clock.centerYProperty()
               .add(clock.radiusProperty().multiply(0.9 * Math.sin(-Math.PI/2 + 2 * Math.PI * second / 60))));
       secondHand.setStroke(Color.GREEN);
       secondHand.setStrokeWidth(1);
       
       primaryStage.setScene(scene);
       primaryStage.setTitle("Clock");
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
