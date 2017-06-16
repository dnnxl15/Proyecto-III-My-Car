package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IFactory;

public class FactoryComponent implements IFactory
{
	private static FactoryComponent Instance; //instance

	private FactoryComponent()
	{
	}
	
	public synchronized static FactoryComponent getInstance()
	{
		if (Instance==null)
		{
			Instance = new FactoryComponent();
		}
		return Instance;
	}
	
	@Override
	public FreeWayComponent createComponent(FreeWayComponentType pType) 
	{
		if(FreeWayComponentType.DISTANCE == pType)
		{
			Distance distance = new Distance();
			return distance;
		}
		else if(FreeWayComponentType.INTERSECTION == pType)
		{
			Intersection intersection = new Intersection();
			return intersection;
		}
		else if(FreeWayComponentType.TIME == pType)
		{
			Time time = new Time();
			return time;
		}
		else if(FreeWayComponentType.VELOCITY == pType)
		{
			Velocity velocity = new Velocity();
			return velocity;
		}
		else 
		{
			Weather weather = new Weather();
			return weather;
		}
	}
}
