package com.JavierPostigoArevalo.examen.junio;

/**
 * Esta clase de java es una interfaz.
 * @author javie
 *
 */
interface vehicle {

	/**
	 * @param int newGear
	*/
	void changeGear(int newGear);
	/**
	 * Obtener la velocidad del vehiculo
	*/
	int getSpeed();
	/**
	 * @param int speed
	*/
	
	void setSpeed(int speed);
	/**
	 * @param int increment
	*/
	void speedUp(int increment);
	/**
	 * @param int decrement
	*/
	void applyBrakes(int decrement);
	
	void printStates();
	/**
	 *
	*/
	int getGear();
	/**
	 * @param int gear
	 * 
	*/
	void setGear(int gear);

}