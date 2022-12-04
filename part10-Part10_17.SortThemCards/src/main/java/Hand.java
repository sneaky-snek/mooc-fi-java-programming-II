
import java.util.ArrayList;
import java.util.Collections;



public class Hand implements Comparable{
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<>();

    }
    public void add(Card card){
        hand.add(card);
    }
    public void print(){
        hand.forEach(System.out::println);

    }
    public int getValue(){
        return hand.stream()
                .mapToInt(Card::getValue)
                .sum();
    }
    public void sort(){
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Object o){
        Hand compared = (Hand) o;
        return compareTo(compared);
    }

    public int compareTo(Hand comparable){
        if(this.getValue() < comparable.getValue()){
            return -1;
        }
        if(this.getValue() > comparable.getValue()){
            return 1;
        }

        return 0;
    }

    public void sortBySuit(){
        BySuitInValueOrder sorter = new BySuitInValueOrder();
        Collections.sort(hand, sorter);
    }
}
