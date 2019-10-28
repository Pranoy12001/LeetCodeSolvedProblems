
public class OuterParenthesesRemover {
	public String removeOuterParentheses(String S) {
		StringBuffer stringBuffer = new StringBuffer();
		int index = 0;
		for(char ch : S.toCharArray()) {
			
			if(ch == '(' && index++ > 0) {
				stringBuffer.append(ch);
			} else if(ch == ')' && index-- > 1) {
				stringBuffer.append(ch);
			}
		}
        return stringBuffer.toString();
    }
}
