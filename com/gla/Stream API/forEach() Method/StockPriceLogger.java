import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(101.5, 102.3, 99.8, 105.6);

        stockPrices.forEach(price ->
                System.out.println("Stock Price: " + price)
        );
    }
}
