import java.util.Arrays;

public class List<Type> {
    private Type[] values;
    private int freeSpace;

    public List() {
        this.values = (Type[]) new Object[10];
        freeSpace = 0;
    }

    public void add(Type value) {
        if (freeSpace == this.values.length) {
            this.grow();
        }
        values[freeSpace] = value;
        freeSpace++;
    }

    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];

        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }

        values = newValues;
    }

    public int size() {
        return freeSpace;
    }

    public Type get(int value) {
        return values[value];
    }


    public boolean isEmpty() {
        return values[0] == null;
    }

    public boolean contains(Type value) {
//        boolean output = false;

//        if (!(isEmpty())) {
//            output = Arrays.stream(values)
//                    .filter(p -> p != null)
//                    .allMatch(i -> i.equals(value));
//        }

//        return output;

        return indexOfValue(value) != -1;
    }


    public void remove(Type value){
        int target = indexOfValue(value);
        if(target == -1){
            System.out.println("index -1, returning");
            return;
        }

        for(int i = target; i < freeSpace; i++){
            if(i == target){
                values[i] = null;
            }
            if(values[i] == null){
                values[i] = values[i+1];
                values[i+1] = null;
            }
        }
        freeSpace--;
    }

    public int indexOfValue(Type value){
        int output = -1;

        for(int i = 0; i < freeSpace; i++){
            if(values[i].equals(value)){
                output = i;
                break;
            }
        }

        return output;
    }



}
