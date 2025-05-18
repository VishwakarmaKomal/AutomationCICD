package AutomationCICD;

import java.util.Scanner;

class reverseDigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse of digits of a number");
        System.out.print("Please enter the 1st number: ");
        int num = input.nextInt();
        int reverse = reverseDigit(num);
        System.out.println("Reverse of your number is : "+reverse);
    }

    public static int reverseDigit(int num){
        int rev = 0;
        while(num > 0){
           int digit = num % 10;
           rev = rev * 10 + digit;
           num /= 10;
        }
        return rev;
    }
}
