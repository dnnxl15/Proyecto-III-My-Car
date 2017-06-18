package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Time extends FreeWayComponent
{
	private boolean day; //attribute for the day
	private boolean night; //attribute for the night
	
	public Time() //constructor method of time class
	{
		day = false;
		night = false;
	}
	
	public boolean isNight() //return the status of night
	{
		return night;
	}
	
	public boolean isDay() //return the status of day
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
		this.night = false; //set night as false
		this.day = true; //set day as true
	}
	
	public void setNight()
	{
		this.day = false; //set day as false
		this.night = true; //set night as false
	}
}
