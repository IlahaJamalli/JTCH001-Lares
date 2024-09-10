package ThirdMonth.MainLessons.Uno;

public class Card {
    private String reversedCard = "reversedCard";
    private String fourPlus = "fourPlus";
    private String colors ="colors";
    private String value = "value";

    public Card(String reversedCard, String fourPlus,String colors,String value) {
        this.reversedCard = reversedCard;
        this.fourPlus = fourPlus;
        this.colors = colors;
        this.value = value;
    }

    public Card() {
    }

    public String getReversedCard() {
        return reversedCard;
    }


    public void setReversedCard(String reversedCard) {
        this.reversedCard = reversedCard;
    }

    public String getFourPlus() {
        return fourPlus;
    }

    public void setFourPlus(String fourPlus) {
        this.fourPlus = fourPlus;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

