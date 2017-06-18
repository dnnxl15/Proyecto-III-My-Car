package proyect.myCar.logic;

import proyect.myCar.library.DashElementType;

public class Motor extends SystemCar
{
	private boolean motorState;
	private int gear;
	private int velocity;
	private int revolutions;
	private boolean speedState;
	
	public Motor()
	{
		this.motorState = false;
		this.gear = 0;
		this.velocity = 0;
		this.revolutions = 0;
		this.speedState = false;
	}
	
	public int getDistanceTravel(int pTime)
	{
		int distance = velocity * pTime;
		return distance;
	}
	
	public boolean getSpeedState()
	{
		return this.speedState;
	}
	
	public void setAccelerate()
	{
		this.speedState = false;
	}
	
	public void setDecelerate()
	{
		this.speedState = true;
	}
	
	public void setRevolutions(int pRevolutions)
	{
		this.revolutions = pRevolutions;
	}
	
	public int getRevolutions()
	{
		return this.revolutions;
	}
	
	public boolean isMotorOn()
	{
		return this.motorState;
	}
	
	public void setVelocity(int pVelocity)
	{
		this.velocity = pVelocity;
	}
	
	public int getVelocity()
	{
		return this.velocity;
	}
	
	public void turnOnMotor()
	{
		this.motorState = true;
	}
	
	public void turnOffMotor()
	{
		this.motorState = false;
	}
	
	public int speedUp(int pTime)
	{
		this.velocity = ACCELERATION * pTime / MILISECONDS_IN_A_SECONDS;
		notifyObserver(DashElementType.VELOCITY, this.velocity);
		return this.velocity;
	}
	
	public int decelerate(int pTime)
	{
		this.velocity = ACCELERATION * pTime / MILISECONDS_IN_A_SECONDS;
		notifyObserver(DashElementType.VELOCITY, this.velocity);
		return this.velocity;
	}
	
	public int getGear()
	{
		return gear;
	}
	
	public void setGear(short pGear)
	{
		this.gear = pGear;
	}
		
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