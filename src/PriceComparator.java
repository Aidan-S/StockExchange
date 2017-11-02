
public class PriceComparator {
	
	public boolean asc;
	
	public PriceComparator() {
		asc = true;
	}
	
	public PriceComparator(boolean asc) {
		this.asc = asc;
	}
	
	public int compare(TradeOrder order1, TradeOrder order2) {
		if(order1.isMarket() && order2.isMarket()) {
			return 0;
		}
		if(order1.isMarket() && order2.isLimit()) {
			return -1;
		}
		if(order1.isLimit() && order2.isMarket()) {
			return 1;
		}
		if(asc) {
			return (int)((order1.getPrice() - order2.getPrice()) * 100);
		}else {
			return (int)((order2.getPrice() - order1.getPrice()) * 100);
		}
	}
	
	
	
}
