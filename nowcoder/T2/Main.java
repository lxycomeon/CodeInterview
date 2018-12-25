package T2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
			nums[i] = in.nextInt();
		}
        Arrays.sort(nums);
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if (nums[i]+nums[j]>nums[k]) {
						count++;
					}
				}
			}
		}
        System.out.println(count);
    }

}
