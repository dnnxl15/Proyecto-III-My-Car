package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Intersection extends FreeWayComponent
{
	private boolean fourCorner; //attribute for the four corners
	private boolean intersection; //attribute for the intersection
	private boolean travelFinal; //attribute for the final of the road
	
	public Intersection() //constructor method for the Intersection class
	{
		this.fourCorner = false;
		this.intersection = false;
		this.travelFinal = false;
	}
	
	public boolean isIntersection() //if is an intersection
	{
		return intersection; //return its current status
	}
	
	public boolean isFourCorner() //if is four corners
	{
		return fourCorner; //return the current status
	}
	
	public boolean isFinal() //if is the final
	{
		return travelFinal; //return the current status
	}
	
	@Override
	public FreeWayComponentType getIdentifier() //for the enum
	{
		return FreeWayComponentType.INTERSECTION;
	}
	
	public void setFourCorner() //set the four corners as true
	{
		fourCorner = true;
	}

	public void setFinal() //set the final as true
	{
		travelFinal = true;
	}

	public void setIntersection() //set the intersection as true
	{
		this.intersection = true;
	}
}
