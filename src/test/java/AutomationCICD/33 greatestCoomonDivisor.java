package AutomationCICD;

import java.util.Scanner;

class greatestCoomonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the 1st number: ");
        int first = input.nextInt();
        System.out.println("Please enter the 2nd number: ");
        int second = input.nextInt();
        int gcd = GCD(first,second);
        System.out.println("Greatest common divisor of two number is : "+gcd);
    }
    public static int GCD(int first, int second){
        int gcd = 1;
        int i= 2;
        int least = least(first,second);
        while(i <= least){
            if(first % i == 0 && second % i == 0){
                gcd = i;

            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
