
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Homework3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* -Variables- */
		
		String[] choices = { "Admin", "Student", "Staff"};		
		String [] Username = {"admin1", "student2", "staff3"};
		String[] Password = {"admin1", "student2", "staff3"};
		String aInput, pInput, uInput; // User input
		int aIndex, pIndex, uIndex;  // Indexes for User-name, Password, Choices Validation
		int Trial = 0, Limit = 3;	 // Limits

		/* -Trial<Limit Loop- */
		
		while (Trial < Limit ){
			String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
			aInput = (input);
			for (aIndex = 0; aIndex<choices.length; aIndex++ ){ // Getting the Index number of choices.
				if (aInput.equals(choices[aIndex])){
					String user = JOptionPane.showInputDialog("Enter Username");
					uInput = (user);
					for (uIndex = 0; uIndex<Username.length; uIndex++ ){ // Getting Index number of User-name
						if(uInput.equals(Username[uIndex])){
							if (uIndex == aIndex){ // If the Index number of choices is equal to the Index User-Name (Validation)
								while(Trial<Limit){
									String pass = JOptionPane.showInputDialog("Enter Password");
									pInput = (pass);
									if (pInput.equals(Password[uIndex])){ // If Password input equals the Index number of User-name in the Password array.
										/* Switch Statements */
										switch (aInput){
										case "Admin":
											System.out.println("Welcome Admin! You can update and read file");
											Trial = 4;
											break;
										case "Staff":
											System.out.println("Welcome Staff! You can update, read, add, delete file.");
											Trial = 4;
											break;
										case "Student":
											System.out.println("Welcome Student! You can only read file.");
											Trial = 4;
											break;
										}
									}
									else {
										/* Wrong Password */
										System.out.println("WrongPass");
										Trial++;
										continue;
									}
								}
							}
							else {
								/* If Choices Index is NOT equal to User-name Index */
								break;
							}
						}

					}

				}
			}
			Trial++;
		}

		/* If after the while loop Trail > 3 */
		if (Trial == 3){
			System.out.println("Contact Admin");
		}


	}
}
