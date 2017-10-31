
public class Trader {
	private Brokerage brokerage;
	private String username;
	private String password;
	
	Trader (Brokerage b, String u, String p){
		brokerage = b;
		username = u;
		password = p;
	}
	
	Trader(Trader given){
		this.username = given.username;
		this.password = given.password;
		this.brokerage = given.brokerage;
	}
	
	public String toString() {
		return username + " ,  " + password + brokerage.toString();
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return username;
	}
	
}
