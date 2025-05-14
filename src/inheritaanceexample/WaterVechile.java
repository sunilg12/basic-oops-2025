package inheritaanceexample;

public class WaterVechile extends Vechile{

    public void travelOnWater(){
        System.out.println("Travels on Water");
        super.color = "blue";
    }

    @Override
    public void start() {
        System.out.println("WaterVechile has started");
    }

    @Override
    public void stop() {
        System.out.println("WaterVechile has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("WaterVechile has fueled");
    }
}
