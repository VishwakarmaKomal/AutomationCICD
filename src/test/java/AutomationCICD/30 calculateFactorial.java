package AutomationCICD;

import java.util.Scanner;

class calculateFactorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = input.nextInt();
        long factorial = calFactorial(n);
        System.out.println("Factorial of "+n+ " is "+ factorial);

    }

    private static long calFactorial(int n) {
        long result = 1;
        if(n <=1 ){
            return result;
        }
        for(int i = 2; i <= n; i++){// 5*4*3*2*1
            result = result * i;
        }
        return result;
    }

}
