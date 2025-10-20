package AutomationCICD;

import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to delete element of Array\n");
        System.out.print("Enter the size of Array: ");
        int s = input.nextInt();
        int[] arr = new int[s];
        int i = 0 ;
        while(i < arr.length){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Please enter the elements to be deleted: ");
        int numToDelete = input.nextInt();
        int[] newArray = DeleteElement(arr, numToDelete);
        System.out.println("Here is your new array: ");
        int j = 0;
        while(j < newArray.length){
            System.out.print(newArray[j]+ " ");
            j++;
        }
    }
    public static int[] DeleteElement(int[] arr, int numToDelete){
        int occ = numberOfOccuranceOfElement.numberOfOccurance(arr,numToDelete);
        if(occ == 0){
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArray = new int[newSize];

        int i = 0, j = 0;
        while( i < arr.length){
            if(arr[i] != numToDelete){
                newArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
