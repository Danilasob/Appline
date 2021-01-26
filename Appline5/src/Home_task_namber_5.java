import java.util.Scanner;

public class Home_task_namber_5 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double variable1 = scan.nextDouble();
        System.out.println("Введите второе число: ");
        double variable2 = scan.nextDouble();
        double answer;
        System.out.println("Выберете одно арифметическое действие: ( +, -, *, / ) ");
        char operation = scan.next().charAt(0);
        switch(operation) {
            case '+':
                answer = variable1 + variable2;
                break;
            case '-':
                answer = variable1 - variable2;
                break;
            case '*':
                answer = variable1 * variable2;
                break;
            case '/':
                answer = variable1 / variable2;
                break;
            default:
               //System.out.println("Некорректный символ, попробуйте еще раз!");
                return;
        }
        System.out.println("Результат математической операции равен: " + answer);
    }
}
