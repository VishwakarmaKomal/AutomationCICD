package AutomationCICD;

import java.util.Scanner;

class NumpositivenegativeChk {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number check");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("The number is positive");
        }
        else if(num < 0 ){
            System.out.println("The number is negative");
        }
        else
            System.out.println(" It is Zero");
    }
}
