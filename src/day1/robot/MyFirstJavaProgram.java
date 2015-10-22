package day1.robot;
import java.util.Random;
import java.util.Scanner;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot eric = new Robot();
		eric.penDown();
		for (int i = 0; i < 4; i++) {
			eric.setSpeed(new Random().nextInt(10));
			eric.move(250);
			eric.turn(90);
		}
	}

}
