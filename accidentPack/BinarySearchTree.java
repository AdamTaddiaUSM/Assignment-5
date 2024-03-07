package accidentPack;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {

	public String State;
	public Node root;
	
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
	
	
	/**
	 * A simple constructor for a tree, that is made with a state.
	 * @param state
	 */
	public BinarySearchTree(String state) {
		this.State = state;
	}
	
	/**
	 * If given a state as an input, as well as an arrayList of the trees for each
	 * of the 50 states, this returns the tree of the given state.
	 * @param treeList
	 * @param state
	 * @return
	 */
	public static BinarySearchTree getTree(ArrayList<BinarySearchTree> treeList, String state) {
		for (BinarySearchTree BST : treeList) {
			if(BST.State.equals(state)) {
				return BST;
			} 
		}
		System.out.println("No match found for state: " + state);
		return null;
	}
	
	/**
	 * the method that takes the scanner of the csv file, and populates the trees stored in the arrayList of trees.
	 * A report is made, and a node is made from this report.
	 * Every tree is scanned through until the tree with the same state as the report is found.
	 * The report is then added to the root node of the tree, or made the root node if the tree is empty.
	 * See Node.addNode to see how this is implemented.
	 * @param trees
	 * @param scnr
	 * @param reportCount
	 */
	public static void writeReportsToTrees(ArrayList<BinarySearchTree> trees, Scanner scnr, int reportCount) {
	for (int i = 0; i < reportCount; i ++) {
	Report tempReport = Report.createReport(scnr);	
	Node newNode = new Node(tempReport);
	for (int j = 0; j < trees.size(); j++) {
		if (newNode.data.getState().equals(trees.get(j).State)) {
			if (trees.get(j).root == null) {
				trees.get(j).root = newNode;
			} else {
			trees.get(j).root.addNode(newNode);
			}
			newNode.findLeftChildren();
			newNode.findRightChildren();
		//	System.out.println("added to " + trees.get(j).State);
		}
	}
	}
	}
	
	public int findAccidentsAfterDateNONRECURSIVE(int year, int month, int day) {
		
		int accidentsOnOrAfterDate = 0;
		
		Node currentNode = this.root;
		
		while(currentNode != null) {
			if (currentNode.data.getStartTime()[0] > year) {//compares years first
				accidentsOnOrAfterDate += 1 + currentNode.findRightChildren();
				currentNode = currentNode.left;
			} else if (currentNode.data.getStartTime()[0] < year) {
				currentNode = currentNode.right;
			} else {//if year is the same, compares month
				if (currentNode.data.getStartTime()[1] > month) {//compares months next
					accidentsOnOrAfterDate += 1 + currentNode.findRightChildren();
					currentNode = currentNode.left;
				} else if (currentNode.data.getStartTime()[1] < month) {
					currentNode = currentNode.right;
				} else {//if month is the same, compares day
					if (currentNode.data.getStartTime()[2] >= day) {//compares months next
						accidentsOnOrAfterDate += 1 + currentNode.findRightChildren();
						currentNode = currentNode.left;
					} else if (currentNode.data.getStartTime()[2] < day) {
						currentNode = currentNode.right;
					}
				}
			}
		}
		
		return accidentsOnOrAfterDate;
	}
	
	public void inOrderPrint() throws InterruptedException {
		inOrderPrint(this.root);
	}
	
	
	public void inOrderPrint(Node n) throws InterruptedException {
		if (n == null) {
			return;
		}
		
	
		inOrderPrint(n.left);
		n.data.print();
		inOrderPrint(n.right);
	}
}