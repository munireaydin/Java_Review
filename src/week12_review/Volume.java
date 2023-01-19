package week12_review;

public interface Volume {

    boolean has_volume = true; // static & final

    double calc_volume();

    public static void shapeWithVolume(){
        System.out.println("ONLY the three dimensional shapes ahs volume");
    }

    public default void method1(){
        System.out.println("instance method of the child classes");
    }

}
/*
Create an interface named Volume:

            Variables:
                HAS_VOLUME

            Methods:
                calc_volume()
 */