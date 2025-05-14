package inheritaanceexample;

public class AirVechile extends Vechile{

    public void travelOnAir(){
        System.out.println("Travels on Air");
        super.color = "red";
    }

    @Override
    public void start() {
        System.out.println("AirVechile has started");
    }

    @Override
    public void stop() {
        System.out.println("AirVechile has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("AirVechile has fueled");
    }
}
