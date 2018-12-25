package _104;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import _2.ListNode;

//
public class Solution {

	public static void main(String[] args) {
		TreeNode root = stringToTreeNode("[3,9,20,null,null,15,7]");
		System.out.println( maxDepth(root));
		
	}
	
    public static int maxDepth(TreeNode root) {
    	if (root==null) {
			return 0;
		}
    	return (1+Math.max(maxDepth(root.left), maxDepth(root.right)));
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
    
}
	