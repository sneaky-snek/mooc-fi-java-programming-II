package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage){


        // Creates a String array for each row on that file and saves it to an ArrayList.
        ArrayList<String[]> data = new ArrayList<>();
        data = reader("part14-Part14_02.FinnishParties/partiesdata.tsv");
        //data = reader("partiesdata.tsv");



        // We use the first array as a "guide"
        String[] labeler = data.get(0);
        // Row structure:
        // Party	1968	1972	1976	1980	1984	1988	1992	1996	2000	2004	2008

        // Creates an axis, and uses the labeler[1] as the lowerBound, and the last one as the upper bound, tickUnit
        //just to show how much it changes after X years.
        NumberAxis xAxis = new NumberAxis(Integer.valueOf(labeler[1]), Integer.valueOf(labeler[labeler.length - 1]), 4);
        // this just sets the Y Axis, we want to show 0 to 30 %
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        //Creates the LineChart, we're going to add every party-line to it after.
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");


        // Loops through every array inside String[]:data, excluding the first one that we used as the guide
        for (int i = 1; i < data.size(); i++){
            String[] currentRow = data.get(i);

            XYChart.Series chart = new XYChart.Series();
            chart.setName(currentRow[0]);

            // Loops through every String in the array, and pairs it with our X/Y Axis
            for (int j = 1; j < currentRow.length; j++){
                if(!currentRow[j].equals("-")){
                    /*                                   Integer year               , Double % of support for X party*/
                    chart.getData().add(new XYChart.Data(Integer.valueOf(labeler[j]), Double.valueOf(currentRow[j])));
                }
            }
            // finally, we add the current party data to the whole chart.
            lineChart.getData().add(chart);

        }

        Scene scene = new Scene(lineChart, 600, 400);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }


    /* Reads a file and returns a List where each String[] represents a row with data*/
    public ArrayList<String[]> reader(String file){
        ArrayList<String[]> output = new ArrayList<>();

        Scanner scan = null;
        try {
            Files.lines(Paths.get(file))                /*Files util, lets us read the file line by line*/
                    .map(row -> row.split("\t")) /* row gets split by every tab*/
                    .forEach(row -> output.add(row));  /* row[] is added to our output */
        } catch (Exception e) {
            System.out.println(e);;
        }

        return output;
    }
}
