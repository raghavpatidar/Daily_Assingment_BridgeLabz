public class Stock {
    private String name;
    private int qty;
    private int price;

    public Stock(String name, int qty, int price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    @Override
    public String toString() {
        return " name : " + name + ", qty : " + qty + ", price : " + price + " , Value : " + this.value();
    }

    public int value() {
        return this.qty * this.price;
    }

}
