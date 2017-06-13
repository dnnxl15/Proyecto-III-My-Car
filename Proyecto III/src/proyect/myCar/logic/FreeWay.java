package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;
import proyect.myCar.library.*;

public class FreeWay implements IObservable, IConstants
{
	private ArrayList<IObserver> Observers;
	
	public FreeWay()
	{
		this.Observers = new ArrayList<IObserver>();
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
		return myFinalRoute;
	/*	try
		{
			for (int position = 0; position < myFinalRoute.size(); position++)
			{
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println(myFinalRoute.get(position).toString());
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
			}
		}
		catch (Exception e)
		{
		}*/
	}
	
	public void loadFreeComponent(String pFileName)
	{
		List<String> ListOfComponents = splitText(pFileName);
		FactoryComponent FreeWayComponentFactory = FactoryComponent.getInstance();
		for (int position = 0; position < ListOfComponents.size(); position++)
		{
			if(ListOfComponents.get(position).toString() == ONE_HUNDRED_METERS)
			{
				FreeWayComponent Distance = FreeWayComponentFactory.createComponent(FreeWayComponentType.DISTANCE);
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		 FreeWay road = new FreeWay();
		 road.splitText("C:/Users/dnnxl/Desktop/ruta.txt");
	}
}
