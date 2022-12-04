import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;

    public ChangeHistory(){
    changes = new ArrayList<>();
    }

    /* adds provided status as the latest amount to remember in the change history. */
    public void add(double status){
        changes.add(status);
    }

    public void clear(){
        changes.clear();
    }
    /* returns the largest value in the change history. If the history is empty, the method should return zero. */
    public double maxValue(){

        double output = 0;

        for(double i: changes){
            if(i > output){
                output = i;
            }
        }

        return output;
    }


    /*returns the smallest value in the change history. If the history is empty, the method should return zero.*/
    public double minValue(){

       double output = 0;

       if(!(changes.isEmpty())) {
           output = changes.get(0);
           for (double i : changes) {
               if (i < output) {
                   output = i;
               }
           }
       }

        return output;
    }

    /*returns the average of the values in the change history. If the history is empty, the method should return zero*/
    public double average(){
        double output = 0.0;
        double sum = 0;

        if (!(changes.isEmpty())){
            for (double i: changes) {
                sum += i;
            }
            output = sum / changes.size();
        }

        return output;
    }

    @Override
    public String toString(){
        return changes.toString();
    }
}
