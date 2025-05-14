package inheritaanceexample;

public class MainInheritanceClass {
    public static void main(String[] args) {


        System.out.println("---------------Vechile parent class------------------");
        Vechile v1 = new Vechile();
        v1.start();
        v1.stop();
        v1.fuel();

        System.out.println("---------------AirVechile parent class------------------");
        AirVechile av1 = new AirVechile();
        av1.start();
        av1.stop();
        av1.fuel();
        av1.travelOnAir();

        System.out.println("---------------WaterVechile parent class------------------");
        WaterVechile wv1 = new WaterVechile();
        wv1.start();
        wv1.stop();
        wv1.fuel();
        wv1.travelOnWater();

        System.out.println("---------------RoadVechile parent class------------------");
        RoadVechile rv1 = new RoadVechile();
        rv1.start();
        rv1.stop();
        rv1.fuel();
        rv1.travelOnRoad();
    }
}
