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
     System.out.print("Enter a grade to search for: ");//prompts user to enter grade to search for
     int t=scan.nextInt();//reads user input
     int s=linear(t,grades); //sends user input and grades array to method for linear search
     //prints out result fromm search
     if(s!=0){
         System.out.print(t+" was found with "+s+" iterations");
     }
     else{
         System.out.print(t+" was not found with"+grades.length+" iterations");
     }
     shuffle(grades); //sends grades to shuffle method
     printArray(grades); //prints out shuffled array
     System.out.print("Enter a grade to search for: ");//prompts user to input new grade to search for
     int r=scan.nextInt();//reads input
     int u=linear(r,grades);//sends input and shuffled array to linear search method
     //prints out result
     if(u!=0){
         System.out.println(r+" was found with "+u+"iterations");
     }
     else{
         System.out.println(r+" was not found with "+grades.length+"iterations");
     }
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
    public static int linear(int y,int[] g ){
        for(int i=0;i<g.length;i++){
            if(g[i]==y){
                return i+1;
            }
            }
            return 0;
            }
        }
