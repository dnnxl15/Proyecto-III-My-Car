package proyect.myCar.logic;

public class Motor
{
	private boolean motor;
	private short gear;
	
	
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
		return 0;
	}
	
	public int decelerate()
	{
		return 0;
	}
	
	public short getGear()
	{
		return gear;
	}
	
	public void setGear(short pGear)
	{
		this.gear = pGear;
	}
}
