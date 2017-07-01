package ir.ac.aut.ceit;


public abstract class Card implements Special {
    String name;
    String description;

    public Card(String name1, String description1) {
        name = name1;
        description = description1;
    }

    public boolean equalCard(Card card1, Card card2) {
        if (card1.name.equals(card2.name)) {
            return false;
        } else {
        }
        if (card1.description.equals(card2.description)) {
            return false;
        } else {

        }
        return true;
    }

    public String toString(Card card) {
        return "name :" + card.name + "\ndescription :" + card.description;
    }

    private void setName(String name2) {
        name = name2;
    }

    private String getName() {
        return name;
    }

    private void setDescription(String description1) {
        description = description1;
    }

    private String getDescription() {
        return description;
    }
}
