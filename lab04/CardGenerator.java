//Kyle Sammon
//9/18/15
//CSE2
//Random Card Generator Program

public class CardGenerator{
    //add main domain
        public static void main(String[]args){
        int baseNum=1;
        int upperBound=52;
        int cardnumber=(int)(Math.random()*(upperBound+1))+baseNum;
        //int cardnumber=1;
        String suit="";
        if (cardnumber<=13){
             suit= "Diamonds";
        }
        if (cardnumber>13 && cardnumber<=26){
            suit= "Clubs";
        }
        if (cardnumber>26 && cardnumber<=39){
            suit= "Hearts";
        }
        if (cardnumber>39 && cardnumber<=52){
            suit="Spades";
        }
        int cardnumber2= cardnumber-1;
        System.out.println(suit+  cardnumber);
        switch(cardnumber2 % 13){
            case 0:
                System.out.println("You picked the Ace of "+suit);
                break;
            case 1:
                System.out.println("You picked the 2 of "+suit);
                break;
            case 2:
                System.out.println("You picked the 3 of "+suit);
                break;
            case 3:
                System.out.println("You picked the 4 of "+suit);
                break;
            case 4:
                System.out.println("You picked the 5 of "+suit);
                break;
            case 5:
                System.out.println("You picked the 6 of "+suit);
                break;
            case 6:
                System.out.println("You picked the 7 of "+suit);
                break; 
            case 7:
                System.out.println("You picked the 8 of "+suit);
                break; 
            case 8:
                System.out.println("You picked the 9 of "+suit);
                break;
            case 9:
                System.out.println("You picked the 10 of "+suit);
                break;
            case 10:
                System.out.println("You picked the Jack of "+suit);
                break;
            case 11:
                System.out.println("You picked the Queen of "+suit);
                break;
            case 12:
                System.out.println("You picked the King of "+suit);
             }
        }      
    
}