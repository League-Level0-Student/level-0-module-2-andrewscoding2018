package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int vote = Integer.parseInt(age);
		if (vote >= 18) {
			String president = JOptionPane.showInputDialog("Who do you think the next president should be?");
			if (president.equals("Kanye West")) {
				JOptionPane.showMessageDialog(null, "Kanye West is a good choice.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares that you think. ");
		}
	}
}
