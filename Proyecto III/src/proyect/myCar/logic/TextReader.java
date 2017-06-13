package proyect.myCar.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextReader 
{
	private static TextReader Instance; //instance

<<<<<<< HEAD
	private TextReader()//
=======
	TextReader()
>>>>>>> refs/remotes/origin/master
	{
	}
	
	public synchronized static TextReader getInstance()
	{
		if (Instance==null)
		{
			Instance = new TextReader();
		}
		return Instance;
	}
	
	public String readFile(String pFile)  //read the file
	{
		String Text = "";
	    try
	    { 
	    	File TextFile = new File(pFile); //TextFile of the File type
	    	FileReader ReaderText = new FileReader(TextFile); //ReaderText of the FileReader type
	    	BufferedReader ReaderBuffer = new BufferedReader(ReaderText); //ReaderBuffer of the BufferedReader type
	   		String Line;
	   		String Chain = "";
	   		while ((Line = ReaderBuffer.readLine()) != null) //read each line
	   		{
	   			Chain = Chain + Line;
    		}
	    	Text = Chain; //Text equal to CHain
	    	ReaderBuffer.close();
	   	}
	   	catch(Exception e)
	   	{
    	}
	    return Text;
	}
}