import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        
    	Map<Integer, Integer> mapOccurrences = new HashMap<>();
    	Set<Integer> setOccurrences = new HashSet<>();
    	for(int i = 0; i < arr.length; i++) {
    		if(mapOccurrences.containsKey(arr[i])) {
    			mapOccurrences.put(arr[i], mapOccurrences.get(arr[i]) + 1);
    		} else {
    			mapOccurrences.put(arr[i], 1);
    		}
    	}
    	
    	for(Integer key : mapOccurrences.keySet()) {
    		setOccurrences.add(mapOccurrences.get(key));
    	}
    	
    	return true;
    }
}
