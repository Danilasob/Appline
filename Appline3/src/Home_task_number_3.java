public class Home_task_number_3 {
    public static void main(String[]args)
    {
    int[]array = {10,20,30,40,50};

    int i;
    int sum;
    int last = array[array.length - 1];;
    int mid =array[0] +(array[array.length - 1] - array[0])/2; //формула действует если длина массива нечетное!
    //System.out.println("Значение последнего элемента в массиве до смены: "+ last);
    //System.out.println("Значение среднего элемента в массиве: "+ mid);


     i = array[0];      //смена первого и последнего элемента массива
     array[0] = last;
     last = array[4];
     array[4]= i;

     //System.out.println("Значение последнего элемента в массиве после смены: "+ array[4]); //проверка операции смены

     sum = array[0] + mid;
     System.out.println("Сумма первого и среднего элемент: " + sum);

    }
}
