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
   * @param newGear
   * 
   */
  @Override
public void changeGear(int newGear){     
      gear = newGear;
  }
    
/**
 * Obtenemos la velocidad de la bicicleta.
 * @return speed
 */
@Override
public int getSpeed() {
	return speed;
}

/**
 * Podemos establecer la velocidad a la que va la bicicleta.
 * @param speed
 */
@Override
public void setSpeed(int speed) {
	this.speed = speed;
}


/**
 * Aumentamos la velocidad de la bicicleta.
 * @param increment
 */
@Override
public void speedUp(int increment){
      speed = speed + increment;
  }
    
/**
 * Presionamos los frenos de la bicicleta.
 * @param decrement
 */
  @Override
public void applyBrakes(int decrement){     
      speed = speed - decrement;
  }
  /**
   * Imprimimos en la pantalla.
   */
  @Override
public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }

  /**
   * Metodo toString.
   * @return "bike [speed=" + speed + ", gear=" + gear + "]"
   */
@Override
public String toString() {
	return "bike [speed=" + speed + ", gear=" + gear + "]";
}
/**
 * Obtenemos el equipamiento(gear).
 * @return gear
 */
@Override
public int getGear() {
	return gear;
}

/**
 * Establecemos el equipamiento(gear).
 * @param gear
 */
@Override
public void setGear(int gear) {
	this.gear = gear;
}


}
