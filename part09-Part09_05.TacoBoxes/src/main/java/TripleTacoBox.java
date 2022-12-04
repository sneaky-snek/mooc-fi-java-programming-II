public class TripleTacoBox implements TacoBox {

    public int tacount;

    public TripleTacoBox(){
        tacount = 3;
    }

    @Override
    public int tacosRemaining() {
        return tacount;
    }

    public void eat(){
        if(tacount > 0){
            tacount--;
        }
    }

}
