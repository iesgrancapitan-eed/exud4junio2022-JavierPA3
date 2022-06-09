package com.JavierPostigoArevalo.examen.junio;


class bike implements vehicle {  
  private int speed;
  private int gear;
    
  @Override
public void changeGear(int newGear){     
      gear = newGear;
  }
    
  
  @Override
public int getSpeed() {
	return speed;
}


@Override
public void setSpeed(int speed) {
	this.speed = speed;
}



@Override
public void speedUp(int increment){
      speed = speed + increment;
  }
    
  @Override
public void applyBrakes(int decrement){     
      speed = speed - decrement;
  }
    
  @Override
public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }


@Override
public String toString() {
	return "bike [speed=" + speed + ", gear=" + gear + "]";
}
@Override
public int getGear() {
	return gear;
}


@Override
public void setGear(int gear) {
	this.gear = gear;
}


}

//class Bike implements Vehicle {
//    
//  int speed;
//  int gear;
//
//  @Override
//  public void changeGear(int newGear){
//        
//      gear = newGear;
//  }
//    
//  @Override
//  public void speedUp(int increment){
//        
//      speed = speed + increment;
//  }
//
// @Override
//  public void applyBrakes(int decrement){
//        
//      speed = speed - decrement;
//  }
//    
//  public void printStates() {
//      System.out.println("speed: " + speed
//          + " gear: " + gear);
//  } 
//}

//class GFG {
//    
//  public static void main (String[] args) {
//    
//      // creating an inatance of bike
//      // doing some operations
//      bike bicycle = new bike();
//      bicycle.changeGear(2);
//      bicycle.speedUp(3);
//      bicycle.applyBrakes(1);
//        
//      System.out.println("bike present state :");
//      bicycle.printStates();
//        
//      // creating instance of the bike.
//      Bike bike = new Bike();
//      bike.changeGear(1);
//      bike.speedUp(4);
//      bike.applyBrakes(3);
//        
//      System.out.println("Bike present state :");
//      bike.printStates();
//  }
//}