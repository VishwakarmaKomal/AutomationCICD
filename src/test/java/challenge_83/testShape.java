package challenge_83;

public class testShape {
    public static void main(String[] args) {
        Circle c = new Circle(2.3);
        square sq = new square(5.01);

        System.out.printf("Area of Circle is %5.2f\n" , c.calculateArea());//rounding to 2 digit after decimal and 5 is before decimal 5 digit
        System.out.printf("Area of Square is %5.2f\n" , sq.calculateArea());
        
    }
    
    
}
