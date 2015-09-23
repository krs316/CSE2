//Kyle Sammon
//9/20/15
//CSE2
//hw04
//Poker Hand Check program

public class PokerHandCheck{
    //add main domain
        public static void main(String[]args){
        //randomly generates five numbers between 1 and 52
        int cardnumber1=(int)(Math.random()*52)+1;
        int cardnumber2=(int)(Math.random()*52)+1;
        int cardnumber3=(int)(Math.random()*52)+1;
        int cardnumber4=(int)(Math.random()*52)+1;
        int cardnumber5=(int)(Math.random()*52)+1;
      
    
       //declares string variable for each card to store suit name
        String suit="";
        String suit2="";
        String suit3="";
        String suit4="";
        String suit5="";
        //determines the suit of cardnumber1
        if (cardnumber1<=13){
             suit= "Diamonds";
        }
        if (cardnumber1>13 && cardnumber1<=26){
            suit= "Clubs";
        }
        if (cardnumber1>26 && cardnumber1<=39){
            suit= "Hearts";
        }
        if (cardnumber1>39 && cardnumber1<=52){
            suit="Spades";
        }
        int cardnumber6= cardnumber1-1; //makes it so card values range form 0 to 12 instead of 1 to 13
       
        
        //uses swuitch to determine the card name drawn
        
        switch(cardnumber6 % 13){
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
        //determines the suit of cardnumber2    
        if (cardnumber2<=13){
             suit2= "Diamonds";
        }
        if (cardnumber2>13 && cardnumber2<=26){
            suit2= "Clubs";
        }
        if (cardnumber2>26 && cardnumber2<=39){
            suit2= "Hearts";
        }
        if (cardnumber2>39 && cardnumber2<=52){
            suit2="Spades";
        }
        int cardnumber7= cardnumber2-1; //normalizes so cards range from 0 to 12
        
        //uses switch stamenet and modulo to determine card name for cardnumber2
        switch(cardnumber7 % 13){
            case 0:
                System.out.println("You picked the Ace of "+suit2);
                break;
            case 1:
                System.out.println("You picked the 2 of "+suit2);
                break;
            case 2:
                System.out.println("You picked the 3 of "+suit2);
                break;
            case 3:
                System.out.println("You picked the 4 of "+suit2);
                break;
            case 4:
                System.out.println("You picked the 5 of "+suit2);
                break;
            case 5:
                System.out.println("You picked the 6 of "+suit2);
                break;
            case 6:
                System.out.println("You picked the 7 of "+suit2);
                break; 
            case 7:
                System.out.println("You picked the 8 of "+suit2);
                break; 
            case 8:
                System.out.println("You picked the 9 of "+suit2);
                break;
            case 9:
                System.out.println("You picked the 10 of "+suit2);
                break;
            case 10:
                System.out.println("You picked the Jack of "+suit2);
                break;
            case 11:
                System.out.println("You picked the Queen of "+suit2);
                break;
            case 12:
                System.out.println("You picked the King of "+suit2);
             }
             
             
        //determines the suit of cardnumber3    
        if (cardnumber3<=13){
             suit3= "Diamonds";
        }
        if (cardnumber3>13 && cardnumber3<=26){
            suit3= "Clubs";
        }
        if (cardnumber3>26 && cardnumber3<=39){
            suit3= "Hearts";
        }
        if (cardnumber3>39 && cardnumber3<=52){
            suit3="Spades";
        }
        int cardnumber8= cardnumber3-1; //normalizes numbers so values range from 0 to 12
        
        //uses switch statement to determine card name
        switch(cardnumber8 % 13){
            case 0:
                System.out.println("You picked the Ace of "+suit3);
                break;
            case 1:
                System.out.println("You picked the 2 of "+suit3);
                break;
            case 2:
                System.out.println("You picked the 3 of "+suit3);
                break;
            case 3:
                System.out.println("You picked the 4 of "+suit3);
                break;
            case 4:
                System.out.println("You picked the 5 of "+suit3);
                break;
            case 5:
                System.out.println("You picked the 6 of "+suit3);
                break;
            case 6:
                System.out.println("You picked the 7 of "+suit3);
                break; 
            case 7:
                System.out.println("You picked the 8 of "+suit3);
                break; 
            case 8:
                System.out.println("You picked the 9 of "+suit3);
                break;
            case 9:
                System.out.println("You picked the 10 of "+suit3);
                break;
            case 10:
                System.out.println("You picked the Jack of "+suit3);
                break;
            case 11:
                System.out.println("You picked the Queen of "+suit3);
                break;
            case 12:
                System.out.println("You picked the King of "+suit3);
             }
             
             
             
        //determines the suit of cardnumber4    
        if (cardnumber4<=13){
             suit4= "Diamonds";
        }
        if (cardnumber4>13 && cardnumber4<=26){
            suit4= "Clubs";
        }
        if (cardnumber4>26 && cardnumber4<=39){
            suit4= "Hearts";
        }
        if (cardnumber4>39 && cardnumber4<=52){
            suit4="Spades";
        }
        int cardnumber9= cardnumber4-1; //normalizes cars so they range from 0 to 12
        
        //uses switch statement to determine the name of the card for carnumber3
        switch(cardnumber9 % 13){
            case 0:
                System.out.println("You picked the Ace of "+suit4);
                break;
            case 1:
                System.out.println("You picked the 2 of "+suit4);
                break;
            case 2:
                System.out.println("You picked the 3 of "+suit4);
                break;
            case 3:
                System.out.println("You picked the 4 of "+suit4);
                break;
            case 4:
                System.out.println("You picked the 5 of "+suit4);
                break;
            case 5:
                System.out.println("You picked the 6 of "+suit4);
                break;
            case 6:
                System.out.println("You picked the 7 of "+suit4);
                break; 
            case 7:
                System.out.println("You picked the 8 of "+suit4);
                break; 
            case 8:
                System.out.println("You picked the 9 of "+suit4);
                break;
            case 9:
                System.out.println("You picked the 10 of "+suit4);
                break;
            case 10:
                System.out.println("You picked the Jack of "+suit4);
                break;
            case 11:
                System.out.println("You picked the Queen of "+suit4);
                break;
            case 12:
                System.out.println("You picked the King of "+suit4);
             }
             
             
        //determines the suit of cardnumber5     
        if (cardnumber5<=13){
             suit5= "Diamonds";
        }
        if (cardnumber5>13 && cardnumber5<=26){
            suit5= "Clubs";
        }
        if (cardnumber5>26 && cardnumber5<=39){
            suit5= "Hearts";
        }
        if (cardnumber5>39 && cardnumber5<=52){
            suit5="Spades";
        }
        int cardnumber10= cardnumber5-1;//normalizes card numbers so they range from 0 to 12
        
        //uses switch to determine the name of cardnumber4
        switch(cardnumber10 % 13){
            case 0:
                System.out.println("You picked the Ace of "+suit5);
                break;
            case 1:
                System.out.println("You picked the 2 of "+suit5);
                break;
            case 2:
                System.out.println("You picked the 3 of "+suit5);
                break;
            case 3:
                System.out.println("You picked the 4 of "+suit5);
                break;
            case 4:
                System.out.println("You picked the 5 of "+suit5);
                break;
            case 5:
                System.out.println("You picked the 6 of "+suit5);
                break;
            case 6:
                System.out.println("You picked the 7 of "+suit5);
                break; 
            case 7:
                System.out.println("You picked the 8 of "+suit5);
                break; 
            case 8:
                System.out.println("You picked the 9 of "+suit5);
                break;
            case 9:
                System.out.println("You picked the 10 of "+suit5);
                break;
            case 10:
                System.out.println("You picked the Jack of "+suit5);
                break;
            case 11:
                System.out.println("You picked the Queen of "+suit5);
                break;
            case 12:
                System.out.println("You picked the King of "+suit5);
             }
    
    //finds the modulo of adjusted numbers and stores them in values to compare if cards match.
    int c1=cardnumber6%13;
    int c2=cardnumber7%13;
    int c3=cardnumber8%13;
    int c4=cardnumber9%13;
    int c5=cardnumber10%13;
   
   //sets booleans for the cases of five, four,three, and two of a kind as well as two pair and no pairs
    boolean five;            
    boolean four;
    boolean three;
    boolean two;
    boolean twopair;
    boolean none;
    five=((c1==c2)&&(c2==c3)&&(c3==c4)&&(c4==c5)); //determines if 5 of a kind
    //determines if 4 of a kind
    four=(((c1==c2)&&(c2==c3)&&(c3==c4))||((c1==c2)&&(c2==c3)&&(c3==c5))||((c1==c2)&&(c2==c4)&&(c4==c5))||((c1==c3)&&(c3==c4)&&(c4==c5))||((c2==c3)&&(c3==c4)&&(c4==c5)));
    //determines if 3 of a kind
    three= (((c1==c2)&&(c2==c3))||((c1==c2)&&(c2==c4))||((c1==c2)&&(c2==c5))||((c1==c3)&&(c3==c4))||((c1==c3)&&(c3==c5))||((c1==c4)&&(c4==c5))||((c2==c3)&&(c3==c4))||((c2==c3)&&(c3==c5))||((c2==c4)&&(c4==c5))||((c3==c4)&&(c4==c5)));
    //determines if 2 of a kind
    two=((c1==c2)||(c1==c3)||(c1==c4)||(c1==c5)||(c2==c3)||(c2==c4)||(c2==c5)||(c3==c4)||(c3==c5)||(c4==c5));
    //determines if twopair
    twopair=(((c1==c2)&&((c3==c4)||(c4==c5)||(c3==c5)))||((c2==c3)&&((c4==c5)||(c1==c5)||(c1==c4)))||((c3==c4)&&((c1==c5)||(c2==c5)))||((c4==c5)&&(c1==c3))||((c2==c4)&&((c1==c5)||(c3==c5)||(c1==c3)))||((c1==c4)&&((c2==c5)||(c3==c5)))||((c2==c5)&&((c1==c3)||(c1==c4))));
    
  
    //sets response to high card if there is a five of a kind, four of a kind, or no matches. This is because not specifdied what to do for five and four of a kind in the hw assignment.
    if (five==true||four==true||(five==false && four==false && three==false && two==false && twopair==false)){
        System.out.println("You have a high card hand!");//prints response
    }
    //sets response to if boolean three is true and previous posiiblities arent true
    else if(three==true){
        System.out.println("You have a three of a kind!"); //preints response
    }
    //sets response to twopair if twopair true and four of a kind is false
    else if(twopair==true && four==false){
        System.out.println("You have a two pair!");//prints response
    }
    //sets response to pair if above staements are not satisfied
    else if (two==true){
        System.out.println("You have a pair");//prints response
    }
    
    
  }

            
}