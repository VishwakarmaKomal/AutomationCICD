package AutomationCICD;

import java.util.Scanner;

class ProductOfloatingnumber {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter 1st floating number:");
        float n1 = input.nextFloat();
        System.out.println("Enter 2nd floating number: ");
        float n2 = input.nextFloat();

        float product = n1*n2;

        System.out.println("Product of both numbers = "+product);
    }
}
