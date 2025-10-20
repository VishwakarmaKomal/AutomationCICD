package AutomationCICD;

import java.util.Scanner;

class TernaryOperatorFindMin {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num1 , num2;
        System.out.print("Enter the value for num 1: ");
        num1 = input.nextInt();
        System.out.println("Enter the value for num 2: ");
        num2 = input.nextInt();

        //Min value bet 2 num
        int minNum = num1 < num2 ? num1 : num2;
        System.out.println("Minimum is : "+minNum);

        // Even or Odd
        String result = num1 %2 == 0 ? "Even" : "Odd";
        System.out.println(num1+" is " +result);

        //absolute value of a number
        int absVal = num2 >= 0 ? num2 : -num2;
        System.out.println("Absolute value of "+ num2+ " is "+absVal);





    }
}
