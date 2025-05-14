package inheritaanceexample;

public class RoadVechile extends Vechile{
    public void travelOnRoad(){
        System.out.println("Travels on Road");
        super.color = "Green";
        super.start();
    }

    @Override
    public void start() {
        System.out.println("RoadVechile has started");
    }

    @Override
    public void stop() {
        System.out.println("RoadVechile has stopped");

    }

    @Override
    public void fuel() {
        System.out.println("RoadVechile has fueled");
    }
}
