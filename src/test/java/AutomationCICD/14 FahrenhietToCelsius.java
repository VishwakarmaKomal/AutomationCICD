package AutomationCICD;

import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to degree calculator");
        System.out.println("Enter the degree in Fahrenheit: ");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit-32) * 5/9;

        System.out.println("Temperature in celsius is : "+celsius);
    }
}
