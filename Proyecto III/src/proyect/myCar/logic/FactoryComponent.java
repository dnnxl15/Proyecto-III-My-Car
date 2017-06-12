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
}
