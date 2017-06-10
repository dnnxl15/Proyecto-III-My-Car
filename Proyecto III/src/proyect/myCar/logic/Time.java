package proyect.myCar.logic;

// Class Time

public class Time extends FreeWayComponent
{
	private boolean Day;
	private boolean Night;
	
	public Time()
	{
		this.Day = false;
		this.Night = false;
	}
	
	public void setNight()
	{
		this.Night = true;
	}
	
	public void setDay()
	{
		this.Day = true;
	}
	
	public boolean isNight()
	{
		if(Night == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isDay()
	{
		if(Day == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}//
