import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList<>();
        for (String rank: Card.RANK) {
            for(String suit: Card.SUIT){
                deck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }


    public void shuffle(){
        Collections.shuffle(deck);
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d.getDeck());
        d.shuffle();
        System.out.println(d.getDeck());
    }
}