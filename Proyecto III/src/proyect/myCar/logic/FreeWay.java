package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import proyect.myCar.library.*;

public class FreeWay implements IObservable, IConstants
{
	private ArrayList<IObserver> Observers; //ArrayList for the observer
	private ArrayList<FreeWayComponent> componentList; //ArrayList of the Free way components
	
	public FreeWay() //constructor method 
	{
		this.Observers = new ArrayList<IObserver>();
		this.componentList = new ArrayList<FreeWayComponent>();
	}

	@Override
	public void addObserver(IObserver pObserver) 
	{
		this.Observers.add(pObserver);
	}

	@Override
	public void removeObserver(IObserver pObserver) 
	{
		this.Observers.remove(pObserver);
	}
	
	public ArrayList<IObserver> getObservers()
	{
		return this.Observers;
	}

	@Override
	public void notifyObserver() 
	{
		for (Iterator<IObserver> it = Observers.iterator(); it.hasNext();) 
        {
            IObserver IObserver = it.next();
            IObserver.update();
        }
	}
	
	private List<String> splitText(String pRoute)
	{   
		TextReader textObject = TextReader.getInstance(); //create an object for TextReader
		String route = textObject.readFile(pRoute); //create the variable to be used in FreeWay and call the method from TextReader
	    String limits = DOUBLE_QUOTATION_MARK; //limits to be split
	    String[] myRoute = route.split(limits); //splits character by character
	    System.out.println(Arrays.toString(myRoute));
	    
		List<String> myFinalRoute = new ArrayList<String>(); //creates a List of Strings by creating an ArrayList
		String acumulator = DOUBLE_QUOTATION_MARK; //acumulator whith a default value of none
		String elements = ".T+DNLF"; //the elements to be analizated 
		int length = myRoute.length; //int variable whith the value of the String[]
		try //try to avoid a null pointer exception
		{
			for(int position = 0; position < length; position++) //for to add properly into the list
			{
				if (myRoute[position].toString().equals(MINIMUN) || myRoute[position].toString().equals(MAXIMUN)) //detects if the element isa speed limit
				{
					int counter = position; //counter to be equal to the position value
					while (!(elements.contains(myRoute[counter].toString()))) //while to determinate the speed limit that the text said
					{
						acumulator = acumulator + myRoute[counter]; //acumulator to be used to acumulate the final value
						counter++; //increse in one the counter
							
					}
					myFinalRoute.add(acumulator); //finalize the while and add the acumulator to the final List
					acumulator = DOUBLE_QUOTATION_MARK; //reset the acumulator to its default value
					position = counter; //position take the value of the counter after the while
				}
				myFinalRoute.add(myRoute[position]); //else just add to the List
			}
		}
		catch (Exception e) //catch in case of a null pointer exception
		{
		}
		try
		{
			for (int position = 0; position < myFinalRoute.size(); position++)
			{
				System.out.println(myFinalRoute.get(position).toString());
			}
		}
		catch (Exception e)
		{
		}
		return myFinalRoute;
		
	}
	
	public void loadFreeComponent(String pFileName)
	{
		ArrayList<String> freeWayList = (ArrayList<String>) splitText(pFileName); //do the cast and
		//freeWayList would has the return ArrayList of the splitText function
		int counter = 0; //counter to analyze each element of the list
		try
		{
			while(freeWayList.size() > counter) //while counter less than the size of the ArrayList
			{
				if (freeWayList.contains(ROAD_COMPONENTS[POINT_COMPONENT])) //if the element is a point
				{
					Distance distance = new Distance(); //creates a new DIstance object
					this.componentList.add(distance); //add that Distance object to the ArrayList of the components
					counter++; 
					continue; //continue at the end of the while
				}
				//if is an intersection element
				if (freeWayList.contains(ROAD_COMPONENTS[INTERSECTION_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[FOUR_CORNERS_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[FINAL_COMPONENT]))
				{
					Intersection intersection = new Intersection(); //creates an Instersection object
					if (freeWayList.contains(ROAD_COMPONENTS[INTERSECTION_COMPONENT])) //if is an normal intersection
					{
						intersection.setIntersection(); //set the object as a normal intersection
						this.componentList.add(intersection); //add the object to the ArrayList
						counter++;
						continue; //continue at the end of the while
					}
					if (freeWayList.contains(ROAD_COMPONENTS[FOUR_CORNERS_COMPONENT])) //if is a four corner
					{
						intersection.setFourCorner(); //set the object as a four corners
						this.componentList.add(intersection); //add the object to the ArrayList
						counter++;
						continue; //continue at the end of the while
					}
					if (freeWayList.contains(ROAD_COMPONENTS[FINAL_COMPONENT])) //if is the final
					{ 
						intersection.setFinal(); //set the object as the final
						this.componentList.add(intersection); //add the object to the ArrayList
						counter++;
						continue; //continue at the end of the while
					}
				}
				//if is a Speed element
				if (freeWayList.contains(ROAD_COMPONENTS[MAXIMUM_SPEED_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[MINIMUM_SPEED_COMPONENT]))
				{
					Velocity velocity = new Velocity(); //creates a Velocity object
					String speed = freeWayList.get(counter).toString().substring(1); //take the numeric values in String format
				    int speedValue = Integer.parseInt(speed); //convert from string to an integer 
				    if (freeWayList.contains(ROAD_COMPONENTS[MAXIMUM_SPEED_COMPONENT])) //if is a maximum speed
				    {
						velocity.setMaximunSpeed(speedValue); //set the maximum speed to the value it gets
						this.componentList.add(velocity); //add the object to the ArrayList
						counter++;
						continue; //continue at the end of the while
					}
				    if (freeWayList.contains(ROAD_COMPONENTS[MINIMUM_SPEED_COMPONENT])) //if is minimum speed
				    {
						velocity.setMinimunSpeed(speedValue); //set the minimum speed to the value it gets
						this.componentList.add(velocity); //add the object to the ArrayList
						counter++;
						continue; //continue at the end of the while
					}
				}
				if (freeWayList.contains(ROAD_COMPONENTS[RAIN_COMPONENT])) //if is raining
				{
					Weather weather = new Weather(); //creates a Weather object
					weather.setRain(); //set the rain as true
					this.componentList.add(weather); //add the object to the ArrayList
					counter++;
					continue; //continue at the end of the while
				}
				//if is a Day component
				if (freeWayList.contains(ROAD_COMPONENTS[DAY_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[NIGHT_COMPONENT]))
				{
					Time time = new Time(); //creates a Time object
					if (freeWayList.contains(ROAD_COMPONENTS[DAY_COMPONENT])) //if is Day
					{
						time.setDay(); //set day as true and night as false
						this.componentList.add(time); //add the object to the ArrayList
						counter++;
						continue; //continue at the end of the while
					}
					if (freeWayList.contains(ROAD_COMPONENTS[NIGHT_COMPONENT])) //if is Night
					{
						time.setNight(); //set night as true and day as false
						this.componentList.add(time); //add the object to the ArrayList
						counter++;
						continue; //continue at the end of the while
					}
				}
				else
				{
					counter++;
				}
			}
		}
		catch (Exception e)
		{
		}
	}
	
	public static void main(String[] args) 
	{
		FreeWay road = new FreeWay();
		road.loadFreeComponent("C:/Users/esteb/Documents/2017 - I SEMESTRE/POO/FINAL/ruta.txt");
	}

	@Override
	public void notifyObserver(FreeWayComponent pComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver(DashElementType pType, int pState) {
		// TODO Auto-generated method stub
		
	}
}
