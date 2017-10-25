import java.text.DecimalFormat;
import java.util.PriorityQueue;

public class Stock implements Comparable<Stock> {

	private String symbol;
	private String name;
	private double lowPrice, lastPrice, highPrice;
	
	private PriorityQueue <TradeOrder> buyOrders;
	private PriorityQueue <TradeOrder> sellOrders;
	
	private static DecimalFormat money = new DecimalFormat("$#,##0.00");


	Stock (String s, String n, double p){
		
		symbol = s;
		name = n;
		lowPrice = p;
		lastPrice = p;
		highPrice = p;
		
	}

	public String toString() {
		return symbol + ", " + name + ", " + money.format(lastPrice);
	}
	
	public int compareTo(Stock s) {
		return lastPrice;
	}
	
	public void placeOrder(TradeOrder order) {
		
	}
	
}

