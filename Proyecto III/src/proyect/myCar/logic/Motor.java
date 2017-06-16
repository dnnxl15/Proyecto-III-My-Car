package proyect.myCar.logic;

import proyect.myCar.library.DashElementType;

public class Motor extends SystemCar
{
	private boolean motor;
	private int gear;
	
	public Motor()
	{
		this.motor = false;
		this.gear= 0;
	}
	public boolean isMotorOn()
	{
		return this.motor;
	}
	
	public void turnOnMotor()
	{
		this.motor = true;
	}
	
	public void turnOffMotor()
	{
		this.motor = false;
	}
	
	public int speedUp()
	{
		notifyObserver(DashElementType.VELOCITY, 0);
		return 0;
	}
	
	public int decelerate()
	{
		notifyObserver(DashElementType.VELOCITY, 0);
		return 0;
	}
	
	public int getGear()
	{
		return gear;
	}
	
	public void setGear(short pGear)
	{
		this.gear = pGear;
	}
	
	// Agregarlos al diagrama
	
	public void increaseGear()
	{
		if(this.gear == MAXIMUN_GEAR)
		{
			return;
		}
		else
		{
			this.gear = this.gear++; 
			notifyObserver(DashElementType.GEAR, gear);
		}
	}
	
	public void decreaseGear()
	{
		if(this.gear == MINIMUN_GEAR)
		{
			return;
		}
		else
		{
			this.gear = this.gear--; 
			notifyObserver(DashElementType.GEAR, gear);
		}
	}
}