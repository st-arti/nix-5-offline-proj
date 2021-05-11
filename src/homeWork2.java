import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Enter your size of array with  nums:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Our array: " + Arrays.toString(array));

        evenNumbers(array);
        countPositiveNumbers(array);
        greaterPreviousOne(array);
        countElements(array);
        reverseOrder(array);
        ex6(array);

    }
    //ex1
    public static void evenNumbers (int [] array) {
        System.out.println("Ex.1 - Even numbers of array");
        for (int i : array){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        } System.out.println();
    }

    //ex2
    public static void countPositiveNumbers (int [] array) {
        System.out.println("Ex.2 - Count of positive numbers among the elements of the array.");
        int col = 0;
        for (int i : array){
            if (i>0){
                col++;
            }
        }System.out.println(col);
    }
    public static void greaterPreviousOne(int [] array) {
        System.out.println("Ex.3 - Count of array elements greater than the previous one");
        int col = 0;
        for (int i = 1; i< array.length; i++){
            if (array[i-1] <  array[i]){
                col = col +1;
            }
        } System.out.println(col);
    }

    public static void countElements(int [] array) {
        System.out.println("Ex.4 - Count of elements that have two adjacent ones and, at the same time, both adjacent elements are less than the given one.");
        int col=0;
        for (int i = 1; i < array.length-1; i++) {
            if (array[i-1] < array[i] && array[i] > array[i+1]) {
                col = col +1;
            }
        }System.out.println(col);
    }
    public static void reverseOrder(int[] array) {
        System.out.println("Ex.5 - A program rearranges array elements in reverse order without using an additional array.");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    public static void ex6(int [] array) {
        System.out.println("Ex.6 - A program that permutes adjacent elements of an array");
        int a = 0;
        for (int i = 0; i < array.length - 1; i += 2) {
            a = array[i];
            array[i] = array[i + 1];
            array[i + 1] = a;
            System.out.print(array[i] + " " + array[i + 1] + " ");
        }
        if (array.length % 2 != 0) {
            System.out.print(array[array.length - 1]);

        }
    }
}