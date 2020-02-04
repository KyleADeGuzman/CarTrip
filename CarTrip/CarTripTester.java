public class CarTripTester{
  public static void main(String[] args){
    CarTrip1 car1 = new CarTrip1();
    CarTrip1 car2 = new CarTrip1(1542.5, 1800.0, 11.2, 6.1);
    car1.setMyTime(20.2);
    car2.setMyTime(4.0);
    System.out.println("Trip Distance " + car1.getTripDistance() + " Average Speed: " + car1.getAverageSpeed() + " Gas Mileage: " + car1.getGasMileage() + " Total Gas Price: " + car1.getTotalGasPrice(1.50));
    System.out.println("Trip Distance " + car2.getTripDistance() + " Average Speed: " + car2.getAverageSpeed() + " Gas Mileage: " + car2.getGasMileage() + " Total Gas Price: " + car2.getTotalGasPrice(1.75));
    System.out.println(car1.toString());
    System.out.println(car2.toString());
  }
}