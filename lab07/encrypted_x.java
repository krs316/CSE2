import java.util.Scanner; //allows scanner to be used somewher in the program
public class encrypted_x{
    //add main method
    public static void main(String[] args){
         Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        System.out.print("Enter an intger between 0-100:");
        int size=0;
        while (!myScanner.hasNextInt()){
            System.out.print("Sorry, you did not enter an intger between 1-100. Please re-enter. " );
            myScanner.next();
            }
            size=myScanner.nextInt(); //records daily expenditure. This is repeated for each days set of loops
           
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
            while((size<0)||size>100){
            System.out.print("Please enter only positive numbers. Try again: $" );
             size=myScanner.nextInt(); //records new daily expenditure if necessary. Thi sis repeated for each days set of loops
            
            }
            for(int i=0;i<size;i++){
                System.out.print("\n");
                for(int j=0;j<size;j++){
                if(j==i||j==(size-(i+1))){
                System.out.print(" ");
                }
                else{
                    
                    System.out.printf("*");
                }
            }
        }
    }
}
            