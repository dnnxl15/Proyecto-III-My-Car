package proyect.myCar.logic;

public class Intersection extends FreeWayComponent
{
	private boolean FourCorner;
	private boolean Intersection;
	private boolean Final;
	
	public Intersection()
	{
		FourCorner = false;
		Intersection = false;
		Final = false;
	}
	
	public boolean isIntersection()
	{
		if(Intersection == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFourCorner()
	{
		if(FourCorner == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setIntersection()
	{
		this.Intersection = true;
	}
	
	public void setFourCorner()
	{
		this.FourCorner = true; 
	}
	
	public void setFinal()
	{
		this.Final = true;
	}
	
	public boolean isFinal()
	{
		return Final;
	}
}//
