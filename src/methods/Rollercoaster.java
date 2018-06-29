package methods;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String height = JOptionPane.showInputDialog("What is your height in inches?");
int greater = Integer.parseInt(height);
			if(greater >= 48)
			{
				JOptionPane.showMessageDialog(null, "You can go on the ride.");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You suck. ");
			}
}
}
