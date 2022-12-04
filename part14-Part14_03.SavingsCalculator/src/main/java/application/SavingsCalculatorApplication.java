package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.nio.DoubleBuffer;
import java.util.ArrayList;


public class SavingsCalculatorApplication extends Application {
    LineChart<Number, Number> chart;    
    
    @Override
    public void start(Stage stage){



        ArrayList<Slider> sliderElements = new ArrayList<>();
        Interester charter = new Interester(30);

        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(10,10,10,10));

        VBox sliders = new VBox();

        BorderPane monthlyPane = new BorderPane();
        Slider monthlySlider = new Slider(25, 250, 5);
        Label monthlyLab = new Label("Monthly savings");
        Label monthlyVal = new Label("" + monthlySlider.getValue());

        monthlySlider.setMinorTickCount(4);
        monthlySlider.setBlockIncrement(1);;
        monthlySlider.setMajorTickUnit(25);
        monthlySlider.setShowTickMarks(true);
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setSnapToTicks(true);

        monthlyPane.setLeft(monthlyLab);
        monthlyPane.setCenter(monthlySlider);
        monthlyPane.setRight(monthlyVal);

        sliders.getChildren().add(monthlyPane);


        BorderPane interestPane = new BorderPane();
        Slider interestSlider = new Slider(0, 10, 1);
        Label interestLab = new Label("Yearly interest rate");
        Label interestVal = new Label(String.format("%.2f",interestSlider.getValue()));
        interestSlider.setMinorTickCount(2);
        interestSlider.setMajorTickUnit(1);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setSnapToTicks(true);

        interestPane.setLeft(interestLab);
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestVal);
        sliders.getChildren().add(interestPane);


        sliders.setSpacing(15);
        layout.setTop(sliders);
        sliderElements.add(interestSlider);
        sliderElements.add(monthlySlider);


        NumberAxis xPlaceHolder = new NumberAxis(0, 30,1);;
        NumberAxis yPlaceHolder = new NumberAxis(0, 100 , 100/5);
        chart = new LineChart<>(xPlaceHolder, yPlaceHolder);

        sliderElements.forEach((item) -> item.setOnMouseClicked((event -> {
            int monthlyDeposit = (int) monthlySlider.getValue();
            Double interestRate = interestSlider.getValue();

            ArrayList<Object> chartInfo = charter.chartMaker(monthlyDeposit,interestRate);
            XYChart.Series fullChart = (XYChart.Series) chartInfo.get(0);
            fullChart.setName("Compound Savings");
            Double maxY = Double.valueOf(Math.round((Double) chartInfo.get(1) / 1000) * 1000);
            System.out.println((Double) chartInfo.get(1));

            NumberAxis xAxis = new NumberAxis(0, 30,1);;
            NumberAxis yAxis = new NumberAxis(0, maxY , maxY/5);

            this.chart = new LineChart<>(xAxis, yAxis);

            chart.getData().add(fullChart);
            monthlyVal.setText("" + monthlySlider.getValue());
            interestVal.setText(String.format("%.2f",interestSlider.getValue()));


            XYChart.Series humbleChart =(XYChart.Series) charter.chartMaker(monthlyDeposit,0.0).get(0);
            humbleChart.setName("Total Deposited");
            chart.getData().add(humbleChart);
            layout.setCenter(chart);

        })));

        layout.setCenter(chart);
        Scene view = new Scene(layout, 600, 400);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {

        launch(SavingsCalculatorApplication.class);
    }


}
