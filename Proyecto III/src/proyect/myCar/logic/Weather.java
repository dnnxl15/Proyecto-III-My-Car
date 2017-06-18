package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Weather extends FreeWayComponent
{
	private boolean Rain; //attribute for the rain
	
	public Weather() //constructor method
	{
		this.Rain = false;
	}
	
	public void setRain() //set on rain
	{
		this.Rain = true;
	}
	
	public void setRainOff() //set off rain
	{
		this.Rain = false;
	}
	
	public boolean isRaining() //get the status of the raining
	{
		return Rain;
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.WEATHER;
	}
}
