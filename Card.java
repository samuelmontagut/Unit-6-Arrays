public class Card implements Comparable{
    public static final String[] RANK = {"A", "K", "Q", "J", "10", "9", "8",
                                            "7", "6", "5", "4", "3", "2"};
    public static final String[] SUIT = {"♤", "♡", "♢", "♧"};
    private String rank;
    private String suit;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int compareTo(Object other){
        Card otherCard = (Card) other;
        return this.getRankValue() - otherCard.getRankValue();
    }

    public int getRankValue(){
        for (int i = 0; i < RANK.length; i++) {
            if(this.rank.equals(RANK[i])){
                return 14 - i;
            }
        }
        return -1;
    }

    public String toString(){
        return rank + suit;
    }

    public static void main(String[] args) {
        Card c1 = new Card(RANK[0], SUIT[0]);
        System.out.println(c1);
        Card c2 = new Card(RANK[RANK.length-1], SUIT[SUIT.length - 1]);
        System.out.println(c2);
        System.out.println(c1.getRankValue());
        System.out.println(c2.getRankValue());
        System.out.println(c1.compareTo(c2));
    }

}