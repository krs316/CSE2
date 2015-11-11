//Kyle Sammon
//CSE2
//hw08 String Analysis
//10/16/15
//checks if a string is comprised of only letters
import java.util.Scanner; //allows scanner to be used somewher in the program
public class StringAnalysis{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //prompt user to input the string
        System.out.print("Enter a string ");
        String string=myScanner.next();
        //asks user if they want to anlayze entire string or a certain number of characters
        System.out.print("Would you like to examine all characters or a certain number of chacaters of the string?. If all characters respond all. If you want to analyze a specific number of characters type some.");
        String x=myScanner.next();
        int z=0;
        while("some".equals(x)==false&&"all".equals(x)==false){
            System.out.print("Invalid input. Please respond with some or all");
            x=myScanner.next();
        }
        //ensures value entered is a integer and greater than 0
        if ("some".equals(x)){
        System.out.print("Input the number of characters you want to analyze: ");
        while(!myScanner.hasNextInt()){
            System.out.print("Invalid input. Please enter an integer: ");
            myScanner.next();
        }
        z=myScanner.nextInt();
        while(z<0){
            System.out.print("Please input an integer greater than 0:");
            z=myScanner.nextInt();
        }
        boolean t=analyze(string,z); //sends the string and integer value to method to analyze input
        //prints out result of analysis
        if(t==true){
            System.out.print("Only letters were found");
        }
        else{
            System.out.print("A character other than a letter was found");
        }
        }
        else{
        boolean q=analyze(string); //if want to check entire string send to correct method
        //pprints out result of analysis
        if(q==true){
            System.out.print("Only letters were found");
        }
        else{
            System.out.print("A character other than a letter was found");
        }
        }
        
    }
    //method that accepts a string and an integer
        public static boolean analyze(String a, int b){
            char f; //declares char f
            for(int i=0; i<b&&i<a.length();i++){
                f=a.charAt(i); //sets f equal to each character
                //checks if a character is not a letter
                if(Character.isLetter(f)==false){
                  return false; //if a character is not a letter breaks and returns false
                }
            }
                return true; //return true if for loop is never broken
        }
    //method tht accepts a string only
        public static boolean analyze(String c){
            char f; //declares f as a char
            for(int i=0;i<c.length();i++){ //runs for loop to test each character
                f=c.charAt(i);
                if(Character.isLetter(f)==false){
                    return false; //if false, returns fale to main method
                }
            }
                return true; //if true returns true to main method
        }
}
        