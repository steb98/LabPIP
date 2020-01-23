package model2020.problema2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Click implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			Runnable t = new Runnable() {
				
				@Override
				public void run() {
					String text = Main.tf.getText();
					try {
						FileWriter fileWriter = new FileWriter("output.txt");
						PrintWriter printWriter = new PrintWriter(fileWriter);
						System.out.println("acads");
						for(int i=0;i<10000;i++)
							printWriter.print(text+"\n");
						printWriter.close();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
						
			};
			t.run();
		}
}
