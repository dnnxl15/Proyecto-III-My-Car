package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IConstants;

public class Distance extends FreeWayComponent implements IConstants
{
	private int Meter;
	
	public Distance()
	{
		this.Meter = 0;
	}
	
	public int getMeter()
	{
		return this.Meter;
	}
	
	public void setMeter(int pMeter)
	{
		this.Meter = pMeter;
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.DISTANCE;
	}
}