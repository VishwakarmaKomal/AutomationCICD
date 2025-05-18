package AutomationCICD;

import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to Palindrome");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }


    }
    public static boolean isPalindrome(int num){
        int numCopy = num;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse == numCopy;

    }
}
