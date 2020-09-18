package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public static void main(String[] args) {
		System.out.println(combinationSum3(3, 9));
	}
	
	private static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> combinationList = new ArrayList<>();
		combinationHelper(1, k, n, combinationList, result);
		return result;
    }
	
	private static void combinationHelper(int startIndex, int index, int sum, 
			List<Integer> combinationList, List<List<Integer>> result) {
		
		if (index == 0) {
			if (sum == 0) {
				result.add(new ArrayList<>(combinationList));
				return;
			} else {
				return;
			}
		}
		
		if (sum < 0) {
			return;
		}
		
		for (int i = startIndex; i <= 9; i++) {
			combinationList.add(i);
			combinationHelper(i + 1, index - 1, sum - i, combinationList, result);
			combinationList.remove(combinationList.size() - 1);
		}
	}

}
