package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import proyect.myCar.library.*;

public class FreeWay implements IConstants
{
	private ArrayList<FreeWayComponent> componentList;
	
	public FreeWay()
	{
		this.componentList = new ArrayList<FreeWayComponent>();
	}
	
	public ArrayList<FreeWayComponent> getComponentList()
	{
		return this.componentList;
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
		return myFinalRoute;
	}
	
	public void loadFreeComponent(String pFileName)
	{
		ArrayList<String> freeWayList = (ArrayList<String>) splitText(pFileName); //do the cast
		int counter = 0; //counter equal to 0
		try
		{
			while(freeWayList.size() > counter) //while counter less than the size of the arrayList
			{
				if (freeWayList.contains(ROAD_COMPONENTS[POINT_COMPONENT])) //if the element is a point
				{
					Distance distance = new Distance(); //create a new Distance object
					this.componentList.add(distance); //add the component to the final arrayList
					counter++;
					continue; //continue at the end of the while
				}
				//if the element is a kind of intersection
				if (freeWayList.contains(ROAD_COMPONENTS[INTERSECTION_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[FOUR_CORNERS_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[FINAL_COMPONENT]))
				{
					Intersection intersection = new Intersection(); //create a new intersection object
					if (freeWayList.contains(ROAD_COMPONENTS[INTERSECTION_COMPONENT])) //if is an intersection
					{
						intersection.setIntersection(); //set as true the intersection
						this.componentList.add(intersection); //add the intersection component to the arrayList
						counter++;
						continue; //continue at the end of the while
					}
					if (freeWayList.contains(ROAD_COMPONENTS[FOUR_CORNERS_COMPONENT])) //if is four corners
					{
						intersection.setFourCorner(); //set as true the four corners
						this.componentList.add(intersection); //add the four corners component to the arrayList
						counter++;
						continue; //continue at the end of the while
					}
					if (freeWayList.contains(ROAD_COMPONENTS[FINAL_COMPONENT])) //if is final component 
					{
						intersection.setFinal(); //set as true the final
						this.componentList.add(intersection); // add to the arrayList the final component
						counter++;
						continue; //continue at the end of the while
					}
				}
				//if is a velocity element
				if (freeWayList.contains(ROAD_COMPONENTS[MAXIMUM_SPEED_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[MINIMUM_SPEED_COMPONENT]))
				{
					Velocity velocity = new Velocity(); //create a new velocity object
					String speed = freeWayList.get(counter).toString().substring(1); //take the numeric values in String format
				    int speedValue = Integer.parseInt(speed); //get an int value by parsing a string
				    if (freeWayList.contains(ROAD_COMPONENTS[MAXIMUM_SPEED_COMPONENT])) //if is maximum speed
				    {
						velocity.setMaximunSpeed(speedValue); //set the maximum speed with the value
						this.componentList.add(velocity); //add that value to the arrayList
						counter++;
						continue; //continue at the end of the while
					}
				    if (freeWayList.contains(ROAD_COMPONENTS[MINIMUM_SPEED_COMPONENT])) //if is minimum speed
				    {
						velocity.setMinimunSpeed(speedValue); //set the minimum speed with the value
						this.componentList.add(velocity); //add that value to the arrayList
						counter++;
						continue; //continue at the end of the while
					}
				}
				if (freeWayList.contains(ROAD_COMPONENTS[RAIN_COMPONENT])) //if is a weather element
				{
					Weather weather = new Weather(); //create a new weather element
					weather.setRain(); //set the rain as true
					this.componentList.add(weather); //add the component to the arrayList
					counter++;
					continue; //continue at the end of the while
				}
				//if is a Time element
				if (freeWayList.contains(ROAD_COMPONENTS[DAY_COMPONENT]) || freeWayList.contains(ROAD_COMPONENTS[NIGHT_COMPONENT]))
				{
					Time time = new Time(); //create a new time object
					if (freeWayList.contains(ROAD_COMPONENTS[DAY_COMPONENT])) //if the element is day
					{
						time.setDay(); //set the day as true and the night as false
						this.componentList.add(time); //add the element to the arrayList
						counter++;
						continue; //continue at the end of the while
					}
					if (freeWayList.contains(ROAD_COMPONENTS[NIGHT_COMPONENT])) //if the element is night
					{
						time.setNight(); //set the night as true and the day as false
						this.componentList.add(time); //add the component to the arrayList
						counter++;
						continue; //continue at the end of the while
					}
				}
				else
				{
					counter++; //increase the counter to analyze next position
				}
			}
		}
		catch (Exception e)
		{
		}
	}
}