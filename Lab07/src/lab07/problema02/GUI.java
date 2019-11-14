package lab07.problema02;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //scrren dimmensions
	JFrame window = new JFrame();
	JTextField accumulatorContainer  = new JTextField();
	int accumulator = 0;
	int remember = 0;
	final int bWidth = 50;
	final int bHeight = 50;
	final int bXPoz = 20;
	final int bYPoz = 20;
	String opSet = "";
	

	void init(){
		
		
		addNumpad();
		addAccumulator();
		addOperations();
		
		window.setSize(290,390);
		window.setLayout(null);
		window.setResizable(false);
		window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	void addOperations() {
		int btnXPoz = bXPoz+3*bWidth+3*10;
		int btnYPoz = bYPoz+bHeight+10;
		for(int i=0;i<5;i++) {
			JButton b =new JButton();
			b.addActionListener(buttonPressed);
			switch (i) {
			case 0:
				b.setText("+");
				break ;
			case 1:
				b.setText("-");
				break ;
			case 2:
				b.setText("*");
				break ;
			case 3:
				b.setText("/");
				break ;
			case 4:
				b.setText("=");
				b.setBounds(btnXPoz, btnYPoz-bHeight-10, bWidth, bHeight);
				break ;

			default:
				break;
			}
			b.setBackground(new Color(204,204,204));
			if(i!=4)
			b.setBounds(btnXPoz, btnYPoz+bHeight*i+i*10, bWidth, bHeight);
			window.add(b);
				
			}
	}
	void addAccumulator() {
		accumulatorContainer.setBounds(20, 30, 170, 30);
		accumulatorContainer.setEditable(false);
		accumulatorContainer.setHorizontalAlignment(SwingConstants.RIGHT);
		accumulatorContainer.setText(""+accumulator);
		window.add(accumulatorContainer);
	}
	void addNumpad() {
		int row = 0;
		int col = 0;
		int bXOffset = 10;
		int bYOffset = 10;
		
		for(int i=0;i<=11;i++){
			
			JButton b =new JButton();
			b.addActionListener(buttonPressed);
			
			if(i>=9) {
				if(i==9)
					b.setText(""+0);
				b.setBackground(Color.white);
				if(i==10)
					b.setText("C");
				if(i==11) {
					b.setText("+/-");
					b.setBackground(new Color(204,204,204));}
				
			}
				
			else {
				b.setText(""+(i+1));
				b.setBackground(Color.white);
			}
			
						
			
			if(i%3==0) {
				row++;
				col=0;
				bXOffset = 0;
			}
			else {
				bXOffset = 10;
			}
			
			b.setBounds(bXPoz+bWidth*col +col* bXOffset,bYPoz+bHeight*row+bYOffset*row,bWidth,bHeight);
			col++;
			
			window.add(b);
			
		}
		row = 0;
		col = 0;
		
	}
	
	
	
	
	
	void addDigitInAcc(String d) {
		accumulator=accumulator*10+Integer.parseInt(d);  //String to int
		accumulatorContainer.setText(""+accumulator);
	}
	
	void clear() {
		accumulator = 0;
		remember = 0;
		accumulatorContainer.setText(""+accumulator);
		opSet = "";
	}
	
	void opperation(String op) {
		
		switch (op) {
		case "+":
			remember = accumulator;
			accumulator = 0;
			accumulatorContainer.setText(""+accumulator);
			opSet = "+";
			break;
		case "-":
			remember = accumulator;
			accumulator = 0;
			accumulatorContainer.setText(""+accumulator);
			opSet = "-";
			break;
		case "*":
			remember = accumulator;
			accumulator = 0;
			accumulatorContainer.setText(""+accumulator);
			opSet = "*";
			break;
		case "/":
			remember = accumulator;
			accumulator = 0;
			accumulatorContainer.setText(""+accumulator);
			opSet = "-";
			break;
		case "+/-":
			accumulator=-accumulator;
			accumulatorContainer.setText(""+accumulator);
			
			break;

		default:
			
			break;
		}
		
	}
	
	void calculate() {
		int rez = 0;
		switch (opSet) {
		
		case "+":
			rez = remember + accumulator;
			accumulator = rez;
			accumulatorContainer.setText(""+rez);
			break;
		case "-":
			rez = remember - accumulator;
			accumulator = rez;
			accumulatorContainer.setText(""+rez);
			break;
		case "*":
			rez = remember * accumulator;
			accumulator = rez;
			accumulatorContainer.setText(""+rez);
			break;
		case "/":
			rez = remember / accumulator;
			accumulator = rez;
			accumulatorContainer.setText(""+rez);
			break;
		default:
			break;
		}
	}
	ActionListener buttonPressed = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "1":
				addDigitInAcc(cmd);
				break;
			case "2":
				addDigitInAcc(cmd);
				break;
			case "3":
				addDigitInAcc(cmd);
				break;
			case "4":
				addDigitInAcc(cmd);
				break;
			case "5":
				addDigitInAcc(cmd);
				break;
			case "6":
				addDigitInAcc(cmd);
				break;
			case "7":
				addDigitInAcc(cmd);
				break;
			case "8":
				addDigitInAcc(cmd);
				break;
			case "9":
				addDigitInAcc(cmd);
				break;
			case "0":
				addDigitInAcc(cmd);
				break;
				
			case "-":
				opperation(cmd);
				break;
			case "+":
				opperation(cmd);
				break;
			case "*":
				opperation(cmd);
				break;
			case "/":
				opperation(cmd);
				break;
			case "=":
				calculate();
				break;
			case "C":
				clear();
				break;
			case "+/-":
				opperation(cmd);
				break;

			default:
				break;
			}
			
			
		}
	};
	
	
	
}
	
	

