package AutomationCICD;

import java.util.Scanner;

public class ArrayUtility {
    public static void main(String[] args) {

    }
    public static int[] arrayInput(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int s  = input.nextInt();
        int[] arr = new int[s];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        int  i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + "  ");
            i++;
        }
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of rows: ");
        int row = input.nextInt();
        System.out.println("Please enter the size of column: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        int i= 0;
        while(i < row){
            int j = 0;
            while(j < col){
                System.out.println("Please enter element rows "+ (i+1) + ", column "+(j+1)+" : ");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return arr;
    }

}
