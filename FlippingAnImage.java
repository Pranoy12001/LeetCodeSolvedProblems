
public class FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] A) {
		
		int[][] array = new int[A.length][A.length];
		
		for(int i = 0; i < A.length; i++) {
			int k = 0;
			for(int j = A.length - 1; j >= 0 ; j--) {
				if(A[i][j] == 1) {
					array[i][k] = 0;
				} else {
					array[i][k] = 1;
				}
				k++;
			}
		}
		
		return array;
    }
}
