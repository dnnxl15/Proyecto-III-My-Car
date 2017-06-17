package proyect.myCar.library;

public interface IConstants 
{
	public final int MAXIMUM_REVOLUTIONS = 3000; // the car can't exeed that limit

	public final int MOUNT_OF_THREADS = 5; // Mount of thread 

	public final int TRACK_METERS = 100; //Symbology of point
	
	public final String DOUBLE_QUOTATION_MARK = "";
	
	public final String MINIMUN = "m";

	public final String MAXIMUN = "M";
	
	public final String ONE_HUNDRED_METERS = ".";
	
	public final int ONE_HUNDRED = 100;
	
	public final int ACCELERATION = 20; //accelerates in a constant from 0 to 100 km/h in 5 seconds}
	
	public final int POINTS_ON_GAME = 100; //mount of points to be played in the game
	
	public final int POINTS_LOSE_BY_FAULT = 5; //mount of points would be lost by each fault
	
	public final String[] ROAD_COMPONENTS = 
	{
			".",
			"T", 
			"+",
			"F",
			"M",
			"m",
			"L",
			"D",
			"N"
	};
	
	public final short POINT_COMPONENT = 0;
	
	public final short INTERSECTION_COMPONENT = 1;
	
	public final short FOUR_CORNERS_COMPONENT = 2;
	
	public final short FINAL_COMPONENT = 3;
	
	public final short MAXIMUM_SPEED_COMPONENT = 4;
	
	public final short MINIMUM_SPEED_COMPONENT = 5;
	
	public final short RAIN_COMPONENT = 6;
	
	public final short DAY_COMPONENT = 7;
	
	public final short NIGHT_COMPONENT = 8;
	
	
	// User Interface 
	
	public final String YES = "Yes";
	
	public final String NO = "No";
	
	public final int GEAR = 1;
	
	public final String[] LIST_OF_IMAGES = 
	{
			"C:\\Users\\dnnxl\\Downloads\\bombilla.png",
			"C:\\Users\\dnnxl\\Downloads\\bombilla (1).png",
			"C:\\Users\\dnnxl\\Downloads\\bombilla (2).png",
			"C:\\Users\\dnnxl\\Downloads\\limpiaparabrisas.png",
			"C:\\Users\\dnnxl\\Downloads\\signo-mas.png",
			"C:\\Users\\dnnxl\\Downloads\\linea-menos.png",
			"C:\\Users\\dnnxl\\Downloads\\adelante.png",
			"C:\\Users\\dnnxl\\Downloads\\espalda (1).png",
			"C:\\Users\\dnnxl\\Downloads\\boton-de-reproduccion (1).png",
			"C:\\Users\\dnnxl\\Downloads\\boton-de-cargar (1).png"
	};
	
	// Constant used to update the user interface with the FreeWay
	
	public final int WAIT = 10;
	
	public final String FALSE = "False";
	
	public final String TRUE = "True";
	
	public final String FINAL = "Final";
	
	public final String FOUR_CORNER = "Four Corner";
	
	public final String INTERSECTION = "Intersection";
	
	public final String MAXIMUN_SPEED = "Maximun Speed";
	
	public final String MINIMUN_SPEED = "Minimun Speed";
	
	public final String DAY = "Day";
	
	public final String NIGHT = "Night";
	
	public final int ON = 1;
	
	public final int OFF = 0;
	
	public final int MAXIMUN_GEAR = 5;
	
	public final int MINIMUN_GEAR = 1;
	
	// User Interface 
	
	public final String FONT = "Kristen ITC";

	public final String TITLE = "My Car";
	
	public final String METER_TEXT = "Meters"; 
	
	public final String ZERO_TEXT = "0";
	
	public final String RAIN_TEXT = "Rain";
	
	public final String BRUSHES_TEXT = "Brushes";
	
	public final String LIGHT_LEFT_TEXT = "Lights Left";
	
	public final String LIGHT_RIGHT_TEXT = "Lights Right";
	
	public final String LIGHTS_TEXT = "Lights";
	
	public final String GEAR_TEXT = "Gear";
	
	public final String VELOCITY_TEXT = "Velocity"; 
	
	public final String POINTS_TEXT = "Points";
	

}