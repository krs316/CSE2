//Kyle Sammon
//CSE2
//hw12 Transpose
//11/17/15
//creates a matrix yusing user input values. Prints out the matrix. Computes the transpose of the matrix. Prints out the transpose of the matrix.
import java.util.Scanner; //imports scanner
import java.util.Random; //imports java random tool
public class Transpose{
    public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in ); //declares an instance of scanner and calss the scanner constructor
        //prompt user to input the string
    System.out.print("Enter the width of the matrix:"); //prompts user to input the wifth of the matrix
       //checks to see if input is an integer and greater than 0
       while(!myScanner.hasNextInt()){
            System.out.print("Invalid input. Please enter an integer: ");
            myScanner.next();
        }
    int a=myScanner.nextInt();
        while(a<0){
            System.out.print("Please input an integer greater than 0:");
            a=myScanner.nextInt();
        }
    System.out.print("Enter the height of the matrix:"); //prompts user for heigh of matrix
       while(!myScanner.hasNextInt()){
            System.out.print("Invalid input. Please enter an integer: ");
            myScanner.next();
        }
    int b=myScanner.nextInt();
        while(a<0){
            System.out.print("Please input an integer greater than 0:");
            b=myScanner.nextInt();
        }
      //int a=3;
      //int b=4;
      int matrix[][]=randomMatrix(a,b); //sends input integers to randomMatrix method and return matrix
      //System.out.print(matrix[1].length);
      printMatrix(matrix);
      System.out.println("Transposed Matrix");
      int[][] TMatrix=transposeMatrix(matrix);
      printMatrix(TMatrix);
  }
  public static int[][] randomMatrix(int a, int b){
      Random rand= new Random();
      //declares 2d matrix and allocates space
      int [][] matrix=new int[a][b];
      //assigns values to th correct matix spots
      for(int i=0;i<a;i++){
          for(int j=0;j<b;j++){
              int x=rand.nextInt(10)-rand.nextInt(10);
              matrix[i][j]=x;
          }
      }
      return matrix; //returns a 2d array for the matrix
  }
   public static void printMatrix(int[][] a){
       int x=0;
       //checks to make sure the matrix is square
       for(int t=0;t<a.length;t++){
           if (a[0].length!=a[t].length){
               System.out.print("Warning!The matrix is not rectangular");
               x=1;
           }
       }
       //prints out the matrix in an appropriate format
       if(x==0){
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(" "+a[j][i]);
               // System.out.print("  ");
            }
            System.out.println(" ");
        }
       }
   }
   public static int[][] transposeMatrix(int[][] a){
       int transpose[][]=new int[a[0].length][a.length]; //declasres a new array and allocate sthe size of it
            for(int i=0;i<a[0].length;i++){
                for(int j=0;j<a.length;j++){
                    //sets the vales of the new array equal to the transpose of the original matrix
                transpose[i][j]=a[j][i];
                }
            }
        return transpose; //returns the transposed matrix
   }
   
}