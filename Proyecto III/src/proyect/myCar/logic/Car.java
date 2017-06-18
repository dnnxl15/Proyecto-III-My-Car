package proyect.myCar.logic;

public class Car 
{
	private AbstractSystem coordinationSystemObject; //attribute of AbstracSystem type
	private AbstractSystem navigationSystemObject; //attribute of AbstracSystem type
	
	public void turnOnLights() //function to turn on the light of the car
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnLights(); //call the function that turn on the lights
	}
	
	public void turnOffLights() //function to turn off the lights of the car
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffLights(); //call the function that turn off the lights 
	}
	
	public void turnOnLeftDirectional() //turn on the left directional 
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnLeftDirectional(); //call the function that turn on the left directional
	}
	
	public void turnOffLeftDirectionl() //turn off the left directional
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffLeftDirectional(); //call the function that turn off the left directional
	}
	
	public void turnOnRightDirectional() //turn on the right directional
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnRightDirectional(); //call the function that turn on the right directional
	}
	
	public void turnOffRightDirectional() //turn off the right directional
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffRightDirectional(); //call the function that turn off the right directional
	}
	
	public void turnOnBrushes() //turn on the brushes
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOnBrushes(); //call the function that turn on the brushes
	}
	
	public void turnOffBrushes() //turn off the brushes
	{
		Electric electricObject = (Electric) this.navigationSystemObject.getElectric(); //make the cast
		electricObject.setOffBrushes(); //call the function that turn off the brushes
	}
}
