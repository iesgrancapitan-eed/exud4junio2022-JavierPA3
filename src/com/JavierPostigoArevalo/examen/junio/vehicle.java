package com.JavierPostigoArevalo.examen.junio;

/**
 * Esta clase de java es una interfaz.
 * @author javie
 *
 */
interface vehicle {

	/**
	 * @param newGear
	*/
	void changeGear(int newGear);
	/**
	 * Obtener la velocidad del vehiculo
	*/
	int getSpeed();
	/**
	 * @param speed
	*/
	
	void setSpeed(int speed);
	/**
	 * @param increment
	*/
	void speedUp(int increment);
	/**
	 * @param decrement
	*/
	void applyBrakes(int decrement);
	
	void printStates();

	int getGear();
	/**
	 * @param gear
	 * 
	*/
	void setGear(int gear);

}