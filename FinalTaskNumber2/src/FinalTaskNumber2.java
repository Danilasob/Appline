import java.util.Scanner;

public class FinalTaskNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Введите линейное уравнение: ");
            String TheEquation = scan.nextLine();
            int FirstVarieble;
            int SecondVarieble;
            int ThirdVarieble;
            int result;
            switch (TheEquation.charAt(1)) {
                case '+':
                    FirstVarieble = Character.getNumericValue(TheEquation.charAt(0));
                    SecondVarieble = Character.getNumericValue(TheEquation.charAt(2));
                    ThirdVarieble = Character.getNumericValue(TheEquation.charAt(4));
                    if (FirstVarieble >= 0 && FirstVarieble < 10 && SecondVarieble >= 0 && SecondVarieble < 10) {
                        result = FirstVarieble + SecondVarieble;
                        System.out.println("x = " + result);
                    } else if (FirstVarieble >= 0 && FirstVarieble < 10 && ThirdVarieble >= 0 && ThirdVarieble < 10) {
                        result = ThirdVarieble - FirstVarieble;
                        System.out.println("x = " + result);
                    } else if (SecondVarieble >= 0 && SecondVarieble < 10 && ThirdVarieble >= 0 && ThirdVarieble < 10) {
                        result = ThirdVarieble - SecondVarieble;
                        System.out.println("x = " + result);
                    }
                    break;
                case '-':
                    FirstVarieble = Character.getNumericValue(TheEquation.charAt(0));
                    SecondVarieble = Character.getNumericValue(TheEquation.charAt(2));
                    ThirdVarieble = Character.getNumericValue(TheEquation.charAt(4));
                    if (FirstVarieble >= 0 && FirstVarieble < 10 && SecondVarieble >= 0 && SecondVarieble < 10) {
                        result = FirstVarieble - SecondVarieble;
                        System.out.println("x = " + result);
                    } else if (FirstVarieble >= 0 && FirstVarieble < 10 && ThirdVarieble >= 0 && ThirdVarieble < 10) {
                        result = FirstVarieble - ThirdVarieble;
                        System.out.println("x = " + result);
                    } else if (SecondVarieble >= 0 && SecondVarieble < 10 && ThirdVarieble >= 0 && ThirdVarieble < 10) {
                        result = ThirdVarieble + SecondVarieble;
                        System.out.println("x = " + result);
                    }
                    break;
            }
        }
    }
