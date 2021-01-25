import java.util.Scanner;

public class Home_task_number_4 {
    public static void main(String[]args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите переменную x:");
        double x = scan.nextDouble();
        System.out.println("Введите переменную y:");
        double y = scan.nextDouble();
        System.out.println("Введите переменную z:");
        double z = scan.nextDouble();
        //System.out.println("Введенные переменны: x = " + x + " y = " + y + " z = " + z);

        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое введеных чисел = " + average);
        double roundedValue = Math.floor(average/2);

        if(roundedValue > 3){
            System.out.println("Программа выполнена корректно");
        }

    }
}
