
import javax.swing.JOptionPane;

public class Threepointsix {
	enum Month {January,February,March,April,May,June,July,August,September,October,November,December}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Month [] choices = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December};
		Month select = (Month)JOptionPane.showInputDialog(null, "Select the current month", "Month", JOptionPane.INFORMATION_MESSAGE,null,choices, choices);
		switch (select){
		case January:
		case February:
		case December:
			JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
		break;
		
		case March:
		case April:
		case May:
			JOptionPane.showMessageDialog(null, "Happy Spring days!");
		break;
		
		case June:
		case July:
		case August:
			JOptionPane.showMessageDialog(null, "It’s a summer time.");
		break;
		
		case September:		
		case October:
		case November:
			JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");	
		break;
		
		}
		
			
	}

}
