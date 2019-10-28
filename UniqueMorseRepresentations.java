import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseRepresentations {
	public int uniqueMorseRepresentations(String[] words) {
        Map<String, String> codeWords = new HashMap<>();
        
        codeWords.put("a", ".-");
        codeWords.put("b", "-...");
        codeWords.put("c", "-.-.");
        codeWords.put("d", "-..");
        codeWords.put("e", ".");
        codeWords.put("f", "..-.");
        codeWords.put("g", "--.");
        codeWords.put("h", "....");
        codeWords.put("i", "..");
        codeWords.put("j", ".---");
        codeWords.put("k", "-.-");
        codeWords.put("l", ".-..");
        codeWords.put("m", "--");
        codeWords.put("n", "-.");
        codeWords.put("o", "---");
        codeWords.put("p", ".--.");
        codeWords.put("q", "--.-");
        codeWords.put("r", ".-.");
        codeWords.put("s", "...");
        codeWords.put("t", "-");
        codeWords.put("u", "..-");
        codeWords.put("v", "...-");
        codeWords.put("w", ".--");
        codeWords.put("x", "-..-");
        codeWords.put("y", "-.--");
        codeWords.put("z", "--..");
        
        
        Set<String> uniqueWord = new HashSet<>();
        
        for(String word : words) {
        	String code = "";
        	for(char ch : word.toCharArray()) {
        		code += codeWords.get(String.valueOf(ch));
        	}
        	
        	uniqueWord.add(code);
        }
        
        return uniqueWord.size();
    }
}
