package proyect.myCar.logic;

public class Motor extends SystemCar
{
	private boolean motor; //attribute of the motor
	private int gear; //attribute for the gear
	
	
	public Motor() //constructor for the Motor class
	{
		this.motor = false;
		this.gear= 0;
	}
	public boolean isMotorOn() //if the motor is on
	{
		return this.motor;
	}
	
	public void turnOnMotor() //turn on the motor
	{
		this.motor = true;
	}
	
	public void turnOffMotor() //turn off the motor
	{
		this.motor = false;
	}
	
	public int speedUp() //increse the speed
	{
		return 0;
	}
	
	public int decelerate() //decrese the speed
	{
		return 0;
	}
	
	public int getGear() //get the current value of the gear
	{
		return gear;
	}
	
	public void setGear(int pGear) //set the gear
	{
		this.gear = pGear;
	}
}