import java.util.ArrayList;
import java.util.List;

public class SplitStringInBalanceStrings {
	public int balancedStringSplit(String s) {
        int count = 0;
        List<Character> lContainsBox = new ArrayList<Character>();
        List<Character> rContainsBox = new ArrayList<Character>();
        
        for(char c : s.toCharArray()) {
        	if(c == 'L') {
        		lContainsBox.add(c);
        	} else if(c == 'R') {
        		rContainsBox.add(c);
        	}
        	
        	if(!lContainsBox.isEmpty() && !rContainsBox.isEmpty()) {
        		if(lContainsBox.size() == rContainsBox.size()) {
        			count++;
        			lContainsBox.clear();
        			rContainsBox.clear();
        		}
        	}
        }
        
        return count;
    }
}
