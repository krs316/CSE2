/*Kyle Sammon
    CSE2
    hw06
    10/05/15
    This program has the user input an ISBN number. It then checks to see if the number entered is a valid ISBN.
    If the number is invalid it states what the last digit of the ISBN should be.*/
    import java.util.Scanner; //allows scanner to be used somewher in the program
public class CheckDigit{
    //add main method
    public static void main(String[] args){
         Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        System.out.print("Please enter a 10 digit barcode " ); //prompts user to input ISBN/barcode digit
        String x,y,z; //declares future variables to be used as strings
        x=myScanner.next(); //sets x to the scanned isbn value
        //makes sure that isbn value entered has ten digits, if not it prompts user to input valid number
        while(x.length()!=10){
            System.out.print("This is not a valid ISNBN. Please enter 10 digits:");
            x=myScanner.next();
           
        }
        
        int sum=0; //declares sum
        String t=""; // delcares t as a string type variable
       
        
        y=x.substring(0,9); //separates the firts 9 digits of the isbn number form the tenth digit
       
        //runs a for loop to calculate and sum up the first 9 values as they are supposed to be done when checkin g the validity of an isbn number
        for(int i=0;i<9;i++){
          t=y.substring(i,i+1);//seperates correct digit of isbn number
          sum += Integer.parseInt(t)*(10-i); //multiplies each digit by the correct number and sums them up as loop runs
        }
        z=x.substring(9,10); //saves tenth digit as variable z
        int checkdigit=0; //intializes the check digit
        if(z.equals("X")||z.equals("x")){
            checkdigit=10; //sets the check digit to be equal to 10 if the tenth digit is either an uppercase or lowercase x.
        }
        else{
            checkdigit=Integer.parseInt(z); //sets check digit to tenth digit enter if it is not an x or X
        
        }
        // checks to see if teh checkdigit is valid and if so prints out that it is valid
        if((11-(sum % 11))==checkdigit){
        System.out.println("This is a vaild ISBN");
        }
        //sets it so that if the check digi is invalid and should be an X that the user is prompted that it should be X
        if ((11-(sum%11))!=checkdigit){
            if((sum%11)==10){
            System.out.println("This is not a valid ISBN. The check digit should be X");
        }
            
        else{
        //prints out the correct check digit for all other wrong isbn check digit errors
            System.out.println("This is not a valid ISBN. The check digit should be "+(11-(sum%11)));
        }
        }
     
      
        
        
    }
}