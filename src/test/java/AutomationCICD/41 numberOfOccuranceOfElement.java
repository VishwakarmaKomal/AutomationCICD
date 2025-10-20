package AutomationCICD;

import java.util.Scanner;

class numberOfOccuranceOfElement {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to Number of Occurances check");
        System.out.print("Please enter the size of array: ");
        int s = input.nextInt();
        int[] Arr = new int[s];
        int i = 0;
        while(i < Arr.length){
            System.out.print("Enter number "+(i+1)+": ");
            Arr[i]=input.nextInt();
            i++;
        }
        System.out.println("Please enter the number for which number of Occurance needs to be find: ");
        int n = input.nextInt();
        int occ = numberOfOccurance(Arr,n);
        System.out.println("Number of Occurance of "+n+" is "+occ);
    }

    public static int numberOfOccurance(int[] arr,int num){
        int count = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                count++;
            }
            i++;
        }
       return count; //System.out.println("Number of Occurance of "+num+" is "+count);
    }
}
