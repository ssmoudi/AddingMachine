package cse360assignment2;

/**
 * Title: Version Control Assignment
 * Description: Using GitHub to create a repository
 * Class: CSE 360
 * @author Shadi Smoudi
 */

public class AddingMachine {
  private int total;
  // string to hold what operation is being done
  private String operator;
  // string to add on to subsequent calcualtions 
  private String totalString = "0";
  
  /**
   * @ param total Initializes the running total
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * Description: Returns the running total
   * @return total The running total from the calculations
   */
  public int getTotal () {
    // returns running total
    return total;
  }
  
  /**
   * Description: Adds integers
   * @param value The integer being passed in
   */
  public void add (int value) {
    // adds value to running total
    total += value;
    // concatenates the + operator to the total string
    totalString += " + ";
    // concatenates the value to the total string
    totalString += value;
  }

  /**
   * Description: Subtracts integers
   * @param value The value being passed in
   */
  public void subtract (int value) {
    // subtracts value from running total
    total -= value;
    // concatenates the - operator to the total string
    totalString += " - ";
    // concatenates the value to the total string
    totalString += value;
  }

  /**
   * Description: Displays a string
   * @return A string that displays the actions carried out
   */
  public String toString () {
    // returns the total string of all the operations and 
    return totalString;
  }

  /**
   * Description: Clears the program inputs
   */
  public void clear() {
    totalString = "";
  }
}