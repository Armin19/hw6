package ir.ac.aut.ceit;


public abstract class SpellCard extends Card {
    private Type CardSpellType;

    public SpellCard() {
        super(Card.CardType.SPELL);
    }

    @Override
    public SpellCard setCardName(String cardName) {
        return (SpellCard) super.setCardName(cardName);
    }

    public SpellCard.Type getCardSpellType() {
        return CardSpellType;
    }

    public SpellCard setCardSpellType(Type cardSpellType) {
        CardSpellType = cardSpellType;
        return this;
    }

    public enum Type {
        NORMAL,
        CONTINUOUS,
        EQUIP,
        QUICKPLAY,
        FIELD,
        RITUAL,
    }
}
