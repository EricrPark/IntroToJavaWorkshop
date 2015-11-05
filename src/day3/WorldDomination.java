package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String question = JOptionPane.showInputDialog("Do you know how to write code? yes or no");
		// 2. If they say "yes", tell them they will rule the world.
		if(question.equals ("yes")){
			JOptionPane.showMessageDialog(null,"YOU sHaLL RuLE thE WOrLD!...                                                                                                                                                                                        with bananas");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else{
			JOptionPane.showMessageDialog(null,"I wish you the best of luck washing dishes...                                                                                                                                                               pineapples taste good");
		}
	}
}

