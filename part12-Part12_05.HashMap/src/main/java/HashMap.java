import java.util.ArrayList;

public class HashMap<K, V> {
    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap(){
        values = new ArrayList[32];
        firstFreeIndex = 0;
    }

    public void add(K key, V value){
        int target = Math.abs(key.hashCode() % values.length);

        if(target > values.length * 0.75){
            this.grow();
        }

        if(values[target] == null){
            values[target] = new ArrayList<>();
        }

        values[target].add(new Pair<>(key, value));
        firstFreeIndex++;
    }

    public V get(K key){
        int target = Math.abs(key.hashCode() % values.length);

        if(values[target] == null){
            return null;
        }
        for (int i = 0; i < values[target].size(); i++){
            if(values[target].get(i).getKey().equals(key)){
                return values[target].get(i).getValue();
            }
        }
        return null;
    }


    private void grow(){
        /*Creates a new array that's 2 times bigger than the current one*/
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];;


        /*We iterate through every ArrayList that we had on values[], it stops at firstFreeIndex because that should be
        the map size*/
        for(int i = 0; i < firstFreeIndex; i++){

            // first we create a temporal ArrayList, to check every pair that we have inside it
            ArrayList<Pair<K,V>> buffer = values[i];

            for(int j = 0; j < buffer.size(); j++){
            // iterates over every pair

                // this ensures that the add method works correctly after changing the values[] size, it works in the
                // same way, we get a "fitting" index where we can add buffer
                int whereAdd = Math.abs(buffer.get(j).getKey().hashCode() % newArray.length);

                // just creates a new list if it's empty, it's an if because 2 objects can have the same hashcode
                // therefore they can end up on the same index;
                if(newArray[whereAdd] == null){
                    newArray[whereAdd]  = new ArrayList<>();
                }

                // finally we add buffer to the newArray on the fitting index;
                newArray[whereAdd].add(buffer.get(j));
            }
        }

        // finishes the growth process;
        this.values = newArray;
    }

    public void remove(K key){
        int where = Math.abs(key.hashCode() % values.length);

        if(values[where] == null || values[where].size() == 0){
            return;
        }

        int indexBegone = -1;

        for(int i = 0; i < values[where].size(); i++){
            if(values[where].get(i).getKey() == key){
                indexBegone = i;
            }
        }

        if(indexBegone > -1){
            values[where].remove(indexBegone);
        }
    }

}
