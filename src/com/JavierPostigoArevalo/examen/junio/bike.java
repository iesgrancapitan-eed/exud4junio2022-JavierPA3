package com.JavierPostigoArevalo.examen.junio;


/**
 * Esta clase simula el comportamiento de una bicicleta
 * @author Javier
 *
 */
class bike implements vehicle { 
	/**
	 * Argumento speed.
	 */
  private int speed;
  
  /**
	 * Argumento gear.
	 */
  private int gear;
    
  /**
   * Cambiamos el equipo.
   * @param int newGear
   * 
   * @Override

   */
  @Override
public void changeGear(int newGear){     
      gear = newGear;
  }
    
/**
 * Obtenemos la velocidad de la bicicleta.
 * @Override
 * @return speed
 */
@Override
public int getSpeed() {
	return speed;
}

/**
 * Podemos establecer la velocidad a la que va la bicicleta.
 * @Override
 * @param int speed
 */
@Override
public void setSpeed(int speed) {
	this.speed = speed;
}


/**
 * Aumentamos la velocidad de la bicicleta.
 * @Override
 * @param int increment
 */
@Override
public void speedUp(int increment){
      speed = speed + increment;
  }
    
/**
 * Presionamos los frenos de la bicicleta.
 * @Override
 * @param int decrement
 */
  @Override
public void applyBrakes(int decrement){     
      speed = speed - decrement;
  }
  /**
   * Imprimimos en la pantalla.
   * @Override
   */
  @Override
public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }

  /**
   * Metodo toString.
   * @Override
   * @return "bike [speed=" + speed + ", gear=" + gear + "]"
   */
@Override
public String toString() {
	return "bike [speed=" + speed + ", gear=" + gear + "]";
}
/**
 * Obtenemos el equipamiento(gear).
 * @Override
 * @return gear
 */
@Override
public int getGear() {
	return gear;
}

/**
 * Establecemos el equipamiento(gear).
 * @param int gear
 * @Override
 */
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