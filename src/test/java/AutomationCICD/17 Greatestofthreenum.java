package AutomationCICD;

import java.util.Scanner;

class Greatestofthreenum {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = input.nextInt();
        System.out.println("Enter the 3rd number: ");
        int n3 = input.nextInt();

       if (n1 > n2 && n1 > n3){
           System.out.println(n1 + " is greatest.");
        }
       else if(n1 < n2 && n2 > n3){
           System.out.println(n2+" is greatest");
       }
       else {
           System.out.println(n3 + "is greatest");
       }
    }
}
