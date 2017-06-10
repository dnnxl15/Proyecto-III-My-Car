package proyect.myCar.logic;

// Class Weather

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
	
	public boolean isRaining()
	{
		return this.Rain;
	}
}