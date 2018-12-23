import java.util.Random;

public class TestCoin {

	private static final int numCoin = 100;

	public static void main(String[] args) {

		Coin[] coinArr = new Coin[numCoin];
		Random rand = new Random();
		
		//For loop which generates 100 all random coins.
		for (int i = 0; i < numCoin; i++) {

			double value = -1;
			
			//Algorithm that assigns random values to the coins
			int tempRand = rand.nextInt(5);
			
			if (tempRand == 0) {
				value = 0.01;
			} else if (tempRand == 1) {
				value = 0.05;
			} else if (tempRand == 2) {
				value = 0.1;
			} else if (tempRand == 3) {
				value = 0.25;
			} else if (tempRand == 4) {
				value = 1;
			}
			
			coinArr[i] = new Coin(value);
			coinArr[i].toss();
			
		}
		
		//Loop that counts the heads, tails, and total Value of all different coins.
		for(int i=0;i<numCoin;i++) {
			System.out.println(coinArr[i].toString());
		}
		
		int[] numberOfHead = new int[5];
		int[] numberOfTail = new int[5];
		double[] totalValue = new double[5];
		
		for(int i=0; i<numCoin;i++) {
			
			//If penny
			if(coinArr[i].getValue()==0.01) {
				
				totalValue[0] += coinArr[i].getValue();
				
				if(coinArr[i].faceUp()) {
					
					numberOfHead[0] += 1;
					
				} else {
					
					numberOfTail[0] += 1;
				}
			}
			
			//If nickle
			if(coinArr[i].getValue()==0.05) {
				
				totalValue[1] += coinArr[i].getValue();
				
				if(coinArr[i].faceUp()) {
					
					numberOfHead[1] += 1;
					
				} else {
					
					numberOfTail[1] += 1;
				}
			}
			
			//If dime
			if(coinArr[i].getValue()==0.1) {
				
				totalValue[2] += coinArr[i].getValue();
				
				if(coinArr[i].faceUp()) {
					
					numberOfHead[2] += 1;
					
				} else {
					
					numberOfTail[2] += 1;
				}
			}
			
			//If quarter
			if(coinArr[i].getValue()==0.25) {
				
				totalValue[3] += coinArr[i].getValue();
				
				if(coinArr[i].faceUp()) {
					
					numberOfHead[3] += 1;
					
				} else {
					
					numberOfTail[3] += 1;
				}
			}
			
			//If dollar
			if(coinArr[i].getValue()==1) {
				
				totalValue[4] += coinArr[i].getValue();
				
				if(coinArr[i].faceUp()) {
					
					numberOfHead[4] += 1;
					
				} else {
					
					numberOfTail[4] += 1;
				}
			}
		}
		
		int numberOfPennies=(numberOfHead[0]+numberOfTail[0]);
		int numberOfNickles=(numberOfHead[1]+numberOfTail[1]);
		int numberOfDimes=(numberOfHead[2]+numberOfTail[2]);
		int numberOfQuarters=(numberOfHead[3]+numberOfTail[3]);
		int numberOfDollars=(numberOfHead[4]+numberOfTail[4]);
		
		System.out.println("Pennies: " + numberOfPennies + "Value in $: " + totalValue[0] + "Heads: " 
				+ numberOfHead[0]+ "Tails: "+ numberOfTail[0]);
		
		System.out.println("Nickles: " + numberOfNickles + "Value in $: " + totalValue[1] + "Heads: " 
				+ numberOfHead[1]+ "Tails: "+ numberOfTail[1]);
		
		System.out.println("Dimes: " + numberOfDimes + "Value in $: " + totalValue[2] + "Heads: " 
				+ numberOfHead[2]+ "Tails: "+ numberOfTail[2]);
		
		System.out.println("Quartes: " + numberOfQuarters + "Value in $: " + totalValue[3] + "Heads: " 
				+ numberOfHead[3]+ "Tails: "+ numberOfTail[3]);
		
		System.out.println("Dollars: " + numberOfDollars + "Value in $: " + totalValue[4] + "Heads: " 
				+ numberOfHead[4]+ "Tails: "+ numberOfTail[4]);
	

		double total = 0;
		
		//Counts the total $ value of all coins
		for(int i =0;i<5;i++) {
			total += totalValue[i];
		
		}
		System.out.println("Total $ value of all coins: "+ total);
	}
}
