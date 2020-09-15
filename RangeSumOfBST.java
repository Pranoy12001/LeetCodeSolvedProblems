
public class RangeSumOfBST {
	
	 public static class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
	public int rangeSumBST(TreeNode root, int L, int R) {
		int sum = 0;
        
        if(root == null) {
            return 0;
        }
        
        if(root.val >= L && root.val <= R) {
            sum += root.val;
        }
        
        if(root.val >= L) {
            rangeSumBST(root.left, L, R);
        }
        
        if(root.val <= R) {
        	rangeSumBST(root.right, L, R);
        }
        
        return sum;
    }
}
