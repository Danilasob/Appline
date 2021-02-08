import java.util.Scanner;

public class HomeTaskNumber11 {
    public static void main(String[]args){
        String result1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое  число: ");
        double value1 = scan.nextDouble();
        result1 = Double.toString(value1);

        System.out.println("Введите второе число: ");
        int value2= scan.nextInt();

        double PreResult1 = Double.parseDouble(result1); // Приведение первого числа к int первый шаг
        int PreResult2 = (int)PreResult1;   //Приведение первого числа к int второй шаг

                if(PreResult2>value2){
                    System.out.println("Первое число больше второго. Большее Число: "+ PreResult2);
                    double PreValue3 = value2;
                    System.out.println("Меньшее число: "+ PreValue3);

                }else if(PreResult2<value2){
                    System.out.println("Второе число больше первого. Большее число: "+ value2);
                    double PreResult3 = PreResult2;
                    System.out.println("Меньшее число: "+PreResult3);
        }
    }
}
