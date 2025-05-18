package AutomationCICD;

import java.util.Scanner;

class sumOddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number max number: ");
        int maxNum = input.nextInt();
        sumOddNumber(maxNum);
    }
    public static void sumOddNumber(int maxNum){
        int sum = 0;
        for( int i= 0; i<= maxNum; i++){
           if(i % 2 != 0){
               sum = sum + i;
           }
        }
        System.out.println("Sum of only Odd numbers from the list: "+sum);


    }
}
