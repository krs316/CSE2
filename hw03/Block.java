//Kyle Sammon
//CSE2
//hw03 Block
//9/11/15
//This program takes the input for the dimensions of a block and outputs the volume aqnd surface area
import java.util.Scanner; //allows scanner to be used somewher in the program
public class Block{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //prompt user to input the length of the block
        System.out.print("Enter the length of the block:");
        //accept user input as a double
        double length= myScanner.nextDouble();
        //prompt user to input block width
        System.out.print("Enter the width of the block:");
        //accept user input as a double
        double width= myScanner.nextDouble();
        //prompt user to input block height
        System.out.print("Enter the height of the block:");
        //accept input as a double
        double height= myScanner.nextDouble();
        double volume, surfaceArea; //declare variables of double type for surface area and volume
        volume=length*width*height; //calculate volume
        surfaceArea=2*length*width+2*length*height+2*width*height; //calculate surface area
        System.out.println("The volume of the block of dimensions " +length+" x "+ width+" x" +height+" is "+volume+".");
        System.out.println("The surface area of the block is "+surfaceArea+".");
        }
}
        
        