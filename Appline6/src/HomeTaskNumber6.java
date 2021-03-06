import java.util.Scanner;

public class HomeTaskNumber6 {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
            byte choice1 = scan.nextByte();
            if (choice1 == 1) {
                System.out.println("Выберите единицу измерения: 1 - центнер , 2 - грамм, 3 - килограмм, 4 - тонна");
                byte choice2 = scan.nextByte();
                switch (choice2) {
                    case 1:
                        System.out.println("Введите число (центнер): ");
                        double choice21 = scan.nextDouble();
                        System.out.println("Центнеры: " + choice21);
                        System.out.println("Граммы: " + choice21 * Math.pow(10, 5));
                        System.out.println("Килограммы: " + choice21 * Math.pow(10, 2));
                        System.out.println("Тонны: " + choice21 * Math.pow(10, -1));
                        break;
                    case 2:
                        System.out.println("Введите число (грамм): ");
                        double choice22 = scan.nextDouble();
                        System.out.println("Граммы: " + choice22);
                        System.out.println("Центнеры: " + choice22 * Math.pow(10, -5));
                        System.out.println("Килограммы: " + choice22 * Math.pow(10, -3));
                        System.out.println("Тонны: " + choice22 * Math.pow(10, -6));
                        break;
                    case 3:
                        System.out.println("Введите число (килограмм): ");
                        double choice23 = scan.nextDouble();
                        System.out.println("Килограммы: " + choice23);
                        System.out.println("Центнеры: " + choice23 * Math.pow(10, -2));
                        System.out.println("Граммы: " + choice23 * Math.pow(10, 3));
                        System.out.println("Тонны: " + choice23 * Math.pow(10, -3));
                        break;
                    case 4:
                        System.out.println("Введите число (тонна) ");
                        double choice24 = scan.nextDouble();
                        System.out.println("Тонны: " + choice24);
                        System.out.println("Центнеры: " + choice24 * 10);
                        System.out.println("Граммы: " + choice24 * Math.pow(10, 6));
                        System.out.println("Килограммы: " + choice24 * Math.pow(10, 3));
                        break;
                    default:
                        System.out.println("Некорректное значение, введите значение от 0 до 4");
                        break;
                }
            } else if (choice1 == 2) {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                byte choice3 = scan.nextByte();
                    switch (choice3) {
                        case 1:
                            System.out.println("Введите число (метров): ");
                            double choice31 = scan.nextDouble();
                            System.out.println("Метры: " + choice31);
                            System.out.println("Мили: " + choice31 * 0.000621371);
                            System.out.println("Ярды: " + choice31 * 1.09361329834);
                            System.out.println("Футы: " + choice31 * 3.28083989501);
                            break;
                        case 2:
                            System.out.println("Введите число (миль): ");
                            double choice32 = scan.nextDouble();
                            System.out.println("Мили: " + choice32);
                            System.out.println("Метры: " + choice32 * 1609.344);
                            System.out.println("Ярды: " + choice32 * 1760);
                            System.out.println("Футы: " + choice32 * 5280);
                            break;
                        case 3:
                            System.out.println("Введите число (ярдов): ");
                            double choice33 = scan.nextDouble();
                            System.out.println("Ярды: " + choice33);
                            System.out.println("Метры: " + choice33 * 0.9144);
                            System.out.println("Мили: " + choice33 * 0.00056818182);
                            System.out.println("Футы: " + choice33 * 3);
                            break;
                        case 4:
                            System.out.println("Введите число: (футов) ");
                            double choice34 = scan.nextDouble();
                            System.out.println("Футы: " + choice34);
                            System.out.println("Метры: " + choice34 * 0.3048);
                            System.out.println("Мили: " + choice34 * 0.00018939394);
                            System.out.println("Ярды: " + choice34 * 0.333333333);
                            break;
                        default:
                            System.out.println("Некорректное значение, введите значение от 0 до 4");
                            break;
                    }
            } else {
                System.out.println("Некорректное значение, введите 0 или 1");
            }
        }
    }
}
