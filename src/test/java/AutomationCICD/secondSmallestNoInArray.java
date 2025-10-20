package AutomationCICD;

import java.util.Arrays;

public class secondSmallestNoInArray {
    public static void main(String[] args) {
        int[] arr = {2,10,6,3,8};

        //sort the array first
//        Arrays.sort(arr);
//        for (int j : arr) {
//            System.out.println(j);
//        }
//        System.out.println("Second Smallest element of array is : "+arr[1]);

        //without sorting

        int small = arr[0];
        int secondsmall = -1;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > small){
                if(arr[i] < arr[i+1]){
                    secondsmall = arr[i];
                }
            }
            small = arr[i];
        }
        System.out.println("Second Smallest number is : "+secondsmall);
    }
}
