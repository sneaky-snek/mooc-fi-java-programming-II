package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage){
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        xAxis.setLabel("Year");
        NumberAxis yAxis = new  NumberAxis(0, 100, 10);
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series shangaiChart = new XYChart.Series();

        HashMap<Integer, Integer> helRank = new HashMap<>();
        helRank.put(2007, 73);
        helRank.put(2008, 68);
        helRank.put(2009, 72);
        helRank.put(2010, 72);
        helRank.put(2011, 74);
        helRank.put(2012, 73);
        helRank.put(2013, 76);
        helRank.put(2014, 73);
        helRank.put(2015, 67);
        helRank.put(2016, 56);
        helRank.put(2017, 56);


        helRank.keySet().forEach( key -> {
                shangaiChart.getData().add(new XYChart.Data(key, helRank.get(key)))     ;
        });


        lineChart.getData().add(shangaiChart);
        Scene scene =  new Scene(shangaiChart.getChart(), 600, 400);

        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
