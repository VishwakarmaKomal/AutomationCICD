package AutomationCICD;

import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series");
        System.out.print("Please enter the number upto which series has to be print: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci series : ");
        printFibonacci(num);
    }
    public static void printFibonacci(int num){


        if(num < 0 ){
            return;
        }
        System.out.print("0 ");
        if(num == 0){
            return;
        }
        System.out.print("1 ");
        int num1 = 0;
        int num2 = 1;
        while(num1 + num2 <= num ){
            int num3 = num1 + num2;
            System.out.print(num3+ " ");
            num1 = num2;
            num2 = num3;

        }
    }
}
