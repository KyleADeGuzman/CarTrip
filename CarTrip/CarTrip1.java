public class CarTrip1 {

private double myGallonsUsed, myStartOdometer, myEndOdometer, myTime;
	  
	  public CarTrip1(){
	    this.myStartOdometer = 1000.0;
	    this.myEndOdometer = 2000.0;
	    this.myTime = 10.5;
	    this.myGallonsUsed = 3.0;
	  }
	  public CarTrip1(double so, double eo, double g, double t){
	    this.myStartOdometer = so;
	    this.myEndOdometer = eo;
	    this.myTime = t;
	    this.myGallonsUsed = g;
	  }
	  public double getMyStartOdometer(){return this.myStartOdometer;}
	  public double getMyEndOdometer(){return this.myEndOdometer;}
	  public double getMyGallonsUsed(){return this.myGallonsUsed;}
	  public double getMyTime(){return this.myTime;}
	  public void setMyStartOdometer(int so){this.myStartOdometer = so;}
	  public void setMyEndOdometer(int eo){this.myEndOdometer = eo;}
	  public void setMyGallonsUsed(double g){this.myGallonsUsed = g;}
	  public void setMyTime(double t){this.myTime = t;}
	  public double getTripDistance(){
	    return getMyEndOdometer() - getMyStartOdometer();
	  }
	  public double getAverageSpeed(){
	    double distance = getMyEndOdometer() - getMyStartOdometer();
	    return distance /getMyTime();
	  }
	  public double getGasMileage(){
	    double distance = getMyEndOdometer() - getMyStartOdometer();
	    return distance / getMyGallonsUsed();
	  }
	  public double getTotalGasPrice(double pricePerGallon){
	    return getGasMileage() * pricePerGallon;
	  }
	  public String toString(){
	    return "Start: " + getMyStartOdometer() + " miles End: " + getMyEndOdometer() + " miles Gallons used: " + getMyGallonsUsed() + " Time: " + getMyTime();
	  }
	}