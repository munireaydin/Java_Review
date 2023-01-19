package week12_review;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape{

    private double radius;


    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double cals_area() {
        return pow(radius,2) *PI;
    }

    @Override
    public double cals_perimeter() {
        return 2 * PI *radius;
    }
}
