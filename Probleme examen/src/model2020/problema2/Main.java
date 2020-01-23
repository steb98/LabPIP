package model2020.problema2;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Main {
	static JTextField tf= new JTextField(30);
	
	public static void main(String[] args) {
		
		
		JFrame w = new JFrame("Examen");
		w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		w.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		w.setSize(400, 400);
		JButton b = new JButton("Press me");
		b.addActionListener(new Click());
		w.add(tf);
		w.add(b);
		w.setVisible(true);
		
		
	}
		
	

}
