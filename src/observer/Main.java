package observer;

public class Main {

	public static void main(String[] args) {

		StockMarket stockMarket = new StockMarketImpl();
		
		StockObserver investor1 = new Investor("Leonardo");
		StockObserver investor2 = new Investor("Luciana");
		
		stockMarket.registerObserver(investor1);
		stockMarket.registerObserver(investor2);
	

        stockMarket.setStockPrice("GGAL", 1250.0); // Both investors receive updates
        stockMarket.setStockPrice("PAMP", 2500.0); // Both investors receive updates

        stockMarket.removeObserver(investor1);

        stockMarket.setStockPrice("BMA", 700.0); 	}

}
