package T1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        Set<String> hashSet = new HashSet<>();
       for (int i = 0; i < num; i++) {
    	   String tmpStr = in.next();	  
		   if (hashSet.contains(tmpStr)) {
		    continue;
		   }else {
			   count++;
				   for (int j = 1; j < tmpStr.length(); j++) {
					   hashSet.add((tmpStr.substring(j)+tmpStr.substring(0, j<0?0:j)));
				   }
    	   		}
       }
       System.out.println(count);
    }

}
