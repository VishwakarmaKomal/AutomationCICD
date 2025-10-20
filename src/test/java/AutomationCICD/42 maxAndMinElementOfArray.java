package AutomationCICD;

import java.util.Scanner;

class maxAndMinElementOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to max and min elements of an Array");
        System.out.print("Please enter the size of array: ");
        int s = input.nextInt();
        int[] arr = new int[s];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]= input.nextInt();
            i++;
        }
        int maxNum = maxElement(arr);
        System.out.println("Maximum number of array is : "+maxNum);
        minElement(arr);
    }

    private static void minElement(int[] arr) {
        int min = arr[0];
        int i = 1;
        while(i < arr.length){
            if(arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        System.out.println("Minimum element of your array is : "+min);
    }

    public static int maxElement(int[] Arr){
        if(Arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int i = 1;
        int max= Arr[0];
        while (i < Arr.length){
            //max = Arr[i];
            if(Arr[i] > max){
                max = Arr[i];
            }
            i++;
        }
        //System.out.println("Maximum element of your Array is : "+max);
        return max;
    }
}
