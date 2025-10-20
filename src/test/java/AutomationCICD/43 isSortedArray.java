package AutomationCICD;

import java.util.Scanner;

class isSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sorted array Check\n");
        System.out.print("Please enter the size of your Array: ");
        int s = input.nextInt();
        int[] Arr = new int[s];
        int i = 0;
        while (i < Arr.length) {
            System.out.print("Enter element "+(i+1)+" : ");
            Arr[i] = input.nextInt();
            i++;
        }
        boolean isIncreasing = isIncreasing(Arr);
        boolean isDecreasing = isDecreasing(Arr);
        if(isIncreasing || isDecreasing){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isIncreasing(int[] arr){
        int i = 1 ;
        while (i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
