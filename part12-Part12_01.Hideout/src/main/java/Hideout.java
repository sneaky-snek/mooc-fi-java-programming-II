public class Hideout <T>{

    private T hidden;

    public void putIntoHideout(T toHide){
        if(hidden == null) {
            hidden = toHide;
        }
    }

    public T takeFromHideout(){
        T output = hidden;
        hidden = null;
        return output;
    }

    public boolean isInHideout(){
        return (hidden != null);
    }
}
