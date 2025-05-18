package AutomationCICD;

import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the 1st number: ");
        int first = input.nextInt();
        System.out.println("Please enter the 2nd number: ");
        int second = input.nextInt();
        int LCM = lcm(first, second);
        System.out.println("LCM of "+first+ " and "+second+ " is: "+LCM);

    }
    public static int lcm(int first, int second){
        int i= 1;
        while(true){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }

    }
}
