package AutomationCICD;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple interest calculator");
        System.out.println("Please enter your principle amount in rs: ");
        int principle = input.nextInt();
        System.out.println("Enter the rate:");
        float rate = input.nextFloat();
        System.out.println("Now pls tell for how many years you are borrowing this: ");
        float years = input.nextFloat();

        float interest = (principle * rate * years)/100;
        System.out.println("Your Simple interest is Rs:"+interest);
    }
}
