import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //System.out.print(Arrays.toString(generateRandomArray()));
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxCash = 200;
        int minCash = 300000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCash) {
                maxCash = arr[i];
            }
            if (arr[i] < minCash)
                minCash = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальная сумма трат за день составила " + maxCash + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minCash + " рублей");


    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        double averageSum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            averageSum = sum / arr.length;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        System.out.println("Сумма трат за месяц составила " + averageSum + " рублей");


    }


    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
        //дополнительный вариант решени
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            int n = reverseFullName.length;
            temp = reverseFullName[n - i - 1];
            reverseFullName[n - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

    }

}
