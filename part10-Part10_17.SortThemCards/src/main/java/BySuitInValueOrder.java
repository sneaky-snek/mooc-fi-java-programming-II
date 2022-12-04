import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        SortBySuit suitSorter = new SortBySuit();
        int sortResult = suitSorter.compare(c1, c2);

        /*if same suit*/
        if (sortResult == 0) {
            if(c1.getValue() < c2.getValue()){
                return -1;
            }
            if(c1.getValue() > c2.getValue()){
                return 1;
            }
        }

        return sortResult;
    }
}
