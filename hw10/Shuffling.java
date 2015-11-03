//Kyle Sammon
//CSE2
//hw10 Shuffling
//11/3/15
//finds the area of a trinagle, rectangle or circle using method


import java.util.Scanner; //imports scanner
public class Shuffling{
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    //suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
        for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        // System.out.print(cards[i]+" ");
        }
    printArray(cards); //inputs cards array to pritn array method
    shuffle(cards); //inputs cards array to shuffle method
    printArray(cards); //prints shuffled cards using print method
    hand = randomizeHand(cards); //sends cards array to hand genreator which returns a hand of 5 cards
    printArray(hand); //prints out hte random hand
  }
  public static void printArray(String[] list){
        // prints out the array that is input into the system. Stops at correct dimension for input array
        for (int i=0; i<list.length; i++){
        System.out.print(list[i]+" ");
        }
    }
    public static void shuffle(String[] b){
        System.out.println("\nShuffled");
        int x=0;
        //shufles the deck by randomly selcting a card and switching it with the card at index 0
        for(int j=0;j<100;j++){
        x=(int)(Math.random()*(52));
        String y=b[x];
        b[x]=b[0];
        b[0]=y;
        }
    }
    public static String[] randomizeHand(String[] c){
        System.out.println("\nHand");
        //creates five random numbers from 0 to 51 with no two being the same
        int x1=(int)(Math.random()*(52));
        int x2=(int)(Math.random()*(52));
        while(x2==x1){
            x2=(int)(Math.random()*(52));
        }
        int x3=(int)(Math.random()*(52));
        while(x3==x1||x3==x2){
            x3=(int)(Math.random()*(52));
        }
        int x4=(int)(Math.random()*(52));
        while(x4==x3||x4==x2||x4==x1){
           x4=(int)(Math.random()*(52));
        }
        int x5=(int)(Math.random()*(52));
        while(x5==x4||x5==x3||x5==x2||x5==x1){
           x5=(int)(Math.random()*(52));
        }
        //creates ne String array to be returned
        String[] f=new String [5];
        //sets the value for each string array to be returned for the random hand
        f[0]=c[x1];
        f[1]=c[x2];
        f[2]=c[x3];
        f[3]=c[x4];
        f[4]=c[x5];
        return f; //returns the random hand
        
    }
}
