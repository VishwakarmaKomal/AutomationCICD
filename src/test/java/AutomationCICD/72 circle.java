package AutomationCICD;

import java.util.Scanner;

class circle {
    double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    double areaCircle(){
        return (Math.PI * (Math.pow(radius,2)));
    }

    double circumference(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle data : Your radius in mm is "+radius+ "  Circumference is  "+circumference() +
                " Area of circle is "+areaCircle();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to circle class\n");
        System.out.print("Enter the radius of circle: ");
        double radius = input.nextDouble();
        circle c = new circle(radius);
        System.out.println(c);
    }
}
