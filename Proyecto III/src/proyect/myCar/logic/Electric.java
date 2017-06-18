package proyect.myCar.logic;

public class Electric implements SystemCar
{
	private boolean lights; //attribute of the lights in the car
	private boolean leftDirectional; //attribute of the left directional in the car
	private boolean rightDirectional; //attribute of the right directional in the car
	private boolean brushes; //attribute of the brushes in the car
	
	public Electric() //constructor function for the Electric class
	{
		lights = false;
		leftDirectional = false;
		rightDirectional = false;
		brushes = false;
	}
	
	public void setOnLights() //turn on the lights
	{
		lights = true;
	}
	
	public void setOffLights() //turn off the lights
	{
		lights = false;
	}
	
	public boolean getLights() //get the current status of the light
	{
		return this.lights;
	}
	
	public void setOnLeftDirectional() //turn on the left directional
	{
		leftDirectional = true;
	}
	
	public void setOffLeftDirectional() //turn off the left directional
	{
		leftDirectional = false;
	}
	
	public boolean getLeftDirectional() ///get the current status of the left directional
	{
		return this.leftDirectional;
	}
	
	public void setOnRightDirectional() //turn on the right directional
	{
		rightDirectional = true;
	}
	
	public void setOffRightDirectional() //turn off the right directional
	{
		rightDirectional = false;
	}
	
	public boolean getRightDirectional() //get the current status of the right directional
	{
		return this.rightDirectional;
	}
	
	public void setOffBrushes() //turn off the brushes
	{
		brushes = false;
	}
	
	public void setOnBrushes() //turn on the brushes
	{
		brushes = true;
	}
	
	public boolean getBrushes() //get the current status of the brushes
	{
		return this.brushes;
	}
}
