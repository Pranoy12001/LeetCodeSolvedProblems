
public class RobotReturnToOrigin {
	public boolean judgeCircle(String moves) {
        
		int upword = 0;
		int leftword = 0;
		
		for(char ch : moves.toCharArray()) {
			if(ch == 'U') {
				upword++;
			} else if(ch == 'D') {
				upword--;
			} else if(ch == 'L') {
				leftword++;
			} else if(ch == 'R') {
				leftword--;
			}
		}
		
		if(upword == 0 && leftword == 0) {
			return true;
		}
		
		return false;
    }
}
