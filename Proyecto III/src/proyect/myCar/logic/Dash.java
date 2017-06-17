package proyect.myCar.logic;

import java.util.ArrayList;
import java.util.Iterator;

import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;

public class Dash
{
	private int velocity;
	private int gear;
	private boolean lights;
	private boolean leftDirectional;
	private boolean rightDirectional;
	private boolean brushes;
	
	public Dash()
	{
		this.velocity = 0;
		this.gear = 0;
		this.lights = false;
		this.leftDirectional = false;
		this.rightDirectional = false;
	}
}
