package leetcode;


public class BullsAndCows {
	public static void main(String[] args) {
		System.out.println(getHint("1123", "0111"));
	}
	
	public static String getHint(String secret, String guess) {
		
		int noOfBulls = 0;
		int noOfCows = 0;
		int[] secretFreq = new int[10];
		int[] guessFreq = new int[10];
		
		
		for (int i = 0; i < secret.length(); i++) {
			int secretNum = Character.getNumericValue(secret.charAt(i));
			int guessNum = Character.getNumericValue(guess.charAt(i));
			
			if (secretNum == guessNum) {
				noOfBulls++;
			} else {
				secretFreq[secretNum]++;
				guessFreq[guessNum]++;
			}
		}
		
		for (int i =0; i <10; i++) {
			noOfCows += Math.min(secretFreq[i], guessFreq[i]);
		}
        
        return noOfBulls+"A"+noOfCows+"B";
    }
}
