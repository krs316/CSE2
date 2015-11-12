//Kyle Sammon
//CSE2
//lab11 Search
//11/3/15
//finds the area of a trinagle, rectangle or circle using method


import java.util.Scanner; //imports scanner
public class Search{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int[] array1=new int[5000];
     
     for(int i=0;i<5000;i++){
     int number=(int)(Math.random()*(100001));
     array1[i]=number;
     }
     int max=0;
     int min=0;
     for(int j=0;j<5000;j++){
         if(array1[j]>array1[max]){
             max=j;
         }
         if(array1[j]<array1[min]){
             min=j;
         }
     }
     System.out.println(array1[max]);
     System.out.println(array1[min]);
     int[] array2=new int[5000];
     int number2=(int)(Math.random()*(21));
     array2[0]=number2;
    for(int p=1;p<5000;p++){
        number2=(int)(Math.random()*(21));
        array2[p]=array2[p-1]+number2;
    }
    System.out.println(array2[0]);
    System.out.print(array2[4999]);
    System.out.print("Enter an integer greater or equal to 0");
     int value=scan.nextInt();
     if(value>=0){
         
        int min2  = 0;
        int max2  =4999;
        int middle = (min2 + max2)/2;
 
        while( min2 <= max2 ){
            if ( array2[middle] < value ){
            min2 = middle + 1;    
            System.out.print("hey");
            middle=(min2+max2)/2;
            }
            else if ( array2[middle] == value ) {
            System.out.println(value + "was found");
            break;
            }
            else if(array2[middle]>=value){
            max2 = middle - 1;
            middle=(min2+max2)/2;
            System.out.print("bye");
            }
        }   
        if ( min2 > max2 ){
            System.out.println(value + " was not found in the list");
        }
     }
    
  }
}
  