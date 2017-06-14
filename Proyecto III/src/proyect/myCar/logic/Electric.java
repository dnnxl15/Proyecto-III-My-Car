package proyect.myCar.logic;

public class Electric implements SystemCar
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
	
	public boolean getLights()
	{
		return this.lights;
	}
	
	public void setOnLeftDirectional()
	{
		leftDirectional = true;
	}
	
	public void setOffLeftDirectional()
	{
		leftDirectional = false;
	}
	
	public boolean getLeftDirectional()
	{
		return this.leftDirectional;
	}
	
	public void setOnRightDirectional()
	{
		rightDirectional = true;
	}
	
	public void setOffRightDirectional()
	{
		rightDirectional = false;
	}
	
	public boolean getRightDirectional()
	{
		return this.rightDirectional;
	}
	
	public void setOffBrushes()
	{
		brushes = false;
	}
	
	public void setOnBrushes()
	{
		brushes = true;
	}
	
	public boolean getBrushes()
	{
		return this.brushes;
	}
}
