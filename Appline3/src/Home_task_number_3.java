public class Home_task_number_3 {
    public static void main(String[]args)
    {
    int[]array = {100,27,8,44,72};
    int i;
    int sum;
    int mid =array[((array.length - 1)+1)/2]; //формула действует если длина массива нечетное!
    //System.out.println("Значение последнего элемента в массиве до смены: "+ last);
    //System.out.println("Значение среднего элемента в массиве: "+ mid);

     i = array[0];
     array[0] = array[array.length - 1] ;      //смена первого и последнего элемента массива
     array[array.length - 1] = i;


     System.out.println("Значение последнего элемента в массиве после смены: "+ array[4]); //проверка операции смены

     sum = array[0] + mid;
     System.out.println("Сумма первого и среднего элемент: " + sum);

    }
}
