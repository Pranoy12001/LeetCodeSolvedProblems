import java.util.HashMap;
import java.util.Map;

public class RepeatedElementInArray {
    public int repeatedNTimes(int[] A) {
        int largestReapetedElement = 0;
        int largestReapetedNumber = 0;
        
        Map<Integer, Integer> elementMap = new HashMap<>();
        
        for(int i = 0; i < A.length; i++) {
        	if(elementMap.containsKey(A[i])) {
        		elementMap.put(A[i], elementMap.get(A[i]) + 1);
        	} else {
        		elementMap.put(A[i], 1);
        	}
        }
        
        for(int key : elementMap.keySet()) {
        	if(elementMap.get(key) > largestReapetedNumber) {
        		largestReapetedNumber = elementMap.get(key);
        		largestReapetedElement = key;
        	}
        }
        
        return largestReapetedElement;
    }
}
