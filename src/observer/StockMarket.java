package observer;

//Subject interface
public interface StockMarket {
	void registerObserver(StockObserver observer);

	void removeObserver(StockObserver observer);

	void notifyObservers(String stockSymbol, double stockPrice);
	
	void setStockPrice(String stockSymbo, double stockPrice);
}
