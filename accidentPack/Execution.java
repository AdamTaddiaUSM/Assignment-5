package accidentPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class Execution {
	
	static ArrayList<BinarySearchTree> fiftyNiftyUnitedStates = new ArrayList<BinarySearchTree>();

	public static void main(String args[]) throws FileNotFoundException, InterruptedException{
		File f = new File("C:\\Users\\taddi\\Desktop\\Data Structures Class\\TrafficAccidentsAssignment5\\Assignment5\\src\\accidentPack\\accidents_small_sample.csv");
		Scanner scnr1 = new Scanner(f);
		
		int reportCount = findReportCount(scnr1);
		scnr1.close();
		
		Scanner scnr2 = new Scanner(f);
		scnr2.nextLine();
		populateStateTrees();
		BinarySearchTree.writeReportsToTrees(fiftyNiftyUnitedStates, scnr2, reportCount);
		System.out.println(fiftyNiftyUnitedStates.get(34).State);
		System.out.println(fiftyNiftyUnitedStates.get(34).root.findLeftChildren() + fiftyNiftyUnitedStates.get(34).root.findRightChildren() + 1);
		fiftyNiftyUnitedStates.get(4).inOrderPrint();
		createMenu();
		


		
	}
	
	public static void populateStateTrees() {
		//Alabama
		BinarySearchTree Alabama = new BinarySearchTree("AL");
		fiftyNiftyUnitedStates.add(Alabama);
				
		//Alaska
		BinarySearchTree Alaska = new BinarySearchTree("AK");
		fiftyNiftyUnitedStates.add(Alaska);
				
		//Arkansas
		BinarySearchTree Arkansas = new BinarySearchTree("AR");
		fiftyNiftyUnitedStates.add(Arkansas);
		
		//Arizona
		BinarySearchTree Arizona = new BinarySearchTree("AZ");
		fiftyNiftyUnitedStates.add(Arizona);
				
		//California
		BinarySearchTree California = new BinarySearchTree("CA");
		fiftyNiftyUnitedStates.add(California);
		
		//Colorado
		BinarySearchTree Colorado = new BinarySearchTree("CO");
		fiftyNiftyUnitedStates.add(Colorado);
		
		//Connecticut
		BinarySearchTree Connecticut = new BinarySearchTree("CT");
		fiftyNiftyUnitedStates.add(Connecticut);
				
		//Delaware
		BinarySearchTree Delaware = new BinarySearchTree("DE");
		fiftyNiftyUnitedStates.add(Delaware);
				
		//Florida
		BinarySearchTree Florida = new BinarySearchTree("FL");
		fiftyNiftyUnitedStates.add(Florida);
				
		//Georgia
		BinarySearchTree Georgia = new BinarySearchTree("GA");
		fiftyNiftyUnitedStates.add(Georgia);
				
		//Hawaii
		BinarySearchTree Hawaii = new BinarySearchTree("HI");
		fiftyNiftyUnitedStates.add(Hawaii);
				
		//Iowa
		BinarySearchTree Iowa = new BinarySearchTree("IA");
		fiftyNiftyUnitedStates.add(Iowa);
				
		//Idaho
		BinarySearchTree Idaho = new BinarySearchTree("ID");
		fiftyNiftyUnitedStates.add(Idaho);
					
		//Illinois
		BinarySearchTree Illinois = new BinarySearchTree("IL");
		fiftyNiftyUnitedStates.add(Illinois);
				
		//Indiana
		BinarySearchTree Indiana = new BinarySearchTree("IN");
		fiftyNiftyUnitedStates.add(Indiana);
		
		//Kansas
		BinarySearchTree Kansas = new BinarySearchTree("KS");
		fiftyNiftyUnitedStates.add(Kansas);
				
		//Kentucky
		BinarySearchTree Kentucky = new BinarySearchTree("KY");
		fiftyNiftyUnitedStates.add(Kentucky);
				
		//Louisiana
		BinarySearchTree Louisiana = new BinarySearchTree("LA");
		fiftyNiftyUnitedStates.add(Louisiana);
				
		//Massachusetts
		BinarySearchTree Massachusetts = new BinarySearchTree("MA");
		fiftyNiftyUnitedStates.add(Massachusetts);
				
		//Maryland
		BinarySearchTree Maryland = new BinarySearchTree("MD");
		fiftyNiftyUnitedStates.add(Maryland);
				
		//Maine (THE BEST STATE! WE'RE #1!!!!!!!!! YEAHHHHH)
		BinarySearchTree Maine = new BinarySearchTree("ME");
		fiftyNiftyUnitedStates.add(Maine);
				
		//Michigan
		BinarySearchTree Michigan = new BinarySearchTree("MI");
		fiftyNiftyUnitedStates.add(Michigan);
				
		//Minnesota
		BinarySearchTree Minnesota = new BinarySearchTree("MN");
		fiftyNiftyUnitedStates.add(Minnesota);
				
		//Missouri
		BinarySearchTree Missouri = new BinarySearchTree("MO");
		fiftyNiftyUnitedStates.add(Missouri);
				
		//Mississippi
		BinarySearchTree Mississippi = new BinarySearchTree("MS");
		fiftyNiftyUnitedStates.add(Mississippi);
		
		//Montana
		BinarySearchTree Montana = new BinarySearchTree("MT");
		fiftyNiftyUnitedStates.add(Montana);
		
		
		//North Carolina
		BinarySearchTree NorthCarolina = new BinarySearchTree("NC");
		fiftyNiftyUnitedStates.add(NorthCarolina);
				
		//North Dakota
		BinarySearchTree NorthDakota = new BinarySearchTree("ND");
		fiftyNiftyUnitedStates.add(NorthDakota);
			
		//Nebraska
		BinarySearchTree Nebraska = new BinarySearchTree("NE");
		fiftyNiftyUnitedStates.add(Nebraska);
				
		//New Hampshire
		BinarySearchTree NewHampshire = new BinarySearchTree("NH");
		fiftyNiftyUnitedStates.add(NewHampshire);
				
		//New Jersey
		BinarySearchTree NewJersey = new BinarySearchTree("NJ");
		fiftyNiftyUnitedStates.add(NewJersey);
				
		//New Mexico
		BinarySearchTree NewMexico = new BinarySearchTree("NM");
		fiftyNiftyUnitedStates.add(NewMexico);
				
		//Nevada
		BinarySearchTree Nevada = new BinarySearchTree("NV");
		fiftyNiftyUnitedStates.add(Nevada);
				
		//New York
		BinarySearchTree NewYork = new BinarySearchTree("NY");
		fiftyNiftyUnitedStates.add(NewYork);
				
		//Ohio
		BinarySearchTree Ohio = new BinarySearchTree("OH");
		fiftyNiftyUnitedStates.add(Ohio);
				
		//Oklahoma
		BinarySearchTree Oklahoma = new BinarySearchTree("OK");
		fiftyNiftyUnitedStates.add(Oklahoma);
				
		//Oregon
		BinarySearchTree Oregon = new BinarySearchTree("OR");
		fiftyNiftyUnitedStates.add(Oregon);
				
		//Pennsylvania
		BinarySearchTree Pennsylvania = new BinarySearchTree("PA");
		fiftyNiftyUnitedStates.add(Pennsylvania);
		
		//Rhode Island
		BinarySearchTree RhodeIsland = new BinarySearchTree("RI");
		fiftyNiftyUnitedStates.add(RhodeIsland);
				
		//South Carolina
		BinarySearchTree SouthCarolina = new BinarySearchTree("SC");
		fiftyNiftyUnitedStates.add(SouthCarolina);
				
		//South Dakota
		BinarySearchTree SouthDakota = new BinarySearchTree("SD");
		fiftyNiftyUnitedStates.add(SouthDakota);
				
		//Tennessee
		BinarySearchTree Tennessee = new BinarySearchTree("TN");
		fiftyNiftyUnitedStates.add(Tennessee);
				
		//Texas
		BinarySearchTree Texas = new BinarySearchTree("TX");
		fiftyNiftyUnitedStates.add(Texas);
				
		//Utah
		BinarySearchTree Utah = new BinarySearchTree("UT");
		fiftyNiftyUnitedStates.add(Utah);
				
		//Virginia
		BinarySearchTree Virginia = new BinarySearchTree("VA");
		fiftyNiftyUnitedStates.add(Virginia);
				
		//Vermont
		BinarySearchTree Vermont = new BinarySearchTree("VT");
		fiftyNiftyUnitedStates.add(Vermont);
				
		//Washington
		BinarySearchTree Washington = new BinarySearchTree("WA");
		fiftyNiftyUnitedStates.add(Washington);
				
		//Wisconsin
		BinarySearchTree Wisconsin = new BinarySearchTree("WI");
		fiftyNiftyUnitedStates.add(Wisconsin);
				
		//West Virginia
		BinarySearchTree WestVirgina = new BinarySearchTree("WV");
		fiftyNiftyUnitedStates.add(WestVirgina);
		
		//Wyoming
		BinarySearchTree Wyoming = new BinarySearchTree("WY");
		fiftyNiftyUnitedStates.add(Wyoming);
	}
	
	public static void createMenu() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the desired state for traffic accident data, in the ");
		System.out.println("two letter abbreviation format, IE AL for Alabama, WY for Wyoming, etc: ");
		
		String date;
		String state;
		
		boolean validState = false;
		do {
		state = input.next();
		if (state.length() != 2) {
			System.out.println("State abbreviation must be 2 letters. Retry.");
		} else {
			validState = true;
		}
		}while (validState == false);
		
		boolean validDate = false;
		do {
		System.out.println("Enter the desired date, in the YYYY/MM/DD format, to find all traffic accidents after that date: ");
		date = input.next();
		
		//this bit of code just makes sure a valid date is entered
		if(		date.length() == 10 &&
				(!((Character.isDigit(date.charAt(0)))== false || (Character.isDigit(date.charAt(1)))== false || (Character.isDigit(date.charAt(2)))== false || (Character.isDigit(date.charAt(3)))== false
				||(Character.isDigit(date.charAt(5)))== false ||(Character.isDigit(date.charAt(6)))== false ||(Character.isDigit(date.charAt(8)))== false ||(Character.isDigit(date.charAt(9)))== false
				|| (date.charAt(4) != '/') || (date.charAt(7) != '/')))) {	
			validDate = true;
		} else {
			System.out.println("Invalid format used. Reenter.");
		}
		} while (validDate == false);
		
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
		
		System.out.println(fiftyNiftyUnitedStates.get(4).findAccidentsAfterDateNONRECURSIVE(year, month, day));
	}
	

	
	/**complexity of n. For every report, the while loop runs once, plus one extra time.
	 *the scanner created in the main method is passed as a parameter, where a while loop
	 *adds to reportCount until there are no more lines. reportCount starts at -1 to account for the first line.
	 *When there are no more lines, and every entry has been read, the integer reportCount is returned.
	 *This method is used to find the size of the array of reports.
	 *COPIED FROM EXECUTION.JAVA
	 */
	public static int findReportCount(Scanner scn){//passes the scanner as a parameter to get the number of reports
		long startTime = System.nanoTime();
		int reportCount = -1;//starts at -1 to account for first line
		
		while(scn.hasNextLine()) {
			scn.nextLine();
			reportCount += 1;
		}
		
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) + " nanoseconds to run findReportCount");
		return reportCount;
	}
}
