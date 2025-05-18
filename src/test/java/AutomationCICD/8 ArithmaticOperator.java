package AutomationCICD;

import java.util.Scanner;

class ArithmaticOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int n1 = input.nextInt();
        System.out.println("Enter the 2nd number : ");
        int n2 = input.nextInt();

        System.out.println("Addition: "+ (n1+n2));
        System.out.println("Subtraction: "+(n1-n2));
        System.out.println("Multiplication: "+(n1*n2));
        System.out.println("Division: "+(n1/n2));
        System.out.println("Remainder: "+(n1%n2));
    }
}
