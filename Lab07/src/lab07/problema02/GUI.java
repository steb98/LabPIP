package lab07.problema02;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class GUI {
	
	JFrame window = new JFrame();
	
	void init(){
		
		window.setLayout(new FlowLayout());
		window.setSize(400,400);;
		for(int i=0;i<=9;i++){
			window.add(new JButton(Integer.toString(i)));
		}
		
		
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	}
	
	

