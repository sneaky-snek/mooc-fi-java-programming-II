import java.util.LinkedList;
import java.util.List;

public class Pipe <T>{
    private List<T> contained;


    public Pipe() {
       contained = new LinkedList<>();
    }

    public void putIntoPipe(T value){
        contained.add(value);
    }

    public T takeFromPipe(){
        if(contained.isEmpty()){
            return null;
        }
        T buffer = contained.get(0);
        contained.remove(0);
        return buffer;
    }

    public boolean isInPipe(){
         return (!(contained.isEmpty()));
    }

}
