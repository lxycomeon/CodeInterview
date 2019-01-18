package Java_InterView;
//成都头条 题2
import java.util.Scanner;
import java.util.Stack;

public class Main3 {

	public static void main(String[] args) {
		//1，2，4
		Scanner input =  new Scanner(System.in);
		String tmp = input.nextLine();
		String[] array = tmp.split(" ");
		
		int leng = 0;
		int i = 1;
		while(leng != array.length) {
			
			Stack tmpStack = new Stack<>();
			for(int j = 0; j < i ;j++) {
				tmpStack.push(array[leng++]);
			}
			while (!tmpStack.isEmpty()) {
				System.out.print(tmpStack.pop()+" ");
			}
			
			i = i*2;
			
		}
		

		
	}
	

	
}
