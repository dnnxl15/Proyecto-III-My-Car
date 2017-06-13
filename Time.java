package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Time extends FreeWayComponent
{
	private boolean day;
	private boolean night;
	
	public Time()
	{
		day = false;
		night = false;
	}
	
	public boolean isNight()
	{
		return night;
	}
	
	public boolean isDay()
	{
		return day;
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.TIME;
	}

	public void setDay() 
	{
		this.night = false;
		this.day = true;
	}
	
	public void setNight()
	{
		this.day = false;
		this.night = true;
	}
}
