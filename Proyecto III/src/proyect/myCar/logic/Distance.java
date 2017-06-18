package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IConstants;

public class Distance extends FreeWayComponent implements IConstants
{
	private int meter; //attribute that refers to the distance
	
	public Distance() //constructor of the Distance class
	{
		this.meter = 0; //equal to 0
	}
	
	public int getMeter() //get the value of Meter
	{
		return this.meter;
	}
	
	public void setMeter(int pMeter) //set the variable Meter
	{ 
		this.meter = pMeter; //equal Meter to pMeter
	}
	
	@Override
	public FreeWayComponentType getIdentifier() //return the enum of Distance
	{
		return FreeWayComponentType.DISTANCE;
	}
}