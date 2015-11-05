package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
		String mandlebrot = JOptionPane.showInputDialog("Enter the word");
		// 3. If the user spelled the word correctly, speak "correct"
		if(mandlebrot.equals("mandlebrot")){
			speak(mandlebrot+" is correct");
			speak("James your verict is final... you are a noodle the computer has spoken");
		}
		// 4. Otherwise say "wrong"
		else{
			speak(mandlebrot+" is wrong");
			speak("James your verict is final... you are a noodle the computer has spoken");
		}
		// 5. repeat the process for other words
		speak("spell srengthelessnesses");
		// 2. Catch the user's answer in a String
		String strengthlessnesses = JOptionPane.showInputDialog("Enter the word");
		// 3. If the user spelled the word correctly, speak "correct"
		if(strengthlessnesses.equals("strengthlessnesses")){
			speak(strengthlessnesses+" is correct");
			speak("James your verict has changed... you are a are uglier than a patatoe after rotting for 17 years...Agreed...love how you agree...Computers never lie...so it must be true");
		}
		// 4. Otherwise say "wrong"
		else{
			speak(strengthlessnesses+" is wrong");
			speak("James your verict has changed... you are a are uglier than a patatoe after rotting for 17 years...Agreed...love how you agree...Computers never lie...so it must be true");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


