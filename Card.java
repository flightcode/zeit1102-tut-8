public class Card implements Comparable {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        Card compareCard = (Card) obj;
        if (this.suit == compareCard.getSuit() && this.value == compareCard.getValue()) {
            return true;
        }
        return false;
    }

    public int compareTo(Object obj) {
        Card compareCard = (Card) obj;
        if (this.getSuit().compareTo(compareCard.getSuit()) == 0) { // If suits equal
            return Integer.compare(this.getValue(), compareCard.getValue()); // Compare values
        } else {
            int i = this.getSuit().compareTo(compareCard.getSuit()); // Spades > Hearts > Diamonds > Clubs
            if (i > 0) {
                return 1;
            } else if (i < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
