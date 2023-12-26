import java.util.ArrayList;

public class StockPorfolio {
    private ArrayList<Stock> stocks;
    private int total = 0;

    StockPorfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
        total += stock.value();
        System.out.println("Stock Added Successfully : " + stock);
    }

    public int getTotal() {
        return this.total;
    }

}
