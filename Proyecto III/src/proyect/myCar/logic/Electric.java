package proyect.myCar.logic;

public class Electric 
{
	private boolean lights;
	private boolean leftDirectional;
	private boolean rightDirectional;	
	private boolean brushes;
	
	public Electric() //constructor function for the Electric class
	{
		lights = false;
		leftDirectional = false;
		rightDirectional = false;
		brushes = false;
	}
	
	public void setOnLights()
	{
		lights = true;
	}
	
	public void setOffLights()
	{
		lights = false;
	}
	
	public void setOnLeftDirectional()
	{
		leftDirectional = true;
	}
	
	public void setOffLeftDirectional()
	{
		leftDirectional = false;
	}
	
	public void setOnRightDirectional()
	{
		rightDirectional = true;
	}
	
	public void setOffRightDirectional()
	{
		rightDirectional = false;
	}
	
	public void setOffBrushes()
	{
		brushes = false;
	}
	
	public void setOnBrushes()
	{
		brushes = true;
	}
}
