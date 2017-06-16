package proyect.myCar.userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import proyect.myCar.library.IConstants;
import proyect.myCar.library.IObservable;
import proyect.myCar.library.IObserver;
import proyect.myCar.logic.ThreadManager;

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
	private JTextField FileNameEntry;
	private static MyCar Instance;
	private IObservable Observable;
	
	public synchronized static MyCar getInstance()
	{
		if (Instance==null)
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
		frmMyCar.setTitle("My Car");
		frmMyCar.setBounds(100, 100, 1034, 708);
		frmMyCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyCar.getContentPane().setLayout(null);
		
		JLabel lblMyCar = new JLabel("My Beatiful Car");
		lblMyCar.setForeground(new Color(255, 255, 255));
		lblMyCar.setFont(new Font("Kristen ITC", Font.BOLD, 43));
		lblMyCar.setBounds(28, 29, 371, 60);
		frmMyCar.getContentPane().add(lblMyCar);
		
		JButton ChargeButton = new JButton(DOUBLE_QUOTATION_MARK);
		ChargeButton.setBackground(new Color(0, 206, 209));
		ChargeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ChargeButton.setIcon(new ImageIcon(LIST_OF_IMAGES[8]));
		ChargeButton.setBounds(62, 599, 38, 37);
		frmMyCar.getContentPane().add(ChargeButton);
		
		JButton PlayButton = new JButton("");
		PlayButton.setBackground(new Color(0, 206, 209));
		PlayButton.setIcon(new ImageIcon(LIST_OF_IMAGES[7]));
		PlayButton.setBounds(12, 599, 38, 37);
		frmMyCar.getContentPane().add(PlayButton);
		
		FileNameEntry = new JTextField();
		FileNameEntry.setColumns(10);
		FileNameEntry.setBounds(112, 606, 287, 30);
		frmMyCar.getContentPane().add(FileNameEntry);
		
		JLabel lblPoints = new JLabel("Points");
		lblPoints.setForeground(Color.WHITE);
		lblPoints.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblPoints.setBounds(724, 49, 83, 37);
		frmMyCar.getContentPane().add(lblPoints);
		
		JLabel lblVelocity = new JLabel("Velocity");
		lblVelocity.setForeground(Color.WHITE);
		lblVelocity.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblVelocity.setBounds(724, 116, 83, 37);
		frmMyCar.getContentPane().add(lblVelocity);
		
		JLabel PointLabel = new JLabel("0");
		PointLabel.setForeground(Color.WHITE);
		PointLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		PointLabel.setBounds(889, 49, 83, 37);
		frmMyCar.getContentPane().add(PointLabel);
		
		JLabel lblGear = new JLabel("Gear");
		lblGear.setForeground(Color.WHITE);
		lblGear.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblGear.setBounds(724, 179, 83, 37);
		frmMyCar.getContentPane().add(lblGear);
		
		JLabel lblLights = new JLabel("Lights");
		lblLights.setForeground(Color.WHITE);
		lblLights.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblLights.setBounds(724, 235, 83, 37);
		frmMyCar.getContentPane().add(lblLights);
		
		JLabel lblLightsRight = new JLabel("Lights Right");
		lblLightsRight.setForeground(Color.WHITE);
		lblLightsRight.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblLightsRight.setBounds(724, 297, 151, 37);
		frmMyCar.getContentPane().add(lblLightsRight);
		
		JLabel lblLightsLeft = new JLabel("Lights Left");
		lblLightsLeft.setForeground(Color.WHITE);
		lblLightsLeft.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblLightsLeft.setBounds(724, 360, 151, 37);
		frmMyCar.getContentPane().add(lblLightsLeft);
		
		JLabel lblBrushes = new JLabel("Brushes");
		lblBrushes.setForeground(Color.WHITE);
		lblBrushes.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblBrushes.setBounds(724, 430, 83, 37);
		frmMyCar.getContentPane().add(lblBrushes);
		
		JLabel WeatherLabel = new JLabel("Day");
		WeatherLabel.setForeground(Color.WHITE);
		WeatherLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		WeatherLabel.setBounds(724, 491, 83, 37);
		frmMyCar.getContentPane().add(WeatherLabel);
		
		JLabel lblRain = new JLabel("Rain");
		lblRain.setForeground(Color.WHITE);
		lblRain.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblRain.setBounds(724, 556, 83, 37);
		frmMyCar.getContentPane().add(lblRain);
		
		JLabel VelocityLabel = new JLabel("0");
		VelocityLabel.setForeground(Color.WHITE);
		VelocityLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		VelocityLabel.setBounds(889, 116, 83, 37);
		frmMyCar.getContentPane().add(VelocityLabel);
		
		JLabel GearLabel = new JLabel("0");
		GearLabel.setForeground(Color.WHITE);
		GearLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		GearLabel.setBounds(889, 179, 83, 37);
		frmMyCar.getContentPane().add(GearLabel);
		
		JLabel LightsLabel = new JLabel(NO);
		LightsLabel.setForeground(Color.WHITE);
		LightsLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		LightsLabel.setBounds(889, 235, 83, 37);
		frmMyCar.getContentPane().add(LightsLabel);
		
		JLabel LightRightLabel = new JLabel(NO);
		LightRightLabel.setForeground(Color.WHITE);
		LightRightLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		LightRightLabel.setBounds(889, 297, 83, 37);
		frmMyCar.getContentPane().add(LightRightLabel);
		
		JLabel LightLeftLabel = new JLabel(NO);
		LightLeftLabel.setForeground(Color.WHITE);
		LightLeftLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		LightLeftLabel.setBounds(889, 360, 83, 37);
		frmMyCar.getContentPane().add(LightLeftLabel);
		
		JLabel RainLabel = new JLabel(NO);
		RainLabel.setForeground(Color.WHITE);
		RainLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		RainLabel.setBounds(889, 556, 83, 37);
		frmMyCar.getContentPane().add(RainLabel);
		
		JLabel BrushesLabel = new JLabel(NO);
		BrushesLabel.setForeground(Color.WHITE);
		BrushesLabel.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		BrushesLabel.setBounds(889, 430, 83, 37);
		frmMyCar.getContentPane().add(BrushesLabel);
		
		JButton RightButton = new JButton(DOUBLE_QUOTATION_MARK);
		RightButton.setBackground(new Color(0, 206, 209));
		RightButton.setIcon(new ImageIcon(LIST_OF_IMAGES[7]));
		RightButton.setBounds(12, 458, 38, 37);
		frmMyCar.getContentPane().add(RightButton);
		
		JButton LeftButton = new JButton(DOUBLE_QUOTATION_MARK);
		LeftButton.setBackground(new Color(0, 206, 209));
		LeftButton.setIcon(new ImageIcon(LIST_OF_IMAGES[6]));
		LeftButton.setBounds(610, 458, 38, 37);
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
		LessButton.setBounds(138, 458, 38, 37);
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
		AddButton.setBounds(480, 458, 38, 37);
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
		WindShieldButton.setBounds(287, 442, 91, 53);
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
		LeftLightButton.setBounds(211, 529, 38, 37);
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
		RightLightButton.setBounds(415, 529, 38, 37);
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
		Lights.setBounds(312, 529, 38, 37);
		frmMyCar.getContentPane().add(Lights);
	}

	@Override
	public void update() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setObservable(IObservable pObservable) // Add the observable
	{
		this.Observable = pObservable;
		this.Observable.addObserver(this);
	}
}
