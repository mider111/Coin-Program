
public class TestGenericCoin {
	
	public static void main(String[] args) {
	
	GenericCoin test = new GenericCoin();
	
	int myHeadsCount = 0;
	
	for(int i = 0; i < 10; i++) {
		
		//If coin is Heads add 1 to the total count
		if(test.faceUp()) {
			myHeadsCount++;
		}
		//Print out and toss again
		System.out.println(test.toString());
		test.toss();		
	}
	
	System.out.println("Heads: " + myHeadsCount);
	}
}
