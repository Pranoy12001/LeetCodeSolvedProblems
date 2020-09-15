import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> dividingNumbers = new ArrayList<>();
        
        for(int i = left; i <= right; i++) {
        	if(i < 10) {
        		dividingNumbers.add(i);
        	} else {
        		String temp = String.valueOf(i);
        		boolean isNumberTook = true;
        		
        		for(char ch : temp.toCharArray()) {
        			if(ch == '0') {
        				isNumberTook = false;
        				break;
        			} else if (i % Integer.valueOf(String.valueOf(ch)) != 0) {
        				isNumberTook = false;
        				break;
        			}
        		}
        		
        		if(isNumberTook) {
        			dividingNumbers.add(i);
        		}
        	}
        }
        
        return dividingNumbers;
    }
}
