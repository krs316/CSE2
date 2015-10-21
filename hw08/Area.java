//Kyle Sammon
//CSE2
//hw08 Area
//10/16/15
//finds the area of a trinagle, rectangle or circle
import java.util.Scanner; //allows scanner to be used somewher in the program
public class Area{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //asks for user input of shape to be analyzed
        System.out.print("Enter the shape for which the area will be calculated ");
        String shape=myScanner.next(); //reads the user shape input
        //checks to make sure that the response was one of the acceptable shapes
        while("triangle".equals(shape)==false&&"rectangle".equals(shape)==false&&"circle".equals(shape)==false){
        System.out.print("The entered value is not an acceptable shape. The acceptable shapes are triangle, rectangle, or circle. Pleas input a new value.");
        shape=myScanner.next();
        }
      // double height,base,length,width,radius, area;
       
       

        double t=inputmethod(shape); //calls input method to ask user for input
        System.out.print("The area of the shape is: "+t); //prints out are return
      
    }
   
    public static double inputmethod(String shape){ //accepts an input of shape
        Scanner myScanner = new Scanner( System.in ); //inports scanner to this method
         double height,base,width,length,radius;  //declares these values as doubles
         //asks users for appropriate values for a triangle
        if ("triangle".equals(shape)){
            System.out.print("Enter the height of the triangle  ");
            while(!myScanner.hasNextDouble()){
             System.out.print("please enter the height as a valid double");
             myScanner.next();
            }
            height=myScanner.nextDouble();
            System.out.print("Enter the base of the triangle  ");
            while(!myScanner.hasNextDouble()){
             System.out.print("please enter the base as a valid double");
             myScanner.next();
            }
            base=myScanner.nextDouble();
            
            double area = triangle(height,base); //sends the inputs to the triangle method
            
            return area; //returns the area calculated in the traingle method
        }
        // asks user for appropriate inputs for rectangle
        else if ("rectangle".equals(shape)){
            System.out.print("Enter the length of the rectangle  ");
            while(!myScanner.hasNextDouble()){
             System.out.print("please enter the length as a valid double");
             myScanner.next();
            }
            length=myScanner.nextDouble();
            System.out.print("Enter the width of the rectangle  ");
            while(!myScanner.hasNextDouble()){
             System.out.print("please enter the width as a valid double");
             myScanner.next();
            }
            width=myScanner.nextDouble();
            double area = rectangle(length,width); //sends teh input values to rectangel method 
            
            return area; //returns area calulated in rectangle method
        
        }
        //akss user to input correct value for circle
        else {
            System.out.print("Enter the radius of the circle  ");
            while(!myScanner.hasNextDouble()){
             System.out.print("please enter the radius as a valid double");
             myScanner.next();
            }
            radius=myScanner.nextDouble();
            double area =circle(radius); //sends the radiu to the circle method to calulate ares
            
            return area; //returns area calculated 
        }
    }
    //method that calculataes are for triangle
    public static double triangle(double d, double e){
        double area=d*e*.5;
        return area; //returns area to input method
    }
    //method that calculates area for rectangle
    public static double rectangle(double l, double o){
        double area=l*o;
        return area; //returns area to input method
    }
    //method that calcyulates are for circle
    public static double circle(double t){
        double area=t*t*3.14159;
        return area; //returns area to input method
    }
}