import java.text.DecimalFormat;
import java.util.PriorityQueue;

public class Stock implements Comparable<Stock> {

	private String symbol;
	private String name;
	private double lowPrice, lastPrice, highPrice, dayVolume;
	
	private PriorityQueue <TradeOrder> buyOrders;
	private PriorityQueue <TradeOrder> sellOrders;
	
	private static DecimalFormat money = new DecimalFormat("$#,##0.00");


	Stock (String s, String n, double p){
		symbol = s;
		name = n;
		lowPrice = p;
		lastPrice = p;
		highPrice = p;
		dayVolume = 0;	
	}

	public String toString() {
		return name + " (" + symbol + ") " + "\n" + "Price: " + money.format(lastPrice) + " HI: " + money.format(highPrice) + 
				" lo: " + money.format(lowPrice) + " vol: " + dayVolume;
	}
	
	public int compareTo(Stock s) {
		return (int)lastPrice;
	}
	
	public String getQuote() {
		return name + " (" + symbol + ") " + "\n" + "Price: " + money.format(lastPrice) + " HI: " + money.format(highPrice) + 
				" lo: " + money.format(lowPrice) + " vol: " + dayVolume + "\n" + "Ask: " + "IDK WHAT TO PUT" + " size: " +
				"asd;asd" + " Bid: " + "adasdas" + " size: " + "dfilejw";
	}
	
	public void placeOrder(TradeOrder order) {
		if(order.isBuy()) {
			buyOrders.add(order);
			System.out.println("New Order: Buy " + symbol + " (" + name + ")" + "\n" + order.getShares()  + " shares at " + order.getPrice());
		}else {
			sellOrders.add(order);
			System.out.println("New Order: Sell " + symbol + " (" + name + ")" + "\n" + order.getShares()  + " shares at market");
		
		}
	}
	
	
	
}

