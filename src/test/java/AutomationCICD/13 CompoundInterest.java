package AutomationCICD;

import java.util.Scanner;

import static java.lang.Math.pow;

class CompoundInterest {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to Compound interest calculator");
        System.out.println("Please enter principle amount in Rs: ");
        int principle = input.nextInt();
        System.out.println("Please enter the rate of interest:");
        float rate = input.nextFloat();
        System.out.println("Now please enter the number of years you want to borrow this: ");
        float years = input.nextFloat();

        double compoundInterest = principle * pow((1  +rate / 100),years);
        System.out.println("Your compound interest is Rs:"+compoundInterest);
    }

}
