//Kyle Sammon
//CSE2
//lab08 Stats
//10/16/15
////finds mean and median of fiver numbers entered by the user
import java.util.Scanner; //allows scanner to be used somewher in the program
public class Stats{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //prompt user to input the current time
        System.out.print("Enter five doubles from smallest to largest");
        double x1=myScanner.nextDouble();
        double x2=myScanner.nextDouble();
        while(x2<x1){
            System.out.print("Error x2 is smaller than x1. Input new x2");
             x2=myScanner.nextDouble();
            
        double x3=myScanner.nextDouble();
        while(x3<x2){
            System.out.print("Error x3 is smaller than x2. Input new x3");
             x3=myScanner.nextDouble();
            
        }
        double x4=myScanner.nextDouble();
         while(x4<x3){
            System.out.print("Error x4 is smaller than x3. Input new x4");
             x4=myScanner.nextDouble();
        }
        double x5=myScanner.nextDouble();
        
        while(x2<x1){
            System.out.print("Error x5 is smaller than x4. Input new x5");
             x5=myScanner.nextDouble();
        }
        double mean=getMean(x1,x2,x3,x4,x5);
        
        double median=getMedian(x1,x2,x3,x4,x5);
        
        print(mean,median);
    }
    }
    public static double getMean(double a, double b, double c, double d, double e){
        double avg=(a+b+c+d+e)/5;
        return avg;
    }
    public static double getMedian(double v, double w, double x,double y, double z ){
        double middle=x;
        return x;
    }
    public static void print( double t, double u){
     System.out.print("mean="+t);
     System.out.print(" median="+u);
    }
}
