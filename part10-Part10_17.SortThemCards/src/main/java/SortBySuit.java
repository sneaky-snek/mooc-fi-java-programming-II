import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    @Override
    /*  which returns a negative value if the card c1 should be sorted before card c2, a positive value if card c2 comes
     before card c1, and zero if they are equal.*/
    public int compare(Card c1, Card c2) {




       if(c1.getSuit().ordinal() > c2.getSuit().ordinal()){
           return 1;
       }
       if(c1.getSuit().ordinal() < c2.getSuit().ordinal()){
           return -1;
       }
       return 0;
    }
}
