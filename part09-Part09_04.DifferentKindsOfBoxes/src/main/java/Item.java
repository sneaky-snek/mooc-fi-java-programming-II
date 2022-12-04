
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public int hashCode(){
        return (name.length() * 23);
    }

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }
        if(!(object instanceof Item)){
            return false;
        }

        if(object == this){
            return true;
        }

        Item comp = (Item) object;

        return this.name.equals(comp.getName());
    }

}
