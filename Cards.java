public class Cards {
    public static void main(String[] args) {

        Card[] cardlist = new Card[4];
        cardlist[0] = new Card("hearts", 3);
        cardlist[1] = new Card("hearts", 3);
        cardlist[2] = new Card("diamonds", 7);
        cardlist[3] = new Card("hearts", 6);

        // System.out.println(cardlist[0].compareTo(cardlist[1]));

        System.out.println(cardlist[0].getValue() + " of " + cardlist[0].getSuit() + " occurs "
                + ArrayFns.count((Comparable[]) cardlist, (Comparable) cardlist[0]) + " times.");
    }
}
