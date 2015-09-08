//Kyle Sammon
//CSE2
//hw02
//9/6/15
//This program calcu;lates total cost including sales tax for a purchase.
public class Arithmetic{
    //add main domain
        public static void main(String[]args){
        
        //declaring input variables
        int nSocks=3; //declares the pairs of socs as an integer
        double sockCost$=2.58; //declares cost of each pair as a double
        
        int nGlasses=6; //declares number of drinkling glasses
        double glassCost$=2.29; //declares cost for glass
        
        int nEnvelopes=1; //number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        
        double taxPercent=.06;
        
        //calculated variables
        double totalSockCost$=nSocks*sockCost$; //total sock cost
        double totalsocktax$= (int)(100*(totalSockCost$*taxPercent))/100.0; //tax for socks
        double totalGlassCost$=nGlasses*glassCost$; //total glass cost
        double totalglasstax$=(int)(100*(totalGlassCost$*taxPercent))/100.0; //tax for glasses
        double totalEnvelopecost$=nEnvelopes*envelopeCost$; //total cost of envelopes
        double totalenvelopetax$=(int)(100*(totalEnvelopecost$*taxPercent))/100.0; //tax for envelopes
        double totalCostpretax$=totalSockCost$+totalEnvelopecost$+totalGlassCost$; //computes total of purchases before tax
        double totaltax$=(int)(100*(totalCostpretax$*taxPercent))/100.0; //computees total tax
        double totalCostwithtax$=totalCostpretax$+totaltax$; //computes total with tax
        
        //print out resluts
        System.out.println("pairs of socks"); //item
        System.out.println("Quantity "+ nSocks); // number of pairs of socks bought
        System.out.println("Cost "+sockCost$); // cost per pair of socks
        System.out.println("Glasses"); //item
        System.out.println("Quantity "+nGlasses); // number of glasses bought
        System.out.println("Cost "+glassCost$); // cost per pair glass
        System.out.println("Envelope Box"); //item
        System.out.println("Quantity "+nEnvelopes); // boxes of envelopes bought
        System.out.println("Cost "+envelopeCost$); // cost per box of envelopes
        System.out.println("The cost of socks is $"+totalSockCost$+" and the sales tax is $"+totalsocktax$); //print sock cost and sales tax
        System.out.println("The cost of glasses is $"+totalGlassCost$+" and the sales tax is $"+totalglasstax$); //print glasses cost and sales tax
        System.out.println("The cost of envelopes is $"+totalEnvelopecost$+" and the sales tax is $"+totalenvelopetax$);//print envelope cost and sales tax
        System.out.println("The total cost before tax is $"+totalCostpretax$); //print total cost before tax
        System.out.println("The total tax is $"+totaltax$); //print total tax
        System.out.println("The total with tax is $"+totalCostwithtax$); //print total cost with tax
        
        
        }
}