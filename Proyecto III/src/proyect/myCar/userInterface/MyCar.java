package proyect.myCar.userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCar {

	private JFrame frmMyCar;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCar window = new MyCar();
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
	public MyCar() {
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\boton-de-cargar (1).png"));
		btnNewButton.setBounds(62, 599, 38, 37);
		frmMyCar.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBackground(new Color(0, 206, 209));
		button.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\boton-de-reproduccion (1).png"));
		button.setBounds(12, 599, 38, 37);
		frmMyCar.getContentPane().add(button);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(112, 606, 287, 30);
		frmMyCar.getContentPane().add(textField_1);
		
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
		
		JLabel label_1 = new JLabel("0");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		label_1.setBounds(889, 49, 83, 37);
		frmMyCar.getContentPane().add(label_1);
		
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
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setForeground(Color.WHITE);
		lblDay.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblDay.setBounds(724, 491, 83, 37);
		frmMyCar.getContentPane().add(lblDay);
		
		JLabel lblRain = new JLabel("Rain");
		lblRain.setForeground(Color.WHITE);
		lblRain.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblRain.setBounds(724, 556, 83, 37);
		frmMyCar.getContentPane().add(lblRain);
		
		JLabel label = new JLabel("0");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		label.setBounds(889, 116, 83, 37);
		frmMyCar.getContentPane().add(label);
		
		JLabel lblNo_5 = new JLabel("No");
		lblNo_5.setForeground(Color.WHITE);
		lblNo_5.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblNo_5.setBounds(889, 179, 83, 37);
		frmMyCar.getContentPane().add(lblNo_5);
		
		JLabel lblNo_4 = new JLabel("No");
		lblNo_4.setForeground(Color.WHITE);
		lblNo_4.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblNo_4.setBounds(889, 235, 83, 37);
		frmMyCar.getContentPane().add(lblNo_4);
		
		JLabel lblNo_3 = new JLabel("No");
		lblNo_3.setForeground(Color.WHITE);
		lblNo_3.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblNo_3.setBounds(889, 297, 83, 37);
		frmMyCar.getContentPane().add(lblNo_3);
		
		JLabel lblNo_2 = new JLabel("No");
		lblNo_2.setForeground(Color.WHITE);
		lblNo_2.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblNo_2.setBounds(889, 360, 83, 37);
		frmMyCar.getContentPane().add(lblNo_2);
		
		JLabel lblNo_1 = new JLabel("No");
		lblNo_1.setForeground(Color.WHITE);
		lblNo_1.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblNo_1.setBounds(889, 556, 83, 37);
		frmMyCar.getContentPane().add(lblNo_1);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setForeground(Color.WHITE);
		lblNo.setFont(new Font("Kristen ITC", Font.BOLD, 19));
		lblNo.setBounds(889, 430, 83, 37);
		frmMyCar.getContentPane().add(lblNo);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(new Color(0, 206, 209));
		button_1.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\espalda (1).png"));
		button_1.setBounds(12, 458, 38, 37);
		frmMyCar.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(new Color(0, 206, 209));
		button_2.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\adelante.png"));
		button_2.setBounds(610, 458, 38, 37);
		frmMyCar.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(new Color(0, 206, 209));
		button_3.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\linea-menos.png"));
		button_3.setBounds(138, 458, 38, 37);
		frmMyCar.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(new Color(0, 206, 209));
		button_4.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\signo-mas.png"));
		button_4.setBounds(480, 458, 38, 37);
		frmMyCar.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(new Color(0, 206, 209));
		button_5.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\limpiaparabrisas.png"));
		button_5.setBounds(287, 442, 91, 53);
		frmMyCar.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(new Color(0, 206, 209));
		button_6.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\bombilla (2).png"));
		button_6.setBounds(211, 529, 38, 37);
		frmMyCar.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBackground(new Color(0, 206, 209));
		button_7.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\bombilla (1).png"));
		button_7.setBounds(415, 529, 38, 37);
		frmMyCar.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBackground(new Color(0, 206, 209));
		button_8.setIcon(new ImageIcon("C:\\Users\\dnnxl\\Downloads\\bombilla.png"));
		button_8.setBounds(312, 529, 38, 37);
		frmMyCar.getContentPane().add(button_8);
	}
}
