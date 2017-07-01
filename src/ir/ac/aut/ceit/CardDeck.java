package ir.ac.aut.ceit;


public abstract class CardDeck {
    private ArrayList<Card> mCards;
    private ArrayList<Card> mPulledCards;
    private Random mRandom;

    public static enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;
    }

    public static enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE;
    }

    public CardDeck() {
        mRandom = new Random();
        mPulledCards = new ArrayList<Card>();
        mCards = new ArrayList<Card>(Suit.values().length * Rank.values().length);
        reset();
    }

    public void reset() {
        mPulledCards.clear();
        mCards.clear();
    /* Creating all possible cards... */
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                mCards.add(c);
            }
        }
    }
