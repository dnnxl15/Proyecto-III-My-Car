package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Velocity extends FreeWayComponent
{
	private int maximumSpeed; //attribute for the maximum speed
	private int minimumSpeed; //attribute for the minimum speed
	
	public Velocity() //constructor method for the Velocity class
	{
		this.maximumSpeed = 0; 
		this.minimumSpeed = 0;
	}
	
	public void setMaximunSpeed(int pMaximunSpeed) //set the maximum speed
	{ 
		this.maximumSpeed = pMaximunSpeed;
	}
	
	public void setMinimunSpeed(int pMinimunSpeed) //set the minumum speed
	{
		this.minimumSpeed = pMinimunSpeed;
	}
	
	public boolean isMaximumSpeed() //if it is maximum speed
	{
		if(maximumSpeed > 0) //has to be > than 0
		{
			return true; //equals to true
		}
		else
		{
			return false; //else going to be false
		}
	}
	
	public boolean isMinimumSpeed() //if it is minimum seed
	{
		if(minimumSpeed > 0) //has to be > the 0
		{
			return true; //equal to true
		}
		else
		{
			return false; //else going to be false
		}
	}
	
	public int getMaximumSpeed() //get the maximum speed
	{
		return this.maximumSpeed; //return the current value
	}
	
	public int getMinumumSpeed() //get the minimum speed
	{
		return this.minimumSpeed; //return the current value 
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.VELOCITY;
	}
}