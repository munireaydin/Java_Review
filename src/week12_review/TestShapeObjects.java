package week12_review;

public class TestShapeObjects {

    public static void main(String[] args) {

        Cube cube = new Cube(10);

        cube.method1();
        cube.calc_volume();

        System.out.println(Volume.has_volume);
        System.out.println(Cube.has_volume);

        cube.cals_area();
        cube.cals_perimeter();

        System.out.println(cube);

    }
}
