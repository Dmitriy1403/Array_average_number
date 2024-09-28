import java.util.Arrays;
import java.util.Random;

//Создайте массив из 20 случайных четных целых
//чисел. Вычислите среднее арифметическое
//элементов массива без учета минимального и
//максимального элементов массива



public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(49) * 2 + 2; // генерируем четное число в диапазоне от 2 до 98
        }


        System.out.println("Сгенерированный массив: " + Arrays.toString(array));


        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);


        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));

        // Вычисление суммы элементов без учета минимального и максимального
        int sum = 0;
        for (int i = 1; i < sortedArray.length - 1; i++) {
            sum += sortedArray[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / (sortedArray.length - 2);

        System.out.printf("Среднее арифметическое без учета минимального и максимального:%.2f ", average);


    }
}