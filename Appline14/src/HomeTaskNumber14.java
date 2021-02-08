public class HomeTaskNumber14 {
    public static void main(String []args){
        double[] array = new double[15];
        byte min= -20;
        byte max = 20;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((Math.random() * ((max - min) + 1)) + min);
            System.out.print(array[i] + " ");
        }
        System.out.println();
            double min1 = array[0], max1 = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min1) {
                    min1 = array[i];
                } else if (array[i] > max1) {
                    max1 = array[i];
                }
            }
            System.out.println("Минимальное значение " + min1);
            System.out.println("Максимальное значение " + max1);
            if(Math.abs(max1) > Math.abs(min1))
            {
                System.out.println("Наибольшее по модулю (максимальное значение) : "+ Math.abs(max1));
            }
            else if(Math.abs(max1) < Math.abs(min1))
            {
                System.out.println("Наибольшее по модулю (минимальное значение) : " + Math.abs(min1));
            }
            else {
                System.out.println("Модуль максимального значения равен модулю минимального значения");
            }
        }
    }

