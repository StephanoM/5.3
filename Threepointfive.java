

import java.util.Scanner;

public class Threepointfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your role: (Administrator, Faculty, Staff, Student, Guest)");
		String role = keyboard.next();
		switch(role) {
		case "Administrator":
			System.out.println("Welcome "+role+"!");
		case "Faculty":
			System.out.println("Welcome "+role+"!");
		case "Staff":
			System.out.println("Welcome "+role+"!");
		case "Student":
			System.out.println("Welcome "+role+"!");
		case "Guest":
			System.out.println("Welcome "+role+"!");
			
		}
		
	}
	
	
}
