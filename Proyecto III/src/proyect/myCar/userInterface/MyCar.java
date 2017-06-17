package proyect.myCar.userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import proyect.myCar.library.DashElementType;
import proyect.myCar.library.FreeWayComponentType;
import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;
import proyect.myCar.logic.Distance;
import proyect.myCar.logic.FreeWayComponent;
import proyect.myCar.logic.Intersection;
import proyect.myCar.logic.ThreadManager;
import proyect.myCar.logic.Time;
import proyect.myCar.logic.Velocity;
import proyect.myCar.logic.Weather;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCar implements IConstants, IObserver
{
	private JFrame frmMyCar;
	private JLabel RainLabel;
	private JLabel WeatherLabel;
	private JLabel IntersectionLabel;
	private JLabel SpeedLabel;
	private JLabel ValueLabel;
	private JLabel MeterLabel;
	private JLabel ValueMeterLabel;
	private JLabel BrushesLabel;
	private JLabel GearLabel;
	private JLabel LightsLabel;
	private JLabel VelocityLabel;
	private JLabel LightRightLabel;
	private JLabel LightLeftLabel;
	
	private JTextField FileNameEntry;
	private static MyCar Instance;
	private IObservable ObservableFreeWay;
	private IObservable ObservableDash;
	
	
	public synchronized static MyCar getInstance()
	{
		if (Instance == null)
		{
			Instance = new MyCar();
		}
		return Instance;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCar window = MyCar.getInstance();
					window.frmMyCar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private MyCar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyCar = new JFrame();
		frmMyCar.getContentPane().setBackground(new Color(0, 206, 209));
		frmMyCar.setTitle(TITLE);
		frmMyCar.setBounds(100, 100, 1034, 841);
		frmMyCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyCar.getContentPane().setLayout(null);
		
		JLabel lblMyCar = new JLabel("My Beatiful Car");
		lblMyCar.setForeground(new Color(255, 255, 255));
		lblMyCar.setFont(new Font(FONT, Font.BOLD, 43));
		lblMyCar.setBounds(28, 29, 371, 60);
		frmMyCar.getContentPane().add(lblMyCar);
		
		JButton ChargeButton = new JButton(DOUBLE_QUOTATION_MARK);
		ChargeButton.setBackground(new Color(0, 206, 209));
		ChargeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ChargeButton.setIcon(new ImageIcon(LIST_OF_IMAGES[8]));
		ChargeButton.setBounds(65, 728, 38, 37);
		frmMyCar.getContentPane().add(ChargeButton);
		
		JButton PlayButton = new JButton(DOUBLE_QUOTATION_MARK);
		PlayButton.setBackground(new Color(0, 206, 209));
		PlayButton.setIcon(new ImageIcon(LIST_OF_IMAGES[7]));
		PlayButton.setBounds(12, 728, 38, 37);
		frmMyCar.getContentPane().add(PlayButton);
		
		FileNameEntry = new JTextField();
		FileNameEntry.setColumns(10);
		FileNameEntry.setBounds(138, 735, 287, 30);
		frmMyCar.getContentPane().add(FileNameEntry);
		
		JLabel lblPoints = new JLabel(POINTS_TEXT);
		lblPoints.setForeground(Color.WHITE);
		lblPoints.setFont(new Font(FONT, Font.BOLD, 19));
		lblPoints.setBounds(724, 49, 83, 37);
		frmMyCar.getContentPane().add(lblPoints);
		
		JLabel lblVelocity = new JLabel(VELOCITY_TEXT);
		lblVelocity.setForeground(Color.WHITE);
		lblVelocity.setFont(new Font(FONT, Font.BOLD, 19));
		lblVelocity.setBounds(724, 116, 83, 37);
		frmMyCar.getContentPane().add(lblVelocity);
		
		JLabel PointLabel = new JLabel(ZERO_TEXT);
		PointLabel.setForeground(Color.WHITE);
		PointLabel.setFont(new Font(FONT, Font.BOLD, 19));
		PointLabel.setBounds(889, 49, 83, 37);
		frmMyCar.getContentPane().add(PointLabel);
		
		JLabel lblGear = new JLabel(GEAR_TEXT);
		lblGear.setForeground(Color.WHITE);
		lblGear.setFont(new Font(FONT, Font.BOLD, 19));
		lblGear.setBounds(724, 179, 83, 37);
		frmMyCar.getContentPane().add(lblGear);
		
		JLabel lblLights = new JLabel(LIGHTS_TEXT);
		lblLights.setForeground(Color.WHITE);
		lblLights.setFont(new Font(FONT, Font.BOLD, 19));
		lblLights.setBounds(724, 235, 83, 37);
		frmMyCar.getContentPane().add(lblLights);
		
		JLabel lblLightsRight = new JLabel(LIGHT_RIGHT_TEXT);
		lblLightsRight.setForeground(Color.WHITE);
		lblLightsRight.setFont(new Font(FONT, Font.BOLD, 19));
		lblLightsRight.setBounds(724, 297, 151, 37);
		frmMyCar.getContentPane().add(lblLightsRight);
		
		JLabel lblLightsLeft = new JLabel(LIGHT_LEFT_TEXT);
		lblLightsLeft.setForeground(Color.WHITE);
		lblLightsLeft.setFont(new Font(FONT, Font.BOLD, 19));
		lblLightsLeft.setBounds(724, 360, 151, 37);
		frmMyCar.getContentPane().add(lblLightsLeft);
		
		JLabel lblBrushes = new JLabel(BRUSHES_TEXT);
		lblBrushes.setForeground(Color.WHITE);
		lblBrushes.setFont(new Font(FONT, Font.BOLD, 19));
		lblBrushes.setBounds(724, 430, 83, 37);
		frmMyCar.getContentPane().add(lblBrushes);
		
		WeatherLabel = new JLabel();
		WeatherLabel.setForeground(Color.WHITE);
		WeatherLabel.setFont(new Font(FONT, Font.BOLD, 19));
		WeatherLabel.setBounds(724, 491, 83, 37);
		frmMyCar.getContentPane().add(WeatherLabel);
		
		JLabel lblRain = new JLabel(RAIN_TEXT);
		lblRain.setForeground(Color.WHITE);
		lblRain.setFont(new Font(FONT, Font.BOLD, 19));
		lblRain.setBounds(724, 556, 83, 37);
		frmMyCar.getContentPane().add(lblRain);
		
		VelocityLabel = new JLabel(ZERO_TEXT);
		VelocityLabel.setForeground(Color.WHITE);
		VelocityLabel.setFont(new Font(FONT, Font.BOLD, 19));
		VelocityLabel.setBounds(889, 116, 83, 37);
		frmMyCar.getContentPane().add(VelocityLabel);
		
		GearLabel = new JLabel(ZERO_TEXT);
		GearLabel.setForeground(Color.WHITE);
		GearLabel.setFont(new Font(FONT, Font.BOLD, 19));
		GearLabel.setBounds(889, 179, 83, 37);
		frmMyCar.getContentPane().add(GearLabel);
		
		LightsLabel = new JLabel(NO);
		LightsLabel.setForeground(Color.WHITE);
		LightsLabel.setFont(new Font(FONT, Font.BOLD, 19));
		LightsLabel.setBounds(889, 235, 83, 37);
		frmMyCar.getContentPane().add(LightsLabel);
		
		LightRightLabel = new JLabel(NO);
		LightRightLabel.setForeground(Color.WHITE);
		LightRightLabel.setFont(new Font(FONT, Font.BOLD, 19));
		LightRightLabel.setBounds(889, 297, 83, 37);
		frmMyCar.getContentPane().add(LightRightLabel);
		
		LightLeftLabel = new JLabel(NO);
		LightLeftLabel.setForeground(Color.WHITE);
		LightLeftLabel.setFont(new Font(FONT, Font.BOLD, 19));
		LightLeftLabel.setBounds(889, 360, 83, 37);
		frmMyCar.getContentPane().add(LightLeftLabel);
		
		RainLabel = new JLabel(FALSE);
		RainLabel.setForeground(Color.WHITE);
		RainLabel.setFont(new Font(FONT, Font.BOLD, 19));
		RainLabel.setBounds(889, 556, 83, 37);
		frmMyCar.getContentPane().add(RainLabel);
		
		BrushesLabel = new JLabel(NO);
		BrushesLabel.setForeground(Color.WHITE);
		BrushesLabel.setFont(new Font(FONT, Font.BOLD, 19));
		BrushesLabel.setBounds(889, 430, 83, 37);
		frmMyCar.getContentPane().add(BrushesLabel);
		
		JButton RightButton = new JButton(DOUBLE_QUOTATION_MARK);
		RightButton.setBackground(new Color(0, 206, 209));
		RightButton.setIcon(new ImageIcon(LIST_OF_IMAGES[7]));
		RightButton.setBounds(22, 577, 38, 37);
		frmMyCar.getContentPane().add(RightButton);
		
		JButton LeftButton = new JButton(DOUBLE_QUOTATION_MARK);
		LeftButton.setBackground(new Color(0, 206, 209));
		LeftButton.setIcon(new ImageIcon(LIST_OF_IMAGES[6]));
		LeftButton.setBounds(609, 577, 38, 37);
		frmMyCar.getContentPane().add(LeftButton);
		
		JButton LessButton = new JButton(DOUBLE_QUOTATION_MARK);
		LessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int March = Integer.parseInt(GearLabel.getText());
				if(March == 0)
				{
					return;
				}
				else
				{
					String MarchTotal = String.valueOf(March - GEAR); //////////Convertirlo a constante /////
					GearLabel.setText(MarchTotal);
				}

			}
		});
		LessButton.setBackground(new Color(0, 206, 209));
		LessButton.setIcon(new ImageIcon(LIST_OF_IMAGES[5]));
		LessButton.setBounds(138, 577, 38, 37);
		frmMyCar.getContentPane().add(LessButton);
		
		JButton AddButton = new JButton(DOUBLE_QUOTATION_MARK);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int March = Integer.parseInt(GearLabel.getText());
				if(March == 5)
				{
					return;
				}
				else
				{
					String MarchTotal = String.valueOf(March + GEAR); //////////Convertirlo a constante /////
					GearLabel.setText(MarchTotal);
				}

			}
		});
		AddButton.setBackground(new Color(0, 206, 209));
		AddButton.setIcon(new ImageIcon(LIST_OF_IMAGES[4]));
		AddButton.setBounds(481, 577, 38, 37);
		frmMyCar.getContentPane().add(AddButton);
		
		JButton WindShieldButton = new JButton(DOUBLE_QUOTATION_MARK);
		WindShieldButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String BrushesState = BrushesLabel.getText();
				if(BrushesState == YES)
				{
					BrushesLabel.setText(NO);
				}
				else
				{	
					BrushesLabel.setText(YES);
				}
			}
		});
		WindShieldButton.setBackground(new Color(0, 206, 209));
		WindShieldButton.setIcon(new ImageIcon(LIST_OF_IMAGES[3]));
		WindShieldButton.setBounds(282, 561, 91, 53);
		frmMyCar.getContentPane().add(WindShieldButton);
		
		JButton LeftLightButton = new JButton(DOUBLE_QUOTATION_MARK);
		LeftLightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String LightLeftState = LightLeftLabel.getText();
				if(LightLeftState == YES)
				{
					LightLeftLabel.setText(NO);
				}
				else
				{	
					LightLeftLabel.setText(YES);
				}
			}
		});
		LeftLightButton.setBackground(new Color(0, 206, 209));
		LeftLightButton.setIcon(new ImageIcon(LIST_OF_IMAGES[2]));
		LeftLightButton.setBounds(208, 651, 38, 37);
		frmMyCar.getContentPane().add(LeftLightButton);
		
		JButton RightLightButton = new JButton(DOUBLE_QUOTATION_MARK);
		RightLightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String LightRightState = LightRightLabel.getText();
				if(LightRightState == YES)
				{
					LightRightLabel.setText(NO);
				}
				else
				{	
					LightRightLabel.setText(YES);
				}
			}
		});
		RightLightButton.setBackground(new Color(0, 206, 209));
		RightLightButton.setIcon(new ImageIcon(LIST_OF_IMAGES[1]));
		RightLightButton.setBounds(412, 651, 38, 37);
		frmMyCar.getContentPane().add(RightLightButton);
		
		JButton Lights = new JButton(DOUBLE_QUOTATION_MARK);
		Lights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String LightState = LightsLabel.getText();
				if(LightState == YES)
				{
					LightsLabel.setText(NO);
				}
				else
				{	
					LightsLabel.setText(YES);
				}
			}
		});
		Lights.setBackground(new Color(0, 206, 209));
		Lights.setIcon(new ImageIcon(LIST_OF_IMAGES[0]));
		Lights.setBounds(308, 651, 38, 37);
		frmMyCar.getContentPane().add(Lights);
		
		IntersectionLabel = new JLabel();
		IntersectionLabel.setForeground(Color.WHITE);
		IntersectionLabel.setFont(new Font(FONT, Font.BOLD, 19));
		IntersectionLabel.setBounds(724, 620, 83, 37);
		frmMyCar.getContentPane().add(IntersectionLabel);
		
		SpeedLabel = new JLabel();
		SpeedLabel.setForeground(Color.WHITE);
		SpeedLabel.setFont(new Font(FONT, Font.BOLD, 19));
		SpeedLabel.setBounds(724, 688, 83, 37);
		frmMyCar.getContentPane().add(SpeedLabel);
		
		ValueLabel = new JLabel();
		ValueLabel.setForeground(Color.WHITE);
		ValueLabel.setFont(new Font(FONT, Font.BOLD, 19));
		ValueLabel.setBounds(889, 688, 83, 37);
		frmMyCar.getContentPane().add(ValueLabel);
		
		MeterLabel = new JLabel(METER_TEXT);
		MeterLabel.setForeground(Color.WHITE);
		MeterLabel.setFont(new Font(FONT, Font.BOLD, 19));
		MeterLabel.setBounds(724, 744, 83, 37);
		frmMyCar.getContentPane().add(MeterLabel);
		
		ValueMeterLabel = new JLabel();
		ValueMeterLabel.setForeground(Color.WHITE);
		ValueMeterLabel.setFont(new Font(FONT, Font.BOLD, 19));
		ValueMeterLabel.setBounds(889, 744, 83, 37);
		frmMyCar.getContentPane().add(ValueMeterLabel);
	}

	@Override
	public void update(FreeWayComponent pComponent) 
	{
		if(pComponent.getIdentifier() == FreeWayComponentType.WEATHER)
		{
			Weather weather = (Weather) pComponent;
			if (weather.isRaining() == true)
			{
				this.RainLabel.setText(TRUE);
			}
		}
		else if(pComponent.getIdentifier() == FreeWayComponentType.DISTANCE)
		{
			Distance distance = (Distance) pComponent;
			int meters = distance.getMeter() + Integer.parseInt(this.ValueMeterLabel.getText());
			String metersTotal = String.valueOf(meters);
			this.ValueMeterLabel.setText(metersTotal);
		}
		else if(pComponent.getIdentifier() == FreeWayComponentType.INTERSECTION)
		{
			Intersection intersection = (Intersection) pComponent;
			if(intersection.isFinal())
			{
				this.IntersectionLabel.setText(FINAL);
			}
			else if(intersection.isFourCorner())
			{
				this.IntersectionLabel.setText(FOUR_CORNER);
			}
			else
			{
				this.IntersectionLabel.setText(INTERSECTION);
			}
		}
		else if(pComponent.getIdentifier() == FreeWayComponentType.VELOCITY)
		{
			Velocity velocity = (Velocity) pComponent;
			if(velocity.isMaximumSpeed())
			{
				this.SpeedLabel.setText(MAXIMUN_SPEED);
				String valueSpeed = String.valueOf(velocity.getMaximunSpeed());
				this.ValueLabel.setText(valueSpeed);
			}
			else
			{
				this.SpeedLabel.setText(MINIMUN_SPEED);
				String valueSpeed = String.valueOf(velocity.getMinimunSpeed());
				this.ValueLabel.setText(valueSpeed);
			}
		}
		else
		{
			Time time = (Time) pComponent;
			if(time.isDay())
			{
				this.WeatherLabel.setText(DAY);
			}
			else
			{
				this.WeatherLabel.setText(NIGHT);
			}
		}
	}

	@Override
	public void setObservable(IObservable pObservable) // Add the observable
	{
		this.ObservableFreeWay = pObservable;
		this.ObservableFreeWay.addObserver(this);
	}

	// I didn't use 
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DashElementType pType, int pState) 
	{
		if(DashElementType.BRUSHES == pType)
		{
			if(pState == ON)
			{
				BrushesLabel.setText(YES);
			}
			else
			{
				BrushesLabel.setText(NO);
			}
		}
		else if(DashElementType.GEAR == pType)
		{
			String Gear = String.valueOf(pState);
			GearLabel.setText(Gear);
		}
		else if(DashElementType.LIGHTS == pType)
		{
			if(pState == ON)
			{
				LightsLabel.setText(YES);
			}
			else
			{
				LightsLabel.setText(NO);
			}
		}
		else if(DashElementType.VELOCITY == pType)
		{
			String value = String.valueOf(pState);
			VelocityLabel.setText(value); 
		}
		else if(DashElementType.LIGHTS_LEFT == pType)
		{
			if(pState == ON)
			{
				LightLeftLabel.setText(YES);
			}
			else 
			{
				LightLeftLabel.setText(NO);
			}
		}
		else if(DashElementType.LIGHTS_RIGHT == pType)
		{
			if(pState == ON)
			{
				LightRightLabel.setText(YES);
			}
			else
			{
				LightRightLabel.setText(NO);
			}
		}
		else
		{
		}
	}

	@Override
	public void setSecondObservable(IObservable pObservable) 
	{
		this.ObservableDash = pObservable;
		this.ObservableDash.addObserver(this);
	}
}
