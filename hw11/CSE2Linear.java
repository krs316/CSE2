//Kyle Sammon
//CSE2
//hw11 CSE2Linear
//11/3/15
//finds the area of a trinagle, rectangle or circle using method


import java.util.Scanner; //imports scanner
import java.util.Random; //imports java random tool
public class CSE2Linear{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
      int[] grades =new int[15]; //sets grade array of size 15
     System.out.print("Input 15 integers for students grades in ascending order. ");//prompts user grade input
     for(int i=0;i<15;i++){
         //ensures grade input is an integer
         while(!scan.hasNextInt()){
             System.out.print("Input invalid. please only enter integers:");
             scan.next();
         }
         grades[i]=scan.nextInt();
         //ensures grade is within acctepted values
         while(grades[1]<0||grades[i]>100){
             System.out.print("Input grade is outside of acceptable value. Input intger between 0 and 100: ");
             grades[i]=scan.nextInt();
         }
         //ensures grades are increasing
         while(i!=0&&grades[i]<grades[i-1]){
             System.out.print("The entered grade is less than the previous grade.Input a higher grade");
             grades[i]=scan.nextInt();
         }
         
     }
     printArray(grades); //prints out array of grades
     System.out.print("Enter a grade for Binary search: ");//prompts user to enter grade to search for
     int t=scan.nextInt();//reads user input
     Binary(t,grades); //sends user input and grades array to method for linear search
     shuffle(grades); //sends grades to shuffle method
     printArray(grades); //prints out shuffled array
     System.out.print("Enter a grade for Linear search: ");//prompts user to input new grade to search for
     int r=scan.nextInt();//reads input
     linear(r,grades);//sends input and shuffled array to linear search method
  }
  public static void printArray(int[] list){
        // prints out the array that is input into the system. Stops at correct dimension for input array
        for (int i=0; i<list.length; i++){
        System.out.print(list[i]+" ");
        }
    }
    public static void shuffle(int[] b){
        System.out.println("\nShuffled");
        Random rand= new Random();
        int x=0;
        //shufles the deck by randomly selcting a card and switching it with the card at index 0
        for(int j=0;j<100;j++){
        x=rand.nextInt(15);
        int y=b[x];
        b[x]=b[0];
        b[0]=y;
        }
    }
    public static void linear(int y,int[] g ){
        //linear search method
        for(int i=0;i<g.length;i++){
            if(g[i]==y){
                System.out.print(y+" was found with "+(++i)+" itterations"); //prints out results
                break;
            }
            else if(g[i]!=y&&i==g.length-1){
                System.out.print(y+" was not found with "+(++i)+" itterations");
            }
        }
    }
        
    public static void Binary(int f,int[] q){
        int min  = 0;
        int max  =q.length-1;
        int middle = (min + max)/2;
        int i=0; //used to count itterations
        //binary search method
        while( min <= max ){
            if ( q[middle] < f ){
            max =middle - 1; 
            middle=(min+max)/2;
            i++;
            }
            else if ( q[middle] == f ) {
            System.out.println(f + " was found with "+i+" itterations"); //prints out if found
            break;
            }
            else{
            min = middle + 1;
            middle = (min + max)/2;
            i++;
            }
            
        }   
        if ( min > max ){
            System.out.println(f + " was not found in the list with "+i+" itterations");//if not found by end prints out so
            
        }
        
    }
}
