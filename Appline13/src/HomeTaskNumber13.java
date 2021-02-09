import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeTaskNumber13 {
    public static void main (String[]args){
    Scanner scan  = new Scanner(System.in);
    System.out.println("Введите строку из слов, разделенных пробелами");
    String str = scan.nextLine();
        Pattern p = Pattern.compile("\\b[a-zA-Z]+\\b");
        Matcher m = p.matcher(str);
        int count = 0;
        while(m.find())
        {
            System.out.print(m.group() +" ");
            count++;
        }
        System.out.println("\nКол-во слов только на латинице в предложении: " + count);
    }
}
