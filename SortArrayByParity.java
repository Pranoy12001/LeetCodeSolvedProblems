
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        
    	int temp;
    	
    	int oddOrder = 0;
    	int evenOder = A.length -1;
    	
    	while (oddOrder <= evenOder) {
    		while(oddOrder <= evenOder && A[oddOrder] % 2 == 0) {
    			oddOrder++;
    		}
    		
    		while (oddOrder <= evenOder && A[evenOder] % 2 != 0) {
    			evenOder--;
    		}
    		
    		if(oddOrder <= evenOder) {
    			temp = A[oddOrder];
    			
    			A[oddOrder] = A[evenOder];
    			A[evenOder] = temp;
    			
    			oddOrder++;
    			evenOder--;
    		}
    	}
    	
    	return A;
    }
}
