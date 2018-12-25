package Ieee;
import java.util.HashMap;
import java.util.Scanner;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		super();
		this.data = data;
	}
}
public class Main {

	
	
	
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 while (input.hasNext()) {
			 String in = input.nextLine();
			 String pre = input.nextLine();
			 char[] inChar = in.toCharArray();
			 char[] preChar = pre.toCharArray();
			 int[] inInt = new int[inChar.length];
			 int[] preInt = new int[preChar.length];
			 for (int i = 0; i < preChar.length; i++) {
				inInt[i] = inChar[i];
				preInt[i] = preChar[i];
			}
			 
			 TreeNode root = reConstructBinaryTree(preInt, inInt);
			 
			 System.out.println("ok");
			
		 }
		 	
			
		}
	 
	 public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        if (pre==null || in==null) {
				return null;
			}
	        HashMap<Integer, Integer> map=new HashMap<>();//中序的节点在哪个位置
	        for(int i=0;i<in.length;i++){
	        	map.put(in[i], i);
	        }
	        return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
	 }
	 public static TreeNode preIn(int[] p,int pi,int pj,int[] n,int ni,int nj,HashMap<Integer, Integer> map){
		 if(pi>pj){
			 return null;
		 }
		 TreeNode head=new TreeNode(p[pi]);
		 int index=map.get(p[pi]);//获得根节点在中序遍历中的位置,由此将中序遍历划分为左右子树,并递归处理
		 head.left=preIn(p,pi+1,pi+(index-ni),n,ni,index-1,map);//(index-ni)为左子树长度
	     head.right=preIn(p,pi+(index-ni)+1,pj,n,index+1,nj,map);//(index-ni+1)为右子树偏移量
	     return head;
	 }
	
	 
}

