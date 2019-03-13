/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.CircleChartWithoutChartLibrary;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;

/**
 *
 * @author MyHN
 */
class ChartData {

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }
    private String year;
    private double index;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public double getPercent(double sum) {
        return index * 100.00 / sum ;
    }

    public ChartData(String year, double index, Color color) {
        this.year = year;
        this.index = index;
        this.color = color;
    }
    
}

public class Statistic {

    public Statistic() {
        this.values = new ArrayList<>();
    }    
    public List<ChartData> values;

    /**
     *
     * @return
     */
    public List<ChartData> getValues() {
        return values;
    }
    
    public boolean addValues(ChartData value) {
        return this.values.add(value);
    }

    public double getSum() {
        double sum = 0;
        for(ChartData data : values){
            sum += data.getIndex();
        }
        return sum;
    }
}