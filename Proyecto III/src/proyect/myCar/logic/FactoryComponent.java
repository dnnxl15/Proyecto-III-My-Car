package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IFactory;

public class FactoryComponent implements IFactory
{
	private static FactoryComponent Instance;
	
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
			FreeWayComponent Distance = new Distance();
			return Distance;
		}
		else if(FreeWayComponentType.INTERSECTION == pType)
		{
			FreeWayComponent Intersection = new Intersection();
			return Intersection;
		}
		else if(FreeWayComponentType.TIME == pType)
		{
			FreeWayComponent Time = new Time();
			return Time;
		}
		else if(FreeWayComponentType.VELOCITY == pType)
		{
			FreeWayComponent Velocity = new Velocity();
			return Velocity;
		}
		else 
		{
			FreeWayComponent Weather = new Weather();
			return Weather;
		}
	}
}