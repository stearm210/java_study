package exercise2.Collection.Game;

public class Card {
    private String number;
    private String color;
    //注意，每张牌是带大小的
    private int size;//0、1、2、3、4

    public Card() {
    }

    public Card(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString(){
        return color+number;
    }
}
