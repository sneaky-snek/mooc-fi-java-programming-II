package application;

import javafx.scene.chart.XYChart;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Interester{

    private final int years;

    public Interester(int years){
        this.years = years;
    }

    public ArrayList<Object> chartMaker(int monthly, Double interestRate){

        ArrayList<Object> output = new ArrayList<>();

        XYChart.Series chart = new XYChart.Series();
        chart.getData().add(new XYChart.Data(0,0));



        // Using the formula A = P(1 + r/n)nt
        // P = annual amount ( monthly * 12)
        // r = interest rate
        // n = compound times(1, we do anually)
        // t = years, we'll be increasing by every time so just 1.
        // monthly * 12(1 + ((interest.rate/100) / 1)) 1*1


        Double savings = 0.0;
        output.add(chart);


        for(int i = 0; i < years; i++){
            savings +=  monthly * 12;
            savings *=  ((1 + interestRate / 100) / 1);

            if(i == years-1){
                output.add(savings);
            }


            chart.getData().add(new XYChart.Data(i + 1, savings));
        }


        return output;
    }
}
