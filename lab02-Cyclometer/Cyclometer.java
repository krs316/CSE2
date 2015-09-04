//Kyle Sammon
//CSE2
//lab02
//9/4/15
//This program takes input for total time ridden and and number
//of wheel spins to calculate distance
public class Cyclometer{
    //add main method
    public static void main(String[] args){
    //input data
    int secsTrip1=480;  // assigns first variable of integer type for time of trip 1
    int secsTrip2=3220; // assigns variable of integer type for time of trip 2
    int countsTrip1=1561; //assigns variable of integer type for wheel spins on first trip
    int countsTrip2=9037; //assigns variable of integer type for wheel spins on second trip
    //intermediate variables and output variables
    
    double wheelDiameter=27.0; //diameter of wheel in inches to convert wheel spins to distance
    double Pi=3.14159; // used to find circumfrance of wheel to convert spins to distance
    int feetperMile=5280; //used to covert distance in feet to distance in miles
    int inchesPerFoot=12; //used to convert wheel diameter feet for calculations
    int secondsPerMinute=60; //used to convert from trip in seconds to trip time in minutes
    double distanceTrip1, distanceTrip2, totalDistance; // declares these variables as doubles
    //print out variables stored
    System.out.println("Trip 1 took " +(secsTrip1/secondsPerMinute)+
        " minutes and had " + countsTrip1+" counts.");
    System.out.println("Trip 2 took " +(secsTrip2/secondsPerMinute)+
        " minutes and had " + countsTrip2+" counts.");
    //run calculations and store values
    distanceTrip1=countsTrip1*wheelDiameter*Pi; //computes distance in inches
    distanceTrip1/=inchesPerFoot*feetperMile; //computes distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*Pi/inchesPerFoot/feetperMile; // computes distance 2 in miles
    totalDistance=distanceTrip1+distanceTrip2; //computes total distance teraveled over both days
    //Print output data
    System.out.println("Trip 1 was "+distanceTrip1+" miles"); //prints trip 1 distance
    System.out.println("Trip 2 was "+distanceTrip2+" miles"); //prints trip 2 distance
    System.out.println("The total distance was "+totalDistance+" miles"); //prints total distance
    
    
        
    
    } //end main method
}//end class