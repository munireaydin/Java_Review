package week12_review;

import static java.lang.Math.*;

public class Cylinder extends Shape implements Volume{

    private double height, radius;

    public Cylinder( double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double cals_area() {
        return 2* PI* pow(radius,2) + 2*PI*radius*height;
    }

    @Override
    public double cals_perimeter() {
        return (2 * radius) + (2 * height);
    }

    @Override
    public double calc_volume() {
        return PI * pow(radius,2) * height;
    }
}
