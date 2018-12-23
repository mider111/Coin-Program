import java.util.Random;

public class GenericCoin {

	public static final boolean HEADS = true;
	public static final boolean TAILS = false;
	private boolean myFaceUpCheck;
	
	//GenericCoin constructor
	public GenericCoin() {
		
		toss();
	}
	
	//Method that converts to String
	public String toString() {
		
		if(myFaceUpCheck) {
			return "Heads";
		}
		else return "Tails";
	}
	
	//Method that returns if the coin is Heads or Tails
	public boolean faceUp() {
		
		return myFaceUpCheck;
	}
	
	//Method that flips the Coin
	public void toss() {
		
		Random rand = new Random();
		
		if(rand.nextBoolean()) {
			myFaceUpCheck = HEADS;
		}
		else myFaceUpCheck = TAILS;
	}
	
}
