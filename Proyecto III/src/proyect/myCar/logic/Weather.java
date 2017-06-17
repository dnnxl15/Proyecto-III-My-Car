package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Weather extends FreeWayComponent
{
	private boolean Rain;
	
	public Weather()
	{
		this.Rain = false;
	}
	
	public void setRain()
	{
		this.Rain = true;
	}
	
	public void setRainOff()
	{
		this.Rain = false;
	}
	
	public boolean isRaining()
	{
		return Rain;
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.WEATHER;
	}
}
