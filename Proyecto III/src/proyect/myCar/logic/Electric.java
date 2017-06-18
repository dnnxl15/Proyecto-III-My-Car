package proyect.myCar.logic;

import proyect.myCar.library.DashElementType;

public class Electric extends SystemCar
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
		notifyObserver(DashElementType.LIGHTS, ON);
	}
	
	public void setOffLights()
	{
		lights = false;
		notifyObserver(DashElementType.LIGHTS, OFF);
	}
	
	public boolean getLights()
	{
		return this.lights;
	}
	
	public void setOnLeftDirectional()
	{
		leftDirectional = true;
		notifyObserver(DashElementType.LIGHTS_LEFT, ON);
	}
	
	public void setOffLeftDirectional()
	{
		leftDirectional = false;
		notifyObserver(DashElementType.LIGHTS_LEFT, OFF);
	}
	
	public boolean getLeftDirectional()
	{
		return this.leftDirectional;
	}
	
	public void setOnRightDirectional()
	{
		rightDirectional = true;
		notifyObserver(DashElementType.LIGHTS_RIGHT, ON);
	}
	
	public void setOffRightDirectional()
	{
		rightDirectional = false;
		notifyObserver(DashElementType.LIGHTS_RIGHT, OFF);
	}
	
	public boolean getRightDirectional()
	{
		return this.rightDirectional;
	}
	
	public void setOffBrushes()
	{
		brushes = false;
		notifyObserver(DashElementType.BRUSHES, OFF);
	}
	
	public void setOnBrushes()
	{
		brushes = true;
		notifyObserver(DashElementType.BRUSHES, ON);
	}
	
	public boolean getBrushes()
	{
		return this.brushes;
	}
}
