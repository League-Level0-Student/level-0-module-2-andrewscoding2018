package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTicket {
public static void main(String[] args) {
	String payment = JOptionPane.showInputDialog("Would you like a lottery ticket? Insert a $.");
if(payment.equals("$"))
{
			for(int repeat = 0; repeat < 5; repeat++)
 {
	 Random randa = new Random();
	 int randoma = randa.nextInt((9-0)+1);
	 JOptionPane.showMessageDialog(null, randoma);
 }
}
else
{
	JOptionPane.showMessageDialog(null, "You suck. ");
}
}
}
