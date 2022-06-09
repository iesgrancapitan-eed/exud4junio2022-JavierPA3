package com.JavierPostigoArevalo.examen.junio;

interface vehicle {

	void changeGear(int newGear);

	int getSpeed();

	void setSpeed(int speed);

	void speedUp(int increment);

	void applyBrakes(int decrement);

	void printStates();

	int getGear();

	void setGear(int gear);

}