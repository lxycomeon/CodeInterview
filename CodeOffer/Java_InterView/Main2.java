package Java_InterView;
//Momenta题目2
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            Pattern p = Pattern.compile("R\\d+C\\d+");
            for (int i = 0; i < n; i++) {
                String string = scanner.nextLine();
                Matcher matcher = p.matcher(string);
                if (matcher.matches()) {
                    String[] parts = string.split("[RC]");
                    int clos = Integer.parseInt(parts[2]);
                    while (clos != 0) {
                        if (clos % 26 == 0) {
                            parts[1] = "Z" + parts[1];
                            clos = clos / 26 - 1;
                        } else {
                            parts[1] = (char) (clos % 26 + 'A' - 1) + parts[1];//C23形式
                            clos = clos / 26;
                        }
                    }
                    System.out.println(parts[1]);

                } else {
                    int clos = 0;
                    String string2 = "";
                    for (int j = 0; ; j++) {
                        if (string.charAt(j) < 'A') {
                            string2 = string.substring(j);//连接后面的两个数字。
                            break;
                        }
                        clos = clos * 26;
                        clos = clos + (int) (string.charAt(j) - 'A' + 1);
                    }
                    System.out.println("R" + string2 + "C" + clos);
                }
            }
        }
        scanner.close();
    }
}
