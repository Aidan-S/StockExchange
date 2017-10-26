public class TradeOrder {

	private Trader trader;
	private int numShares;
	private double price;
	private String symbol;
	private boolean buy;
	private boolean market;
	
	/**
	 * @param t
	 * @param s
	 * @param buy
	 * @param shares
	 * @param market
	 * @param price
	 */
	public TradeOrder(Trader t, String s, boolean buy, int shares, boolean market, double price) {
		trader = t;
		symbol = s;
		this.buy = buy;
		numShares = shares;
		this.market = market;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		String buyOrSell, marketOrLimit;
		if(buy)buyOrSell = "buy"; else buyOrSell = "Sell";
		if(market) marketOrLimit = "Market"; else marketOrLimit = "Limit";
		
		return "TradeOrder [trader=" + trader + ", numShares=" + numShares + ", price=" + price + ", symbol=" + symbol
				+ ", buy=" + buyOrSell + ", market=" + marketOrLimit + "]";
	}
	
	
	
}
