package AutomationCICD;

import java.util.Scanner;

class sumAndAverage2DArray {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum and Average of 2D Array");
        System.out.println("Enter the values for Array 1: ");
        int[][] Arr1 = ArrayUtility.input2DArray();
        long sum = sumOf2DArray(Arr1);
        System.out.println("Sum of 2D array is : "+ sum);

        double Average  = averageOf2DArray(Arr1);
        System.out.println("Average of array is : "+Average);


    }

    private static double averageOf2DArray(int[][] arr1) {
        if(arr1.length == 0){
            return 0;
        }
        int  rows = arr1.length;
        int col = arr1[0].length;
        double size = rows * col;

        return sumOf2DArray(arr1)/size;
    }

    public static long sumOf2DArray(int[][] Arr1){
        long sum = 0;
        int i = 0;
        while (i < Arr1.length){
            int j = 0;
            while(j < Arr1[i].length){
                sum += Arr1[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
