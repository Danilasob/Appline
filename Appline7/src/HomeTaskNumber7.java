import java.util.Scanner;

public class HomeTaskNumber7 {
    public static void main(String []args){
        int x = 27;
        int y = 72;
        int z = 13;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение опрелеяющее размерность массива: ");
        int AmountOfElements = scan.nextInt();
        int [] array = new int[AmountOfElements];
        for (int i =0; i<array.length;i++)
        {
            System.out.println("Присвойте значение " + i + " элементу массива: ");
            array[i] = scan.nextInt();
        }
        for(int i =0; i<array.length;i++) {
            if (array[i] == x || array[i] == y || array[i] == z){
                System.out.println("Данное значение " + array[i] + /*" " +i+ " элемента массива" +*/ " имеется в константах");
            }
        }
        /*System.out.print("Ваш массив:{ ");
        for (int i =0; i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");*/
    }
}
