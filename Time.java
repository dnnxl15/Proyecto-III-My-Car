package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Time extends FreeWayComponent
{
	private boolean day; //attribute for day
	private boolean night; //attribute for night
	
	public Time() //constructor method for the Time class
	{
		day = false;
		night = false;
	}
	
	public boolean isNight() //if is night
	{
		return night; //return its current status
	}
	
	public boolean isDay() //if is day
	{
		return day; //return its current value
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.TIME;
	}

	public void setDay() //set the day as true and the night as false
	{
		this.night = false;
		this.day = true;
	}
	
	public void setNight() //set the night as true and day as false
	{
		this.day = false;
		this.night = true;
	}
}
