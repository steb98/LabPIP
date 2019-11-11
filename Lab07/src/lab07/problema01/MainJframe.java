package lab07.problema01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class MainJframe {
	JFrame mainWindow = new JFrame("test app");
	JButton btn1 = new JButton("Edit");
	JButton btn2 = new JButton("Nr caractere");
	JTextArea z1 = new JTextArea(6, 30);
	boolean editIsDisabled = true; 
	JTextField t1 = new JTextField(30);
	int nrCaractere = 0;
	
	void init() {
		
		
		
		mainWindow.setSize(400,400);
		
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainWindow.getContentPane().setBackground(Color.black);
		
		mainWindow.setLayout(new FlowLayout());
		
		z1.setEditable(false);
		z1.setText("Salut \n PIP");
		mainWindow.add(z1);
		
		t1.setEditable(false);
		mainWindow.add(t1);
		t1.setText(Integer.toString(z1.getText().length()));
		
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(editIsDisabled == true)
				{
					editIsDisabled = false;
					z1.setEditable(true);
				}
				
				
			}
		});
		
		mainWindow.add(btn1);
		
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(editIsDisabled == false)
				{
					editIsDisabled = true;
					z1.setEditable(false);
					
				}
				t1.setText(Integer.toString(z1.getText().length()));
				
				
			}
		});
		mainWindow.add(btn2);
		
		
		
		mainWindow.setVisible(true);
			
		}
		
	
	
		
	}
