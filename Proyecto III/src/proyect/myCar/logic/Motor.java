package proyect.myCar.logic;

import proyect.myCar.library.DashElementType;

public class Motor extends SystemCar
{
	private boolean motorState; //attribute for the motor status
	private int gear; //attribute for the gear
	private int velocity; //attribute for the velocity
	private int revolutions; //attribute for the revolutions
	private boolean speedState; //attribute for the status of the speed
	
	public Motor() //constructor method for the Motor class
	{
		this.motorState = false;
		this.gear = 0;
		this.velocity = 0;
		this.revolutions = 0;
		this.speedState = false;
	}
	
	public int getDistanceTravel(int pTime) //get the distance travel by having the time
	{
		int distance = velocity * pTime; //distance equal to the formula
		return distance; //return the distance
	}
	
	public boolean getSpeedState() //get the speed stare
	{
		return this.speedState;
	}
	
	public void setAccelerate() //set the aceletation as false
	{
		this.speedState = true;
	}
	
	public void setDecelerate() //set the deceletate as true
	{
		this.speedState = false;
	}
	
	public void setRevolutions(int pRevolutions) //set the revolutions
	{
		this.revolutions = pRevolutions;
	}
	
	public int getRevolutions() //get the revolutions current value
	{
		return this.revolutions;
	}
	
	public boolean isMotorOn() //if the motor is on 
	{
		return this.motorState; //return the current status
	}
	
	public void setVelocity(int pVelocity) //set the velocity
	{
		this.velocity = pVelocity;
	}
	
	public int getVelocity() //get the velocity
	{
		return this.velocity;
	}
	
	public void turnOnMotor() //set the motor as true
	{
		this.motorState = true;
	}
	
	public void turnOffMotor() //seet the motor as off
	{
		this.motorState = false;
	}
	
	public int speedUp(int pTime) //calculate the speed
	{
		this.velocity = ACCELERATION * pTime / MILISECONDS_IN_A_SECONDS; //velocity equal to the formula
		notifyObserver(DashElementType.VELOCITY, this.velocity); //notify the observer
		return this.velocity;
	}
	
	public int decelerate(int pTime) //calculate the peed
	{
		this.velocity = ACCELERATION * pTime / MILISECONDS_IN_A_SECONDS; //velocity equal to the formula
		notifyObserver(DashElementType.VELOCITY, this.velocity); //notify the observer
		return this.velocity;
	}
	
	public int getGear() //get the current value of the gear
	{
		return gear;
	}
	
	public void setGear(int pGear) //set the gear
	{
		this.gear = pGear;
	}
		
	public void increaseGear() //increase the gear
	{
		if(this.gear == MAXIMUN_GEAR) //if equals to 5
		{
			return;
		}
		else
		{
			this.gear = this.gear++; //else add 1
			notifyObserver(DashElementType.GEAR, gear); //notify the observer
		}
	}
	
	public void decreaseGear() //decrease the gear
	{
		if(this.gear == MINIMUN_GEAR) //if equals to 0
		{
			return;
		}
		else
		{
			this.gear = this.gear--; //else decrease by one
			notifyObserver(DashElementType.GEAR, gear); //notify the observer
		}
	}
}