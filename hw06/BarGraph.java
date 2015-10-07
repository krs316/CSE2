/*Kyle Sammon
    CSE2
    hw06
    10/05/15
    This program has the user input their daily expenses and calculates theri weekly expenses and daily expense average. It alos estimates the total amount of mone
    spent over four years using a random number generator to alter the one week average by up to 20%. */
    
import java.util.Scanner; //allows scanner to be used somewher in the program
public class BarGraph{
    //add main method
    public static void main(String[] args){
         Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //prompt user to input Monday Expenses
        Double Monday=0.0;
        Double Tuesday=0.0;
        Double Wednesday=0.0;
        Double Thursday=0.0;
        Double Friday=0.0;
        Double Saturday=0.0;
        Double Sunday=0.0;
        System.out.print("Enter the amount spent on Monday $");
        
           //checks if input is a number. if not it asks for a new input.
            while (!myScanner.hasNextDouble()){
            System.out.print("Sorry, you did not enter a valid number. try again: $" );
            myScanner.next();
            }
            Monday=myScanner.nextDouble(); //records daily expenditure. This is repeated for each days set of loops
           
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
            while(Monday<0.0){
            System.out.print("Please enter only positive numbers. Try again: $" );
             Monday=myScanner.nextDouble(); //records new daily expenditure if necessary. Thi sis repeated for each days set of loops
            
            }
            
            System.out.print("Enter the amount spent on Tuesday $");
            //checks if input is a number. if not it asks for a new input.
            while (!myScanner.hasNextDouble()){
            System.out.print("Sorry, you did not enter a valid number. try again: $" );
            myScanner.next();
            }
            Tuesday=myScanner.nextDouble();
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
             while(Tuesday<0){
            System.out.print("Please enter only positive numbers. Try again: $" );
            Tuesday=myScanner.nextDouble();
            }
             
            
               System.out.print("Enter the amount spent on Wednesday $");
               //checks if input is a number. if not it asks for a new input.
            while (!myScanner.hasNextDouble()){
            System.out.print("Sorry, you did not enter a valid number. try again: $" );
            myScanner.next();
            }
            Wednesday=myScanner.nextDouble();
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
            while(Wednesday<0){
            System.out.print("Please enter only positive numbers. Try again: $" );
            Wednesday=myScanner.nextDouble();
            }
             
           
               System.out.print("Enter the amount spent on Thursday $");
            //checks if input is a number. if not it asks for a new input.
            while (!myScanner.hasNextDouble()){
            System.out.print("Sorry, you did not enter a valid number. try again: $" );
            myScanner.next();
             
            }
            Thursday=myScanner.nextDouble();
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
             while(Thursday<0){
            System.out.print("Please enter only positive numbers. Try again: $" );
            Thursday=myScanner.nextDouble();
             
            }
             
             //checks if input is a number. if not it asks for a new input.
            System.out.print("Enter the amount spent on Friday $");
            while (!myScanner.hasNextDouble()){
            System.out.print("Sorry, you did not enter a valid number. try again: $" );
            myScanner.next();
            }
            Friday=myScanner.nextDouble();
            
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
             while(Friday<0){
            System.out.print("Please enter only positive numbers. Try again: $" );
            Friday=myScanner.nextDouble();
            }
             
            
             System.out.print("Enter the amount spent on Saturday $");
             //checks if input is a number. if not it asks for a new input.
            while (!myScanner.hasNextDouble()){
            System.out.print("Sorry, you did not enter a valid number. try again: $" );
            myScanner.next();
            }
            Saturday=myScanner.nextDouble();
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
             while(Saturday<0){
            System.out.print("Please enter only positive numbers. Try again: $" );
            Saturday=myScanner.nextDouble();
            }
             
             
               System.out.print("Enter the amount spent on Sunday $");
            while (!myScanner.hasNextDouble()){
            System.out.print("Sorry, you did not enter a valid number. try again: $" );
            myScanner.next();
            }
              Sunday= myScanner.nextDouble();
            //Checks if the input number is greater than 0. If it is not, it prompts user to enter a new number.
             while(Sunday<0){
            System.out.print("Please enter only positive numbers. Try again: $" );
           Sunday= myScanner.nextDouble();
            }
             
             
            //rounds values for expenses to correct integers for each day
             int m=(int)(Monday+.5);
             int t=(int)(Tuesday+.5);
             int w=(int)(Wednesday+.5);
             int tr=(int)(Thursday+.5);
             int f=(int)(Friday+.5);
             int sat=(int)(Saturday+.5);
             int sun=(int)(Sunday+.5);
             int i=0;
             //uses a series of while loops that are limited by each days corresponding dollars spent to print the correct number of * to create the bar graph
             System.out.print("Mon:\t  ");
             while (i<m){
                 System.out.print("*");
                 ++i;
             }
             System.out.print("\nTues:\t  ");
             i=0; //resets i to 0 for next loop
              while (i<t){
                 System.out.print("*");
                 ++i;
             }
             i=0;//resets i to 0 for next loop
             System.out.print("\nWed::\t  ");
              while (i<w){
                 System.out.print("*");
                 ++i;
             }
             i=0;//resets i to 0 for next loop
             System.out.print("\nThu:\t  ");
              while (i<tr){
                 System.out.print("*");
                 ++i;
             }
             i=0;//resets i to 0 for next loop
             System.out.print("\nFri:\t  ");
              while (i<f){
                 System.out.print("*");
                 ++i;
             }
             i=0;//resets i to 0 for next loop
             System.out.print("\nSat:\t  ");
              while (i<sat){
                 System.out.print("*");
                 ++i;
             }
             i=0;//resets i to 0 for next loop
             System.out.print("\nSun:\t  ");
              while (i<sun){
                 System.out.print("*");
                 ++i;
             }
            double averageexpenses=(Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/7.0;
           // System.out.print("\nyour average daily expenses are:$\t");
            System.out.printf("\nYour average daily expenses are: $"+"%.2f\n",averageexpenses);
            int j=0; //establishes counter for while loop
            double x=0,y=0;
            double p=0,z=0;
            int q=0;
            //runs loop to sum up total expenses for 4 years using a andom number generator to calulate percentage change from week to week.
            while(j<207){
                q=(int)(Math.random()*(41)); //randomly generates a number form 0 to 40
                x=averageexpenses*(q/100.0); //sets the generated number to a decimal for percentage
                y=averageexpenses-averageexpenses*.2; //allows percentages to range from 0 to 40 to represent the range of negative 20 to 20 
                z=z+(y+x); //sums together expenses
                ++j; //increses counter by 1 each iteration
                
            }
            p=averageexpenses+z; //adds the first week generated to the other 207 weeks to come up with total expenses for full 4 years
          System.out.printf("Estimated expenditure for 4 years: $"+"%.2f\n",p); //prints out total estimated expenditure
          
            
            
    }
    
            
}
        
         
         