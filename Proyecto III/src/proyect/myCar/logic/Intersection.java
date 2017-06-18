package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Intersection extends FreeWayComponent
{
	private boolean fourCorner;
	private boolean intersection;
	private boolean Final;
	
	public Intersection()
	{
		this.fourCorner = false;
		this.intersection = false;
		this.Final = false;
	}
	
	public boolean isIntersection()
	{
		return intersection;
	}
	
	public boolean isFourCorner()
	{
		return fourCorner;
	}
	
	public boolean isFinal()
	{
		return Final;
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.INTERSECTION;
	}
	
	public void setFourCorner()
	{
		fourCorner = true;
	}

	public void setFinal() 
	{
		Final = true;
	}

	public void setIntersection()
	{
		this.intersection = true;
	}
}
