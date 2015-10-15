import java.util.Scanner; //allows scanner to be used somewher in the program
public class Twisty{
    //add main method
    public static void main(String[] args){
         Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        System.out.print("Input your desired length:");
        int length=0, width=0; //declares the length and width variables
        //makes sure the value entered for the length is an integer
        while (!myScanner.hasNextInt()){
            System.out.print("Error. Please type an integer: " );
            myScanner.next();
            }
            length=myScanner.nextInt(); //records the lengh input as an integer
           
            //Checks if the input number is less than 0 or greater than 80. Prompts user for new number if so.
            while((length<0)||length>80){
            System.out.print("Please enter only an integer between 0 and 80:" );
             length=myScanner.nextInt();//records new length value if loop enteed
            }
             System.out.print("Input your desired width:");//prompts user to input the width of the pattern
             //ensures that value entered is an integer. If not, prompts user for new width value
             while (!myScanner.hasNextInt()){
            System.out.print("Error. Please type an integer: " );
            myScanner.next();
            }
            width=myScanner.nextInt(); //records width value as an integer
           
            //Checks to make sure the width is not less than 0 or greater than the length.
            while(width<0||width>length){
            System.out.print("Please only enter an integer smaller than length:" );
             width=myScanner.nextInt(); //records new daily expenditure if necessary. This is repeated for each days set of loops
            
            }
            
            for(int i=0;i<width;i++){//this for loop controls which line is printed out ranging from 0 to the width input by the user
                int t=0; //sets counter to stop the repeating of printing the pattern
                int s=1; //sets counter to see which of the two x patterns should be used
                while(t<length){ //repeats the for loop for each line until the length is met
                for(int j=0;j<width;j++){ //controls characters printed out on each line
                    if(j==i&&j+i==width-1&&s==1&&width%2==1&&t!=length){ //used for odd valus to skip coorect character
                        System.out.print("#");
                        t++; //adds to counter
                        }
                    else if(j==i&&j+i==width-1&&s==0&&width%2==1&&t!=length){ //used to skip correct variable for odd wdths
                    System.out.print("\\");
                    t++;
                    
                    }
                //control which character to print out oneach space of eah line
                    else if(j+i==width-1&&s==1&&t!=length){
                    System.out.print("/");
                    t++; 
                    }
                    else if(j==i&&s==1&&t!=length){
                    System.out.print("#");
                    t++;
                    }
                    else if(j+i==width-1&&s==0&&t!=length){
                    System.out.print("#");
                    t++;
                    }
                    else if(j==i&&s==0&&t!=length){
                    System.out.print("\\");
                    t++;
                    }
        
                    else{
                    System.out.print(" ");
                    t++;
                    }
                }
                //switches pattern counter after each pattern is completed so it is possible to know which x pattern is being run
                    if(s==1){
                    s=0;
                    }
                    else{
                    s=1;
                    }
                }
                
                System.out.print("\n"); //ensures that line is skipped
            }
    }
}
    

 