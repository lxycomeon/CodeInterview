package Question31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//判断一个整数数组是否是某二叉搜索树的后序遍历
public class Main33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {5,7,6,9,11,10,8};
		int[] nums2 = {7,4,6,5};
		int[] nums1 = {6,5,10,5};
		System.out.println(isLaterOrder(nums1));

	}

	//，二叉搜索树就是，根节点的左边的节点全部小于根节点，右边的节点全部大于根节点
	public static boolean isLaterOrder(int[] nums) {
		if(nums == null || nums.length <= 0)
			return false;
		List list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		List s = list.subList(1, 2);
		//List list = Arrays.asList(nums);
		return isLaterOrderCore(list);
	}
	public static boolean isLaterOrderCore(List nums) {
		if(nums.size() == 1)
			return true;
		int root = (int) nums.get(nums.size()-1);//获得根节点
		int leftIndex = 0;
		while(leftIndex < nums.size()-1 && (int)nums.get(leftIndex) < root) {
			leftIndex ++;
		}
		int rightIndex = leftIndex;
		while(rightIndex < nums.size()-1 && (int)nums.get(rightIndex) > root) {
			rightIndex ++;
		}
		if(rightIndex != nums.size()-1)
			return false;
		boolean left = true; 
		if(leftIndex > 0)
			left = isLaterOrderCore(nums.subList(0, leftIndex)); 
		boolean right =true;
		if(rightIndex > leftIndex)
			right = isLaterOrderCore(nums.subList(leftIndex, rightIndex));
		
		return left && right;
	}
	
	
}
