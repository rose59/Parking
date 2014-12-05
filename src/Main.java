import com.thoughtworks.Parkinglot.Car;
import com.thoughtworks.Parkinglot.ParkingBoy;
import com.thoughtworks.Parkinglot.ParkingLot;
import com.thoughtworks.Parkinglot.Ticket;

public class Main {

    public static void main(String[] args) {
        //if I want to park my car
        ParkingLot parkingLot1 = new ParkingLot(2);
        ParkingLot parkingLot2 = new ParkingLot(2);
        ParkingBoy parkingBoy = new ParkingBoy();
        parkingBoy.addParkingLot(parkingLot1);
        parkingBoy.addParkingLot(parkingLot2);
        Car myCar = new Car("A1000");
        Car car1 = new Car("A1001");
        Car car2 = new Car("A1002");
        parkingBoy.addParkingLot(parkingBoy.getFirstParkingLot(myCar));
        Ticket ticket = parkingBoy.parkCar(myCar);
        //if I want to take my car use the ticket
        Car car = parkingBoy.getCar(ticket);
        System.out.println("myCar is:" + car.getCarId());

    }
}
