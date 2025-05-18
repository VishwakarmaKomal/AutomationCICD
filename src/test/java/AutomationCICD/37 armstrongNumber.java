package AutomationCICD;

import java.util.Scanner;

class armstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean isArmstrong =isArmstrong(num);
        if(isArmstrong){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("The number is not Armstrong");
        }

    }

    public static boolean isArmstrong(int num){
        int noOfdigit = noOfdigits(num);
        int N = num;
        int result = 0;
        while(num > 0){
            int lastdigit = num % 10;// remainder and do the cube of that number and store it in variable
            result = result + cube(lastdigit,noOfdigit);
            num = num / 10;
        }
        System.out.println("Result : "+result);
        return result == N;
    }
    public static int noOfdigits(int num){
        int digits =0;
        while(num > 0){
            digits++;
            num /= 10;
        }
        return digits;

    }

    private static int cube(int r, int noOfdigits) {
        int numCube = 1;
        int i= 0;
        while(i < noOfdigits){
            numCube *= r;
            i++;
        }
        return numCube;
    }
}
