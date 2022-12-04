public class CustomTacoBox implements TacoBox{
    int tacount;

    public CustomTacoBox(int tacoCount){
        tacount =tacoCount;
    }

    public void eat(){
        if(tacount > 0){
            tacount--;
        }
    }

    public int tacosRemaining() {
        return tacount;
    }
}
