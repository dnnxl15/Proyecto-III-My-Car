package proyect.myCar.userInterface;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BrushesPanel extends JPanel implements Runnable
{
	private Image BrushesCar;
	private int Direction;
	private int Velocity;
	
	public BrushesPanel()
	{
		this.setBounds(12, 20, 678, 276);
	    BrushesCar = new ImageIcon("C:/Users/dnnxl/Downloads/Imagenes Poo MyCar/Centro 1.jpeg").getImage();
	    Velocity = 1;
	}
	
	@Override
	public void run() 
	{
		ImageIcon Icon;
		while(true)
		{
			int move = 0;
			if(move == 0)
			{
				if(Direction == 0)
				{
					Icon = new ImageIcon("C:/Users/dnnxl/Downloads/Imagenes Poo MyCar/Derecha 2.jpeg");
				}
				else
				{
					Icon = new ImageIcon("C:/Users/dnnxl/Downloads/Imagenes Poo MyCar/Izquierda 2.jpeg");
				}
				BrushesCar = Icon.getImage();
                repaint();
                move = 1;
				try 
				{
					Thread.sleep(Velocity);
				}
				catch (InterruptedException ex) 
				{
					System.out.println(ex.getMessage());
				}
			}
			else
			{
				if(Direction == 1)
				{
                	Icon = new ImageIcon("C:/Users/dnnxl/Downloads/Imagenes Poo MyCar/Derecha 1.jpeg");
				}
				else
				{
                	Icon = new ImageIcon("C:/Users/dnnxl/Downloads/Imagenes Poo MyCar/Izquierda 1.jpeg");
				}
				BrushesCar = Icon.getImage();
                repaint();
                move = 0;
				try 
				{
					Thread.sleep(Velocity);
				}
				catch (InterruptedException ex) 
				{
				}
			}
		}
	}
	
	@Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(BrushesCar, 20, 20, null);
    }

	public void setDirection(int pDirection)
	{
		Direction = pDirection;
	}
}
