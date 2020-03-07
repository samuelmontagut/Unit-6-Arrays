import java.util.ArrayList;

public class Player {
    private int id;
    private ArrayList<Card> hand;
    private Deck theDeck;

    public Player(int id, Deck deck){
        this.id = id;
        theDeck = deck;
        hand = new ArrayList<>();
    }

    public void drawCard(){
        hand.add(theDeck.getDeck().remove(0));
    }

    public void initHand(int numCards){
        for (int i = 0; i < numCards; i++) {
            drawCard();
        }
    }

    public String toString(){
        return "Player " + id + ": " + hand;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        System.out.println(d.getDeck());
        Player p1 = new Player(1, d);
        Player p2 = new Player(2, d);
        p1.initHand(7);
        p2.initHand(7);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(d.getDeck());
    }
}