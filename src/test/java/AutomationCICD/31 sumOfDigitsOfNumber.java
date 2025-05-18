package AutomationCICD;

import java.util.Scanner;

class sumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits of number");
        System.out.print("Please enter the number: ");
        int n = input.nextInt();
       int sum = sumOfDigits(n);
        System.out.println("Sum : "+sum);
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        if(n <= 0){
            return sum;
        }
        while (n > 0){// 236/10 = 23  236 % 10 = 6
           int r = n % 10;
           sum += r;
           n = n / 10;
        }
        return sum;
    }

}
