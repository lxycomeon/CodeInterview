package T3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < num; i++) {
        	nums.add(in.nextInt());
		}
        for (int i = 0; i < nums.size(); i++) {
        	int tmp = nums.get(i);
			nums.remove(i);
			nums.add(tmp);
			
			Collections.reverse(nums);
		}
        for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i)+" ");
		}
     
    }

}
