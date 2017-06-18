package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Weather extends FreeWayComponent
{
	private boolean Rain; //attribute for the rain
	
	public Weather() //constructor method for the Weather class
	{
		this.Rain = false;
	}
	
	public void setRain() //set the rain as true
	{
		this.Rain = true;
	}
	
	public void setRainOff() //set the rain as false
	{
		this.Rain = false;
	}
	
	public boolean isRaining() //ask for the status of rain
	{
		return Rain; //return the current status of the rain
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.WEATHER;
	}
}
