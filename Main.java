package Origin3.copy;

import javax.swing.*;
public class Main {
	public static void main(String[] arg){
		GUI g = new GUI();
		g.setSize(1400,1000);
		g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		g.setVisible(true);
		g.setResizable(false);
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {
		System.out.println("Could Not Load");
	}
		
				
	}
}