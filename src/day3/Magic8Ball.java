package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int num1 = new Random().nextInt(7);
	// 3. Print out this variable
	System.out.println(num1);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Ask OoooglyBoogly a question");
	// 5. If the random number is 0
	if(num1==0){
		JOptionPane.showMessageDialog(null,"Your fate is sealed, the answer os yes");
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1
	else if(num1==1){
		JOptionPane.showMessageDialog(null,"REJECTED");
	}
	// -- tell the user "No"
	else if(num1==2){
		JOptionPane.showMessageDialog(null,"You have permission to ask google");
	}
	else if(num1==3){
		JOptionPane.showMessageDialog(null,"OooglyBoogly suggestes you get a life outside of magic 8 balls");
	}
	else if(num1==4){
		JOptionPane.showMessageDialog(null,"OooglyBoogly advises you to ask again l8ter");
	}
	else if(num1==5){
		JOptionPane.showMessageDialog(null,"Life speeds up on the best of us");
	}
	else if(num1==6){
		JOptionPane.showMessageDialog(null,"Illuminati confrimed");
	}
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer
	}
}

