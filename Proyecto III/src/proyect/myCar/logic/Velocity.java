package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Velocity extends FreeWayComponent
{
	private int maximumSpeed;
	private int minimumSpeed;
	
	public Velocity()
	{
		this.maximumSpeed = 0;
		this.minimumSpeed = 0;
	}
	
	public void setMaximunSpeed(int pMaximunSpeed)
	{
		this.maximumSpeed = pMaximunSpeed;
	}
	
	public void setMinimunSpeed(int pMinimunSpeed)
	{
		this.minimumSpeed = pMinimunSpeed;
	}
	
	public boolean isMaximumSpeed()
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
	
	public boolean isMinimumSpeed()
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