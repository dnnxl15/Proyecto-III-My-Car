package proyect.myCar.logic;

import proyect.myCar.library.DashElementType;

public class Electric extends SystemCar
{
	private boolean lights; //attribute for the lights
	private boolean leftDirectional; //attribute for the left directional
	private boolean rightDirectional; //attribute for the right directional
	private boolean brushes; //attribute for the brushes
	
	public Electric() //constructor function for the Electric class
	{
		lights = false;
		leftDirectional = false;
		rightDirectional = false;
		brushes = false;
	}
	
	public void setOnLights() //set the lights on
	{
		lights = true; //set lights as true
		notifyObserver(DashElementType.LIGHTS, ON); //notify the observer
	}
	
	public void setOffLights() //set lights as off
	{
		lights = false; 
		notifyObserver(DashElementType.LIGHTS, OFF); //notify the observer
	}
	
	public boolean getLights() //get the lights current status
	{
		return this.lights;
	}
	
	public void setOnLeftDirectional() //set on the left directional
	{
		leftDirectional = true;
		notifyObserver(DashElementType.LIGHTS_LEFT, ON); //notify the observer
	}
	
	public void setOffLeftDirectional() //set off the left directional
	{
		leftDirectional = false;
		notifyObserver(DashElementType.LIGHTS_LEFT, OFF); //notify the observer
	}
	
	public boolean getLeftDirectional() //get the current status of the left directional
	{
		return this.leftDirectional;
	}
	
	public void setOnRightDirectional() //set on the right directional
	{
		rightDirectional = true;
		notifyObserver(DashElementType.LIGHTS_RIGHT, ON); //notify the observer
	}
	
	public void setOffRightDirectional() //set off the right directional
	{
		rightDirectional = false;
		notifyObserver(DashElementType.LIGHTS_RIGHT, OFF); //notify the observer
	}
	
	public boolean getRightDirectional() //get the current status of the right directional
	{
		return this.rightDirectional;
	}
	
	public void setOffBrushes() //set the brushes off
	{
		brushes = false;
		notifyObserver(DashElementType.BRUSHES, OFF); //notify the observer
	}
	
	public void setOnBrushes() //set the brushes as on
	{
		brushes = true;
		notifyObserver(DashElementType.BRUSHES, ON); //notify the observer
	}
	
	public boolean getBrushes() //get the current status of the brushes
	{
		return this.brushes;
	}
}
