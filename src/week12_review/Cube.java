package week12_review;
import static java.lang.Math.*;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double cals_area() {
        return 6 * pow(side,2);

    }

    @Override
    public double cals_perimeter() {
        return 4 * side;
    }

    @Override
    public double calc_volume() {
       return pow(side, 3);
    }
}
