package Java_InterView;
import java.util.ArrayList;
import java.util.Scanner;

//成都头条题目1
public class Main4 {

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        String tmp = input.nextLine();

        tmp = tmp.trim();

        if(tmp.length() == 0){
            System.out.println();
        }

        String[] arr = tmp.split(" ");

        if(arr.length == 0 || arr == null){
            System.out.println();
        }

        ArrayList<Object> list = new ArrayList<>();

        for(int i = 0;  Math.pow(2, i) <= arr.length ; i++){
            for(int j = (int)Math.pow(2,i) -1; j <= ( (int)Math.pow(2,(i+1)) - 2); j++){
                if(!arr[j].equals("#")){
                    list.add(arr[j]);
                    break;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
        	System.out.print(list.get(i));
        	if (i != list.size()-1) {
        		System.out.print(" ");
			}
		}
        System.out.println("]");
        
    }
    
}
