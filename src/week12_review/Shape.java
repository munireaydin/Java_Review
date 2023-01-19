package week12_review;

import java.text.DecimalFormat;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double cals_area();

    public abstract double cals_perimeter();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name +"{" +
                "area='" + df.format(cals_area()) + '\'' +
                ", perimeter='" + df.format(cals_perimeter()) + '\'' +
                '}';
    }
}
