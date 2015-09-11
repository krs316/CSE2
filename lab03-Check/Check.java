//Kyle Sammon
//CSE2
//lab03
//9/11/15
//This program takes input for check total, tip percentage, and ways split to output a cost per split
import java.util.Scanner; //allows scanner to be used somewher in the program
public class Check{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //prompt user to input check total
        System.out.print("Enter the original cost of the check in the form xx.xx:");
        //accept input using Scanner
        double checkCost= myScanner.nextDouble(); //accepts the value as a double
        //promtp user for desired tip percentage
        System.out.print("Enter the percentage tip that you wish to pay as a whole number(in the form xx):");
        //acdcept input as double using scanner
        double tipPercent= myScanner.nextDouble();
        //change tip into decimal value
        tipPercent /=100;
        //prompt user to enter how many ways check should be split
        System.out.print("Enter the number of people who went out to dinner:");
        //accept input as an integer variable
        int numPeople =myScanner.nextInt();
        //output section
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;  //declares dollars, dimes , and dollars for storing purposes
        totalCost=checkCost*(1+tipPercent); //calculates total cost with tip
        costPerPerson=totalCost/numPeople; //divides total cost by number of peole eating
        dollars=(int)costPerPerson; //dollar amount per person
        dimes=(int)(costPerPerson*10) %10; //dimes amount
        pennies=(int)(costPerPerson*100) %10;//pennies amount
        System.out.println("Each person in the group owes $"+ dollars+'.'+dimes+pennies); //Prints out how much each person owes
        
        }
}