package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;

public class Intersection extends FreeWayComponent
{
	private boolean fourCorner; //attribute for the four corners
	private boolean intersection; //attribute for the regular intersection
	private boolean roadFinal; //attribute for the final of the way
	
	public Intersection() //constructor of the Intersection class
	{
		this.fourCorner = false;
		this.intersection = false;
		this.roadFinal = false;
	}
	
	public boolean isIntersection() //if is a normal intersection
	{
		return intersection; //return the current status of intersection
	}
	
	public boolean isFourCorner() //if is four corners
	{
		return fourCorner; //return the current status of four corners
	}
	
	public boolean isFinal() //if is the final of the way
	{
		return roadFinal; //return the current value of the final
	}
	
	@Override
	public FreeWayComponentType getIdentifier()
	{
		return FreeWayComponentType.INTERSECTION;
	}
	
	public void setFourCorner() //set the four corners as true
	{
		fourCorner = true;
	}

	public void setFinal() //set the final as true
	{
		roadFinal = true;
	}

	public void setIntersection() //set the intersection as true
	{
		this.intersection = true;
	}
}
