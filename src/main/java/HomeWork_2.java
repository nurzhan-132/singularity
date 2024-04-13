import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {
        /*************** 1-task *********************/
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr1));

        /*************** 2-task *********************/
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

        /*************** 3-task *********************/
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        /*************** 4-task *********************/
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] arr4 = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == j) arr4[i][j] = 1;
                arr4[i][size - 1 - i] = 1;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr4[i]));
        }

        /*************** 5-task *********************/
        int[] arr5 = {5,-56, 89, 500, -600, 0, 45652, 123};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if(arr5[i] < min)
                min = arr5[i];
            if(arr5[i] > max)
                max = arr5[i];
        }
        System.out.println("Min: " + min + "\n" + "Max: " + max);
        // 2-way
//        Arrays.sort(arr5);
//        System.out.println(arr5[0] + "\n" + arr5[arr5.length - 1]);

        /*************** 6-task *********************/
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[] {1, 1, 1, 2, 1}));

        /** For Task-7, I looked for the internet, but I was unable to solve it on my own*/
    }

    public static boolean checkBalance(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int k = i; k < array.length; k++) {
                rightSum += array[k];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}
