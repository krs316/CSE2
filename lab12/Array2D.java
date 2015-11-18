//Kyle Sammon
//CSE2
//lab12
//11/13/15
//2D array manipulation


import java.util.Scanner; //imports scanner
import java.util.Random; //imports java random tool
public class Array2D{
    public static void main(String[] args) {
        int [][] Array=raggedArray();
        printArray(Array);
    }
        
    
    public static int[] raggedArray(){
        Random rand= new Random();
        int x=rand.nextInt(10)+10;
        int [][] ragged= new int[x][];
        for(int i=0;i<x;i++){
        ragged= new int[i][rand.nextInt(10)+10];
        }
        for(int j=0;j<x;j++){
            for(int q=0;q<ragged[j].length;q++){
            ragged[j][q]=(rand.nextInt(1000)-rand.nextInt(1000));
            }   
        }
        return ragged;
        
    }
    public static void printArray(int[][] a){
        for(int i=0;i<20;i++){
            for(int j=0;j<a.length;j++)
            if(i<a[j].length){
                System.out.print(a[j][i]);
            }
            else{
                System.out.print("   ");
            }
        }
        
    }
    public static void printArray(int[] b){
        for (int i=0; i<b.length; i++){
        System.out.print(b[i]+" ");
        }
    }
}
    