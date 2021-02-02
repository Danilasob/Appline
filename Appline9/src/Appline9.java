import java.util.Scanner;
public class Appline9{
    public static void main(String[]args){
        double sum = 0;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение опрелеяющее размерность массива: ");
        int AmountOfElements = scan.nextInt();
        int [] array = new int[AmountOfElements];
        for (int i =0; i<array.length;i++)
        {
            System.out.println("Присвойте значение " + i + " элементу массива: ");
            array[i] = scan.nextInt();
        }
        for (int i =0; i<array.length;i++){
            sum= sum+array[i];
        }
        average = sum/array.length;
        //System.out.println("Среднее арифметическое: " + average);
        System.out.print("Итоговый массив:{ ");
        for (int i =0; i<array.length;i++)
        {
            System.out.print(array[i] * average + " ");
        }
        System.out.println("}");
    }
}
