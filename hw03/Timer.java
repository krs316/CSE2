//Kyle Sammon
//CSE2
//hw03 Timer
//9/11/15
//This program takes the input of the time of a reservaion, the current time and says how long until the reservation is. 
import java.util.Scanner; //allows scanner to be used somewher in the program
public class Timer{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //prompt user to input the current time
        System.out.print("Enter the current time:");
        //accept user input as an integer
        int currentTime= myScanner.nextInt();
        //prompt user to input time of reservation
        System.out.print("Enter the time that you will be eating dinner:");
        //accept user input for reservation time as an integer
        int reservationTime= myScanner.nextInt();
        int hours, hours1, hours2, minutes,currentTimem,reservationTimem,timeDifferencem;
        double x;
        //declare valuse for hours and minutes as integers
        hours1=(int)((currentTime)/100); //finds hour of currenttime
        hours2=(int)((reservationTime)/100);//finds hour of reservation
        
        currentTimem=(hours1*60)+(currentTime-hours1*100);//finds current time in total minutes
        reservationTimem=(hours2*60)+(reservationTime-hours2*100);//finds reservation time in total minutes
        timeDifferencem=reservationTimem-currentTimem;//calculates difference in time in minutes
        hours=(int)timeDifferencem/60;//calculates the hours left until the reservation
        x=(((timeDifferencem/60.0)-(hours))*60.0)+.3; //calculates the minutes as a double until the reservation, .3 is to ensure rounding of division does not cause error
        minutes=(int)x; //casts the minutes to an integer for printing
        System.out.println("You have "+hours+" hours and "+minutes+ " minutes until dinner"); //print out time left until dinner reservation
     
        }
}