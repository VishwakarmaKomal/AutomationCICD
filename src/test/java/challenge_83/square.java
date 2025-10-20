package challenge_83;

public class square extends Shape{

    private double side;

    public square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
