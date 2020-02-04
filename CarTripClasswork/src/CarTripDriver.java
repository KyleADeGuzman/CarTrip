//By Kyle DeGuzman
//Driver Code
public class CarTripDriver{
  public static void main(String[] args){
    CarTrip car1 = new CarTrip();
    CarTrip car2 = new CarTrip(1542.5, 1800.0, 11.2, 7.1);
    car1.setMyTime(30.2);
    car2.setMyTime(4.0);
    System.out.println("Trip Distance " + car1.getTripDistance() + " Average Speed: " + car1.getAverageSpeed() + " Gas Mileage: " + car1.getGasMileage() + " Total Gas Price: " + car1.getTotalGasPrice(1.50));
    System.out.println("Trip Distance " + car2.getTripDistance() + " Average Speed: " + car2.getAverageSpeed() + " Gas Mileage: " + car2.getGasMileage() + " Total Gas Price: " + car2.getTotalGasPrice(1.75));
    System.out.println(car1.toString());
    System.out.println(car2.toString());
  }
}