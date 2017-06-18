package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IConstants;

public class Distance extends FreeWayComponent implements IConstants
{
	private int meter; //attribute for the meters
	
	public Distance() //constructor method for the Distance class
	{
		this.meter = 0;
	}
	
	public int getMeter() //get the current value
	{
		return this.meter;
	}
	
	public void setMeter(int pMeter) //set the meters
	{
		this.meter = pMeter;
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.DISTANCE;
	}
}