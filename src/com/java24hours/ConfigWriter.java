package com.java24hours;

import java.io.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField; 

public class ConfigWriter 
{ 
	String newline = System.getProperty("line.separator"); 
	public ConfigWriter() 
	{ 
		// get current time and date 
		LocalDateTime now = LocalDateTime.now();
		try 
		{
			File file = new File("program.properties");
			FileOutputStream fileStream = new FileOutputStream(file);
			write(fileStream, "username=Ginni");
			write(fileStream, "score=12550");
			write(fileStream, "level=5");
			write(fileStream, now.toString());
			fileStream.close();
			System.out.println("Created the file: " + file.getName());
		} catch (IOException ioe) 
		{
			System.out.println("Could not write file");
		}
	}
	
	void write(FileOutputStream stream, String output)
			throws IOException 
	{
		output = output + newline;
		byte[] data = output.getBytes();
		stream.write(data, 0, data.length);
	}
	
	public static void main(String[] arguments) 
	{
		ConfigWriter cw = new ConfigWriter();
	}
	
}

