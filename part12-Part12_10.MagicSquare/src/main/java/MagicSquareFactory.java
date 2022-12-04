
public class MagicSquareFactory {

    private int valueToAdd;
    private int y;
    private int x;
    private MagicSquare square;


    public MagicSquare createMagicSquare(int size) {
        square = new MagicSquare(size);
        valueToAdd = 1;

        square.placeValue(size / 2, 0, valueToAdd);
        valueToAdd++;
        y = 0;
        x = size/2;

        for(int i = 0; i < size * size - 1; i++){
            move();
            square.placeValue(x,y, valueToAdd);
            valueToAdd++;
        }

        return square;
    }


    /*If the place already contains a number, we don't go up and right. Instead we take one step downwards.*/
    private boolean check(){
        return (square.readValue(x, y) == 0);

    }


    /* If the transition would leave us outside the bounds of the magic square, we jump to the opposite edge.
     In other words, if we go "over the right edge" we continue from the left edge, and if we go "over the top edge" we
     continue from the bottom. */
    private void move(){
        /*both still correct after moving*/
        if(x + 1 <= square.getWidth()- 1&& y - 1 >= 0){
            x ++;
            y --;
            if(!(check())){
                moveDown("xy");
            }
            return;
        }
        /* x ok, y out of bounds*/
        if (x + 1 <= square.getWidth() - 1 && y - 1 < 0){
            x ++;
            y = square.getHeight() -1;
            return;
        }
        /* x out of bounds, y ok*/
        if(x + 1 > square.getWidth()- 1 && y - 1 >= 0){
            x = 0;
            y --;
            return;
        }
        /*both out of bounds*/
        if(x + 1 > square.getWidth()- 1 && y - 1 < 0){
            x = 0;
            y = square.getHeight() - 1;
            if(!(check())){
                moveDown("-");
            }
        }
    }

    private void moveDown(String option){
        switch (option){
            case "xy":
               x--;
               y +=2;
               return;
            case "-":
                x = square.getWidth() -1;
                y = 1;
        }

    }

}
