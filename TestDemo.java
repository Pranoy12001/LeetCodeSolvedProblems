import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
        
        String ipNumber = sc.next();
        
		Solution solution = new Solution();
		
		String ip = solution.defangIPaddr(ipNumber);
		
		if(ip.length() > 3) {
			ip = ip.substring(0, ip.length() - 3);
		}
		
		System.out.println("ip="+ip);*/
		
		/*Graph graph = new Graph(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		//graph.bfs(2);
		graph.dfs(2);*/
		
		/*JuwelsAndStones juwelsAndStones = new JuwelsAndStones();
		System.out.println(juwelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(juwelsAndStones.numJewelsInStones("z", "ZZ"));*/
		
		/*SplitStringInBalanceStrings balanceStrings = new SplitStringInBalanceStrings();
		System.out.println(balanceStrings.balancedStringSplit("RLRRLLRLRL"));
		System.out.println(balanceStrings.balancedStringSplit("RLLLLRRRLR"));
		System.out.println(balanceStrings.balancedStringSplit("LLLLRRRR"));*/
		
		/*RangeSumOfBST bt = new RangeSumOfBST();  
        //Add nodes to the binary tree  
        bt.root = new RangeSumOfBST.TreeNode(5);  
        bt.root.left = new RangeSumOfBST.TreeNode(2);  
        bt.root.right = new RangeSumOfBST.TreeNode(9);  
        bt.root.left.left = new RangeSumOfBST.TreeNode(1);  
        bt.root.right.left = new RangeSumOfBST.TreeNode(8);  
        bt.root.right.right = new RangeSumOfBST.TreeNode(6);  
          
        //Display the sum of all the nodes in the given binary tree  
        System.out.println("Sum of all nodes of binary tree: " + bt.calculateSum(bt.root));*/
		
		/*OuterParenthesesRemover outerParenthesesRemover = new OuterParenthesesRemover();
		
		System.out.println("=="+outerParenthesesRemover.removeOuterParentheses("(()())(())"));
		System.out.println("=="+outerParenthesesRemover.removeOuterParentheses("(()())(())(()(()))"));
		System.out.println("=="+outerParenthesesRemover.removeOuterParentheses("()()"));*/
		
		FlippingAnImage flippingAnImage = new FlippingAnImage();
		flippingAnImage.flipAndInvertImage([[1,1,0],[1,0,1],[0,0,0]]);
	}

}
