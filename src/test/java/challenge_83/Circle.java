package challenge_83;

public class Circle extends Shape {
    private double radiusIncm;

    public Circle(double radiusIncm) {
        this.radiusIncm = radiusIncm;
    }

    public double getRadiusIncm() {
        return radiusIncm;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusIncm,2);
    }
}
