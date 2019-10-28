import java.util.HashSet;
import java.util.Set;

public class JuwelsAndStones {
	public int numJewelsInStones(String J, String S) {
		int count = 0;

		Set<Character> subStringCharacter = new HashSet<>();

		for (char sub : J.toCharArray()) {
			subStringCharacter.add(sub);
		}

		for (char s : S.toCharArray()) {
			if (subStringCharacter.contains(s)) {
				count++;
			}
		}

		return count;
	}
}
