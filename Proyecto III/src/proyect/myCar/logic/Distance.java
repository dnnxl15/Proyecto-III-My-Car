package proyect.myCar.logic;

public class Distance extends FreeWayComponent 
{
	private int Meter;
	
	public Distance()
	{
		this.Meter = TRACK_METERS;
	}
	
	public int getMeter()
	{
		return this.Meter;
	}
}