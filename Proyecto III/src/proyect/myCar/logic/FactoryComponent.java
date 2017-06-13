package proyect.myCar.logic;

public class FactoryComponent
{
	private static FactoryComponent Instance; //instance

	FactoryComponent()
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
<<<<<<< HEAD

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
=======
}
>>>>>>> refs/remotes/origin/master
