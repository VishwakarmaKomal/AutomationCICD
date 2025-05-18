package AutomationCICD;

import java.util.Scanner;

class OddEvenCheck {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to Odd Even check");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if(num % 2 ==0 ){
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
