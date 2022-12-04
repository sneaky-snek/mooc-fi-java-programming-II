package application;

public class StandardSensor implements Sensor {
    private final int num;
    private final boolean on;

    public StandardSensor(int number){
        this.num = number;
        on = true;
    }


    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn(){}

    @Override
    public void setOff(){}

    @Override
    public int read() {
        return num;
    }
}
