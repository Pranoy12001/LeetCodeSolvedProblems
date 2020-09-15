package leetcode;


public class MaximumProductSubarray {
	public static void main(String[] args) {
		int[] arr = {-2,3,-4};
		System.out.println(maxProduct(arr));
	}

	public static int maxProduct(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		if (nums.length == 1) {
			return nums[0];
		}
		
		int ans = nums[0];
		int minValue = nums[0];
		int maxValue = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			int minProduct = minValue * nums[i];
			int maxProduct = maxValue * nums[i];
			minValue = Math.min(minProduct, Math.min(maxProduct, nums[i]));
			maxValue = Math.max(maxProduct, Math.max(minProduct, nums[i]));
			ans = Math.max(maxValue, ans);
		}
		
		return ans;
	}
}
