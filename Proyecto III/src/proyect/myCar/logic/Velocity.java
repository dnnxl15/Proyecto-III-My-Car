package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Velocity extends FreeWayComponent
{
	private int maximumSpeed; //attribute for maximum speed
	private int minimumSpeed; //attribute for minimum speed
	
	public Velocity() //constructor method of the velocity class
	{
		this.maximumSpeed = 0;
		this.minimumSpeed = 0;
	}
	
	public int getMaximunSpeed() //get the value of maximum speed
	{
		return this.maximumSpeed;
	}
	
	public int getMinimunSpeed() //get the value of the minimum speed
	{
		return this.minimumSpeed;
	}
	
	public void setMaximunSpeed(int pMaximunSpeed) //set the maximum speed
	{
		this.maximumSpeed = pMaximunSpeed;
	}
	
	public void setMinimunSpeed(int pMinimunSpeed) //set the minimum speed
	{
		this.minimumSpeed = pMinimunSpeed;
	}
	
	public boolean isMaximumSpeed() //if is maximum speed
	{
		if(maximumSpeed > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isMinimumSpeed() //if is minimum speed
	{
		if(minimumSpeed > 0)
		{
			return true;
		}
		else
		{
			return false;
		}	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.VELOCITY;
	}
}