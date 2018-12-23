
public class Coin extends GenericCoin{
	
	private double myValue;
	private String myCoin;
	
	//Coin constructor that gets a value and determines what type of Coin it is.
	public Coin(double value) {
		
		super();
		myValue = value;
		
		if(myValue == 0.01) {
			myCoin = "penny";
		}		
		else if(myValue == 0.05) {
			myCoin = "nickel";
		}
		else if(myValue == 0.10) {
			myCoin = "dime";
		}
		else if(myValue == 0.25) {
			myCoin = "quarter";
		}
		else if(myValue == 1.00) {
			myCoin = "dollar";
		}		
	}
	
	//Method that returns the Coin name
	public String getCoin() {
		return myCoin;
	}
	
	//Method that returns the Coin value
	public double getValue() {
		return myValue;
	}
	
	//Method that converts Coin to string
	public String toString() {
		return super.toString() + ", " + myCoin + ", " + myValue;
	}
	
}
