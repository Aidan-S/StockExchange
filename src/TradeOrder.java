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
	
	public Trader getTrader() {
		return trader;
	}
	
	public String getSymbol(){
		return symbol;
	}
	
	public boolean isBuy(){
		if(buy) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isSell(){
		if(!buy) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isMarket(){
		if(market) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isLimit(){
		if(!market) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getShares() {
		return numShares;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		String buyOrSell, marketOrLimit;
		if(buy)buyOrSell = "buy"; else buyOrSell = "Sell";
		if(market) marketOrLimit = "Market"; else marketOrLimit = "Limit";
		
		return "TradeOrder [trader=" + trader + ", numShares=" + numShares + ", price=" + price + ", symbol=" + symbol
				+ ", buy=" + buyOrSell + ", market=" + marketOrLimit + "]";
	}
	
	public void subtractShares(int shares){
		if(numShares-shares > 0 ) {
			numShares -= shares; 
		}else{
			System.out.println("java.lang.IllegalArgumentException");
		}
	}
	
}
