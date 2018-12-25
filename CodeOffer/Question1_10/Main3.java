package Question1_10;

//��ָoffer������3���ҳ��������ظ�������,
//������Ŀ���ҳ�δ���ֹ�������
//
public class Main3 {

	public static void main(String[] args) {

		int[] nums = {2,3,1,0,6,5,3};
		System.out.println(findDoubleNum1(nums));
		
	}
	
	public static Integer findDoubleNum(int[] nums) {
		int result = 0;
		if(nums == null || nums.length <= 1) {
			return null;
		}
		for(int i = 0;i<nums.length;i++) {
			while(nums[i]!= i) {
				if(nums[i]==nums[nums[i]]) {
					result = nums[i];
					return result;
				}
				int tmp = nums[i];
				nums[i] = nums[tmp];
				nums[tmp] = tmp;
			}
		}
		return result;
	}
	
	//�ڲ��޸������ǰ���£��ҳ��ظ�������,ֻ���ҳ�һ��.�����ڶ��ֲ���
	public static int findDoubleNum1(int[] nums) {
		int startIndex = 0;
		int endIndex = nums.length -1;
		
		while(startIndex <= endIndex) {
			int middle = (endIndex - startIndex)/2+startIndex;
			int Count = CountRange(nums, startIndex, middle);
			if(startIndex == endIndex) {
				if(Count >1)
					return startIndex;
				else
					break;
			}
			
			
			if(Count > middle-startIndex+1) {
				endIndex = middle;
			}else {
				startIndex = middle+1;
			}
		}
		
		return 0;
	}
	
	public static int CountRange(int[] nums,int startIndex,int endIndex) {
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>= startIndex && nums[i]<= endIndex) {
				count++;
			}
		}
		return count;
	}
	
	

}










