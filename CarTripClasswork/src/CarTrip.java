//By Kyle DeGuzman
//Main Code
public class CarTrip {

	//Class Members Instance Variables
	private double myGallonsUsed, myStartOdometer, myEndOdometer, myTime;
	  
	  public CarTrip(){
	    this.myStartOdometer = 1000.0;
	    this.myEndOdometer = 2000.0;
	    this.myTime = 10.5;
	    this.myGallonsUsed = 3.0;
	  }
	  public CarTrip(double so, double eo, double g, double t){
	    this.myStartOdometer = so;
	    this.myEndOdometer = eo;
	    this.myTime = t;
	    this.myGallonsUsed = g;
	  }
	  // Getter
	  //i. myStartOdometer
	  // Instance Variables
	  public double getMyStartOdometer(){return this.myStartOdometer;
	  }
	  // Getter
	  //ii. myEndOdometer
	  // Instance Variables
	  public double getMyEndOdometer(){return this.myEndOdometer;
	  }
	  // Getter
	  //iv. myGallonsUsed
	  // Instance Variables
	  public double getMyGallonsUsed(){return this.myGallonsUsed;
	  }
	  // Getter
	  //iii. myTime
	  // Instance Variables
	  public double getMyTime(){return this.myTime;
	  }
	  //Class Members Instance Method 
	  public void setMyStartOdometer(int so){this.myStartOdometer = so;
	  }
	  //Class Members Instance Method
	  public void setMyEndOdometer(int eo){this.myEndOdometer = eo;
	  }
	  //Class Members Instance Method
	  public void setMyGallonsUsed(double g){this.myGallonsUsed = g;
	  }
	  //Class Members Instance Method
	  public void setMyTime(double t){this.myTime = t;
	  }
	  // ii. getTripDistance()
	  public double getTripDistance(){
	    return getMyEndOdometer() - getMyStartOdometer();
	  }
	  // iii. getAverageSpeed()
	  public double getAverageSpeed(){
	    double distance = getMyEndOdometer() - getMyStartOdometer();
	    return distance /getMyTime();
	  }
	  // iv. getGasMileage()
	  public double getGasMileage(){
	    double distance = getMyEndOdometer() - getMyStartOdometer();
	    return distance / getMyGallonsUsed();
	  }
	  // v. getTotalGasPrice(double pricePerGallon)
	  public double getTotalGasPrice(double pricePerGallon){
	    return getGasMileage() * pricePerGallon;
	  }
	  //Call the toString method with each object
	  public String toString(){
	    return "Start: " + getMyStartOdometer() + " miles End: " + getMyEndOdometer() + " miles Gallons used: " + getMyGallonsUsed() + " Time: " + getMyTime();
	  }
	}