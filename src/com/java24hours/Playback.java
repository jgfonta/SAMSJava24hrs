package com.java24hours;
import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {

	public Playback() 
	{
		super("Playback"); 
		setLookAndFeel();
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);

		//Define all the panels
		JPanel buttons = new JPanel();
		
		JPanel labeltext = new JPanel();
		JPanel checkboxes = new JPanel();
		JPanel combobox = new JPanel();
		JPanel textbox = new JPanel();
		
		buttons.setLayout(flo);
		labeltext.setLayout(flo);
		checkboxes.setLayout(flo);
		combobox.setLayout(flo);
		textbox.setLayout(flo);
		
		add(buttons);
		
		add(labeltext);
		add(checkboxes);
		add(combobox);
		add(textbox);
		
		//Buttons
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		buttons.add(play);
		buttons.add(stop);
		buttons.add(pause);
		
		//Labels and text fields
		
		JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
		JTextField pageAddress = new JTextField("www.ibm.com",20);
		labeltext.add(pageLabel);
		labeltext.add(pageAddress);

		//Checkboxes
		//Independent checkbox for size
		JCheckBox jumboSize = new JCheckBox("Jumbo Size");
		
		//These are all mutually exclusive checkboxes under meals
		JCheckBox frogLegs = new JCheckBox("Frog Leg Grande", true);
		JCheckBox fishTacos = new JCheckBox("Fish Taco Platter", false);
		JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
		ButtonGroup meals = new ButtonGroup();
		meals.add(frogLegs);
		meals.add(fishTacos);
		meals.add(emuNuggets);
		checkboxes.add(jumboSize);
		checkboxes.add(frogLegs);
		checkboxes.add(fishTacos);
		checkboxes.add(emuNuggets);
		
		JComboBox profession = new JComboBox();
		profession.addItem("Butcher");
		profession.addItem("Baker");
		profession.addItem("Candlestick maker");
		profession.addItem("Fletcher");
		profession.addItem("Fighter");
		profession.addItem("Technical writer");
		profession.setEditable(true);
		combobox.add(profession);
		
		JTextArea comments = new JTextArea("Enter your comments here",8, 40);
		comments.setLineWrap(false);
		comments.setEditable(true);
		//add(comments);
		JScrollPane scroll = new JScrollPane(comments,    
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,    
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textbox.add(scroll);
		

		
		setVisible(true);
	}
	private void setLookAndFeel() 
	{         
		try 
		{	             
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error         
		}
	}
	
	public static void main(String[] args) {
		Playback frame = new Playback();
	}

}
