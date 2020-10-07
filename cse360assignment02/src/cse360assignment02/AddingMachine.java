package cse360assignment02;

/**
 * This class is a simple adding machine that will add, subtract, and track the history of the total value
 */
public class AddingMachine {
	private int total;
	private String history;		// this is to show what values were being added and subtracted
	
	/**
	 * A constructor that will instantiate any Adding Machine object. Sets total and history to 0.
	 */
	public AddingMachine() {
		total = 0;	// not needed - included for clarity
		history = "0";
	}
	
	/**
	 * A method that returns the total value
	 * @return total value
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Add method that adds the parameter variable to the total value
	 * @param value added to total
	 */
	public void add(int value) {
		total = total + value;
		history = history + " + " + value;		// prints out history plus value
	}
	
	/**
	 * Subtract method that subtracts the parameter variable from the total value
	 * @param value subtracted from total
	 */
	public void subtract(int value) {
		total = total - value;
		history = history + " - " + value;		// prints out history minus value
	}
	
	/**
	 * Prints history of the transactions. History starts at the initial 0 value and ends at the last input.
	 * @return a history of the transactions string
	 */
	public String toString() {
		return history;
	}
	
	/**
	 * Empties out the "memory" of the program by having the total value be set back to 0 as well as having the history be set back to "0"
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
