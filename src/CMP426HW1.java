import java.util.Scanner;

public class CMP426HW1 {

    public static void main(String[] args) {
        int Num;
        int i;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter, how many numbers do you want in your array: ");
        Num = scnr.nextInt();

        int[] arr = new int[Num];
        System.out.println("Please enter " + Num + " numbers: ");
        for (i = 0; i < Num; i++) {
            arr[i] = scnr.nextInt();
        }

        sum(arr);
        average(arr);
        max(arr);
        min(arr);

    }

    public static void sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum is: " + sum);
    }

    public static void average(int[] arr) {
        double sum = 0;
        double avg = 0.0;

        for (int j : arr) {
            sum += j;
        }
        avg = sum / arr.length;

        System.out.println("The average is: " + avg);
    }

    public static void max(int[] arr) {
        int maxVal = arr[0];

        for (int j : arr) {
            if (maxVal <= j)
                maxVal = j;
        }
        System.out.println("The max is: " + maxVal);
    }

    public static void min(int[] arr) {
        int minVal = arr[0];

        for (int j : arr) {
            if (minVal >= j)
                minVal = j;
        }
        System.out.println("The min is: " + minVal);
    }
}