//Kyle Sammon
//CSE2
//lab10
//10/16/15
//creates array for students and and their midterm
import java.util.Scanner; //allows scanner to be used somewher in the program
public class Array{
    //add main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        int size=(int)(Math.random()*(5))+5;
        //System.out.print(size);
        String[] student;
        student=new String[size];
        int [] score=new int[size];
        System.out.print("Please input "+size+" student names");
        for(int i=0;i<size;i++){
            student[i]=myScanner.next();
            int grade=(int)(Math.random()*(101));
            score[i]=grade;
            System.out.println(student[i]+": "+score[i]);
            //System.out.println(score[i]);
        }
    
    }
}