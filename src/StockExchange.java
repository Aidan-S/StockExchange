
public class StockExchange {
	
	public StockExchange() {
		
	}
	
	public String getQuote(Stock stock) {
		return stock.getQuote();
	}
	
	public void listStock(String symbol, String name, double price) {
		Stock s = new Stock(symbol, name, price);
	}
	
	public void placeOrder(TradeOrder order) {
		Stock.placeOrder(order);
	}
	
}
