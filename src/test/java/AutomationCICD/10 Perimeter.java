package AutomationCICD;

import java.util.Scanner;

class Perimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to perimeter calculator");
        System.out.println("Enter the length of all 4 sides in cms ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        double s4 = input.nextDouble();

        double perimeter = s1+s2+s3+s4;
        System.out.println("Calculated perimeter is : "+perimeter);

    }
}
