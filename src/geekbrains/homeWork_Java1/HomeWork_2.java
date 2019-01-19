package geekbrains.homeWork_Java1;

/*
Java. Level 1. Home work 2.

@author Sergey Bondarenko
@version dated Jan 18, 2019
 */

import java.util.Arrays;

public class HomeWork_2 {

    public static void main(String[] args) {

        //Task 1. Replace the numbers in the array
        printHeader("Task 1. Replace the numbers in the array") ;
        invertArray();

        //Task 2. Fill array of numbers
        printHeader("Task 2. Fill array of numbers") ;
        fillArray();

        //Task 3. To multiply the numbers in the array by the condition
        printHeader("Task 3. To multiply the numbers in the array by the condition") ;
        multiplyArray();

        //Task 4. To fill the diagonal of a two-dimensional square array
        printHeader("Task 4. To fill the diagonal of a two-dimensional square array") ;
        fillDiagonalSquareArray();

        //Task 5. Find the minimum and maximum numbers in the array
        printHeader("Task 5. Find the minimum and maximum numbers in the array") ;
        findMinMaxArray();

        //Task 6. Find the middle of the array of numbers by their sum
        printHeader("Task 6. Find the middle of the array of numbers by their sum") ;
        int[][] arr = {
                {4,1,4,9,0},
                {4,1,4,9,1},
                {1,1,1,1,1},
        };

        for(int i= 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i])+ " - " + findMiddleArray(arr[i])) ;
        }

        // Task 7. Move array elements in the "N" positions
        printHeader("Task 7. Move array elements in the \"N\" positions") ;

        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num) + " - initial array of numbers");

        // n - Move array elements in the 1 positions back
        moveArrayElemens(num,1);

        // n - Move array elements in the -2 positions forward
        moveArrayElemens(num,-2);
    }

    //Task 1. Replace the numbers in the array
    public static void invertArray()
    {
        int[] nums = {1,1,0,0,1,0,1,1,0,0};

        System.out.println(Arrays.toString(nums) + " - initial array of numbers");

        for(int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] + 1)%2;
        }

        System.out.println(Arrays.toString(nums) + " - modified array of numbers");
    }

    //Task 2. Fill array of numbers
    public static void fillArray() {
        int[] nums = new int[8];

        for (int i = 0; i < nums.length; i++) nums[i] = 3 * i;

        System.out.println(Arrays.toString(nums));
    }

    //Task 3. To multiply the numbers in the array by the condition
    public static void multiplyArray()
    {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(nums) + " - initial array of numbers");

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 6) nums[i] *= 2;
        }

        System.out.println(Arrays.toString(nums) + " - modified array of numbers");
    }

    //Task 4. To fill the diagonal of a two-dimensional array
    public static void fillDiagonalSquareArray() {
        int[][] squareArray = new int[5][5];
        for (int i = 0; i < squareArray.length; i++) {

            squareArray[i][i] = 1;
            squareArray[i][squareArray.length - (i+1)] = 1;

            System.out.println(Arrays.toString(squareArray[i]));
        }
    }

    //Task 5. Find the minimum and maximum numbers in the array
    public static void findMinMaxArray() {
        int[] arr = {15, 2, 11, 4, 5, 41, 8, 9};

        int min = arr[0];
        int max = arr[0];

        System.out.println("array  : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("minimum: " + min);
        System.out.println("maximum: " + max);
    }

    //Task 6. Find the middle of the array of numbers by their sum
    public static boolean findMiddleArray(int [] arr) {
        int sum = 0;
        int runningSum = 0;
        boolean middleFound = false;

        // get the sum of the array numbers
        for (int i = 0; i < arr.length; i++) sum += arr[i];

        // find the middle of the array of numbers by their sum
        for (int i = 0; i < arr.length - 1; i++) {
            runningSum += arr[i];
            sum -= arr[i];
            if (runningSum == sum) return true;
        }
        return false;
    }

    //Task 7. Move array elements in the "N" positions
    public static void moveArrayElemens(int [] arr, int n) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        int p = n;
        if(n<0) n += arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = arrCopy[(i +(n % arr.length)) % arr.length];
        }
        System.out.println(Arrays.toString(arr) + " - Move array elements in the " + ((p<0)? -p + " forward": p +" back"));
    }

    // Print the header of the task
    public static void printHeader ( String header)
    {
        System.out.println("\n\t************************************* \n\t" + header + "\n");
    }
}
