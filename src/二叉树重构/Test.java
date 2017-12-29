package ¶þ²æÊ÷ÖØ¹¹;

/**
 * @author Administrator
 *
 */
public class Test {
     public static void main(String[] args) {
		Solution s=new Solution();
		int[] pre= {1,2,4,7,3,5,6,8};
		int[] in= {4,7,2,1,5,3,8,6};
		TreeNode reConstructBinaryTree = s.reConstructBinaryTree(pre, in);
		System.out.println(reConstructBinaryTree);
	}
}
