import java.util.Scanner;

public class DataCollection {
	public static void main(String[] args) {

		/* Declarations */
		final int stopProgram = -1;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int positiveChange = 0;
		int negativeChange = 0;
		int noChange = 0;
		int currentValue = 3;
		int userInput = 0;
		
		/* Data Collection */
		System.out.println("Enter the polling data or -1 to stop");
		Scanner scan = new Scanner (System.in);
		userInput = scan.nextInt();
		while (userInput != stopProgram) {
			if (userInput == 1) {
				one++;
			}
			else if (userInput == 2) {
				two++;
			}
			else if (userInput == 3) {
				three++;
			}
			else if (userInput == 4) {
				four++;
			}
			else {
				five++;
			}
			if (currentValue == userInput) {
				noChange++;
			}
			else if (currentValue > userInput){
				negativeChange++;
			}
			else {
				positiveChange++;
			}
            currentValue = userInput;
            System.out.println("Enter the polling data or -1 to stop");
            userInput = scan.nextInt();
		}
		
		/* Output */
		System.out.println("1 was chosen " + one + " times.");
		System.out.println("2 was chosen " + two + " times.");
		System.out.println("3 was chosen " + three + " times.");
		System.out.println("4 was chosen " + four + " times.");
		System.out.println("5 was chosen " + five + " times.");
		System.out.println(" ");
		System.out.println("There were:");
		System.out.println(positiveChange + " Positive changes");
		System.out.println(negativeChange + " Negative changes");
		System.out.println(noChange + " No changes");
	}

}
