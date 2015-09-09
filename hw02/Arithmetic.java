//Charles Inwald
//hw0
//Arithmetic

// 
public class Arithmetic{
    
//  main method
  public static void main(String[] args) {
      
    //# of pairs of socks
    int nSocks=3;
    //$ per pair of socks
    double sockCost$=2.58;
    //# of drinking glasses
    int nGlasses=6;
    //$ per glass
    double glassCost$=2.29;
    //# of boxes of envelopes
    int nEnvelopes=1;
    //$ per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=6;
    
    double totalSockCost$=(sockCost$*nSocks);
    double totalGlassCost$=(glassCost$*nGlasses);
    double totalEnvelopeCost$=(envelopeCost$*nEnvelopes);
    double totalCost$=(totalSockCost$+totalEnvelopeCost$+totalGlassCost$);
    double totalPaid$= (int) (totalCost$*1.06 * 100);
    totalPaid$ = ((double) totalPaid$) /100; 
    double taxSocks= (int) (taxPercent*sockCost$);
    taxSocks = ((double) taxSocks) /100;
    double taxEnvelope= (int) (taxPercent*envelopeCost$);
    taxEnvelope = ((double) taxEnvelope) /100;
    double taxGlass= (int) (taxPercent*glassCost$);
    taxGlass = ((double) taxGlass) /100;
    double tax= (int) (taxPercent*totalCost$*100);
    tax = ((double) tax) /100;
    
    
    
    System.out.println("Socks:");
    System.out.println(""+nSocks+" pairs");
    System.out.println("$"+sockCost$+" per pair");
    System.out.println("$"+totalSockCost$+" spent on socks before tax");
    System.out.println("$"+taxSocks+" in tax");
    System.out.println("Envelopes:");
    System.out.println(""+nEnvelopes+" envelopes");
    System.out.println("$"+envelopeCost$+" per envelope");
    System.out.println("$"+totalEnvelopeCost$+" spent on envelopes before tax");
    System.out.println("$"+taxEnvelope+" in tax");
    System.out.println("Glasses:");
    System.out.println(""+nGlasses+" glasses");
    System.out.println("$"+glassCost$+" per glass");
    System.out.println("$"+totalGlassCost$+" spent on glasses before tax");
    System.out.println("$"+taxGlass+" in tax");
    System.out.println("Total Cost $"+totalCost$+"");
    System.out.println("Sales Tax $"+tax+"");
    System.out.println("Total Cost after tax"+" $"+totalPaid$+".");
  }
}