public class Abstract {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
      //  cp.fly();
      Airport a = new Airport();
      a.permit(cp);
      a.permit(pp);
    }
}

abstract class Plane{
    abstract void takeOff();
    abstract void fly();
    abstract void land();

}
class CargoPlane extends Plane{
    void takeOff(){
        System.out.println("Cargo Plane takin-off from a long sized runway");
    }
    void fly(){
        System.out.println("Cargo Plane fly at low hight");
    }
    void land(){
        System.out.println("Cargo Plane land from a long sized runway");
    }
}

class PassengerPlane extends Plane{
    void takeOff(){
        System.out.println("Passenger Plane takin-off from a long sized runway");
    }
    void fly(){
        System.out.println("Passenger Plane fly at low hight");
    }
    void land(){
        System.out.println("Passenger Plane land from a long sized runway");
    }
}

class Airport{
    void permit(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}
