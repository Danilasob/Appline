import java.util.Scanner;
public class HomeTaskNumber10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение опрелеяющее размерность массива(кол-во строк): ");
        int rows = scan.nextInt();
        System.out.println("Введите значение опрелеяющее размерность массива(кол-во столбцов): ");
        int colums = scan.nextInt();
        int[][] array = new int[rows][colums];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Присвойте значение  array[" + i + "][" + j +  "] +  элементу массива: ");
                array[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
            {if (i >= 1){
                break;
            }
                System.out.print(array[i][j]*3+" ");
            }
            System.out.println();
        }
    }
}