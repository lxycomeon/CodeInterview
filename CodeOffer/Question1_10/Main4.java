package Question1_10;

//面试题4：二维数组的查找。利用以及左上角数字与行列的关系。逐渐缩小所在范围
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,8,9,2,4,9,12,4,7,10,13,6,8,11,15};
		System.out.println(findNum(nums, 4, 4, 15));

	}
	
	public static boolean findNum(int[] nums,int row,int column,int findNum) {
		int startRow = 0;
		int startCol = column -1;
		while(startRow <=row && startCol >=0) {
			if(findNum == nums[startRow*column + startCol])
				return true;
			if(findNum > nums[startRow*column + startCol]) {
				startRow++;
			}else {
				startCol--;
			}
		}
		return false;
	}
	

}
