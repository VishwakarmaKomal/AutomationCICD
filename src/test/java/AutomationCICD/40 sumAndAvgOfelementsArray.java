package AutomationCICD;

import java.util.Scanner;

class sumAndAvgOfelementsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Sum and Average of Array elements");
        System.out.print("Please enter the size of Array: ");
        int s = input.nextInt();
        int[] Arr = new int[s];
        System.out.println("Enter the numbers in Array: ");
        int i = 0;
        while(i < Arr.length){
            Arr[i] = input.nextInt();
            i++;
        }

        int sum = sumOfArrayElements(Arr);
        System.out.println("Sum of elements of Array is : "+sum);
        float Avg = averageOfArrayElement(Arr);
        System.out.println("Average of elements of Array is : "+Avg);
       // System.out.println(Arr[0]);
    }

    public static int sumOfArrayElements(int[] arr){
        int sum = 0;
        int i= 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }
    public static float averageOfArrayElement(int[] arr){
        int sum = sumOfArrayElements(arr);
        float Avg = (float) sum / arr.length;
        return  Avg;

    }
}
