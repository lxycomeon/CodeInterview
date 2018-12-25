package _814;

import java.util.LinkedList;
import java.util.Queue;

/*  Binary Tree Pruning
 * 
 *	We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
	Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
	(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
	
	Example 1:
	Input: [1,null,0,0,1]
	Output: [1,null,0,null,1] 
	Explanation: 
	Only the red nodes satisfy the property "every subtree not containing a 1".
	The diagram on the right represents the answer.
*/

public class Solution {

	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			val = x;
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = stringToTreeNode("[1,null,0,0,1]");
		
		TreeNode ret = pruneTree(root);
		
		System.out.println(treeNodeToString(ret));
	}
	public static TreeNode pruneTree(TreeNode root) {
		
		if(root != null) {
//			if(root.val == 0 && root.left == null && root.right == null)
//				root = null;		//该思路是对的，但是不能够对当前结点进行判断和操作，操作后当前结点值为null了，就不能找回后面的树的结构了，所以是对当前结点的左子树和右子树进行遍历判断是否赋值为null结点
			pruneTree(root.left);
			pruneTree(root.right);
		}
		
		return root;
	}
	
	 public static TreeNode stringToTreeNode(String input) {
	        input = input.trim();
	        input = input.substring(1, input.length() - 1);
	        if (input.length() == 0) {
	            return null;
	        }
	    
	        String[] parts = input.split(",");
	        String item = parts[0];
	        TreeNode root = new TreeNode(Integer.parseInt(item));
	        Queue<TreeNode> nodeQueue = new LinkedList<>();
	        nodeQueue.add(root);
	    
	        int index = 1;
	        while(!nodeQueue.isEmpty()) {
	            TreeNode node = nodeQueue.remove();
	    
	            if (index == parts.length) {
	                break;
	            }
	    
	            item = parts[index++];
	            item = item.trim();
	            if (!item.equals("null")) {
	                int leftNumber = Integer.parseInt(item);
	                node.left = new TreeNode(leftNumber);
	                nodeQueue.add(node.left);
	            }
	    
	            if (index == parts.length) {
	                break;
	            }
	    
	            item = parts[index++];
	            item = item.trim();
	            if (!item.equals("null")) {
	                int rightNumber = Integer.parseInt(item);
	                node.right = new TreeNode(rightNumber);
	                nodeQueue.add(node.right);
	            }
	        }
	        return root;
	    }
	 
	 public static String treeNodeToString(TreeNode root) {
	        if (root == null) {
	            return "[]";
	        }
	    
	        String output = "";
	        Queue<TreeNode> nodeQueue = new LinkedList<>();
	        nodeQueue.add(root);
	        while(!nodeQueue.isEmpty()) {
	            TreeNode node = nodeQueue.remove();
	    
	            if (node == null) {
	              output += "null, ";
	              continue;
	            }
	    
	            output += String.valueOf(node.val) + ", ";
	            nodeQueue.add(node.left);
	            nodeQueue.add(node.right);
	        }
	        return "[" + output.substring(0, output.length() - 2) + "]";
	    }
	
}

