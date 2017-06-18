package proyect.myCar.logic;

import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IFactory;

public class FactoryComponent implements IFactory
{
	private static FactoryComponent Instance; //instance

	private FactoryComponent() //Constructor method
	{
	}
	
	public synchronized static FactoryComponent getInstance() //creates the synchronized instance initialize 
	{
		if (Instance==null)
		{
			Instance = new FactoryComponent(); //instance equal to null 
		}
		return Instance;
	}
	
	@Override
	public FreeWayComponent createComponent(FreeWayComponentType pType)  //method that create the different components
	{
		if(FreeWayComponentType.DISTANCE == pType) 
		{
			Distance distance = new Distance(); //create the a Distance object
			return distance;
		}
		else if(FreeWayComponentType.INTERSECTION == pType)
		{
			Intersection intersection = new Intersection(); //create the Intersection object
			return intersection;
		}
		else if(FreeWayComponentType.TIME == pType)
		{
			Time time = new Time(); //create the Time bbject
			return time;
		}
		else if(FreeWayComponentType.VELOCITY == pType)
		{
			Velocity velocity = new Velocity(); //create the Velocity object
			return velocity;
		}
		else 
		{
			Weather weather = new Weather(); //create the Weather object
			return weather;
		}
	}
}
