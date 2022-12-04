package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor{

    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor(){
        sensorList = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        long howMuch = sensorList.stream()
                .map(sensor -> sensor.isOn())
                .filter(on -> on == true)
                .count();

        if(howMuch > 0){
            return  true;
        }

        return false;
    }

    @Override
    public void setOn() {
        sensorList.stream()
                .forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        while(true){
            int i = 0;

            sensorList.get(i).setOff();
            if(sensorList.get(i).isOn() == false){
                return;
            }
            i++;
        }
    }

    @Override
    public int read() {
        int currentRead = (int) sensorList.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();

        readings.add(currentRead);
        return currentRead;
    }

    public List<Integer> readings(){
       return readings;
    }
}
