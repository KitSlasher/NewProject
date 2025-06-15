//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        TransportManager carManager = new TransportManager(car);
        TransportManager bikeManager = new TransportManager(bike);
        carManager.startTransport;
        bikeManager.startTransport;
    }
}
public interface Transport{
    public String move();
}
class Car implements Transport{
    public String move(){
        System.out.println("Машина пришла в движение");
    }
}
class Bike implements Transport{
    public String move(){
        System.out.println("Велосипед пришел в движение");
    }
}
class TransportManager{
    private final Transport transport;
    public startTransport(Transport transport){
        transport.move()
    }
}
