public class LinearEquation {
    //Instance Variable
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private String slopeInFraction;
    private double regularSlope;

    private String linearEquation;
    public LinearEquation(int x1, int x2, int y1, int y2){
   double slope = ((double)y2-y1)/(x2-x1);
   this.regularSlope=slope;
        double yIntercept= y1 - slope*x1;
   this.regularSlope = Math.round(slope*100)/100.0;
        if ((regularSlope *100)%50==0){
            slopeInFraction = ((regularSlope*100)/50 + "/" +"2");
        }
        else if((regularSlope *100)%25==0){
            slopeInFraction = ((regularSlope*100)/25 + "/" +"4");
        }
        else if((regularSlope *100)%20==0){
            slopeInFraction = ((regularSlope*100)/20 + "/" +"5");
        }
        else if ((regularSlope *100)%10==0){
            slopeInFraction = ((regularSlope*100)/10 + "/" +"10");
        }
        else if ((regularSlope *100)%5==0){
            slopeInFraction = ((regularSlope*100)/5 + "/" +"20");
        }
        else if ((regularSlope *100)%4==0){
            slopeInFraction = ((regularSlope*100)/4 + "/" +"25");
        }
        else if  ((regularSlope *100)%2==0) {
            slopeInFraction = ((regularSlope*100)/2 + "/" +"50");
        }
       yIntercept = Math.round(yIntercept*100)/100.0;
       this.x1 = x1;
       this.x2 = x2;
       this.y1 = y1;
       this.y2 = y2;
        linearEquation="y = " + slopeInFraction + "x" + " + "+ yIntercept;
   }



 public String slopeCalc(){
        this.regularSlope= Math.round(regularSlope*100)/100.0;

     if ((regularSlope *100)%50==0){
         slopeInFraction = ((regularSlope*100)/50 + "/" +"2");
     }
     else if((regularSlope *100)%25==0){
         slopeInFraction = ((regularSlope*100)/25 + "/" +"4");
     }
     else if((regularSlope *100)%20==0){
         slopeInFraction = ((regularSlope*100)/20 + "/" +"5");
     }
     else if ((regularSlope *100)%10==0){
         slopeInFraction = ((regularSlope*100)/10 + "/" +"10");
     }
     else if ((regularSlope *100)%5==0){
         slopeInFraction = ((regularSlope*100)/5 + "/" +"20");
     }
     else if ((regularSlope *100)%4==0){
         slopeInFraction = ((regularSlope*100)/4 + "/" +"25");
     }
     else if  ((regularSlope *100)%2==0) {
         slopeInFraction = ((regularSlope*100)/2 + "/" +"50");
     }

            String slopeFractionn = slopeInFraction;
        return slopeFractionn;


 }

 public double distance(){
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
         distance = Math.round(distance*100)/100.0;
        return distance;
 }
public double yIntercept() {
        double slope = ((double)y2-y1)/(x2-x1);
    double yIntercept= y1 - slope*x1;
    yIntercept = Math.round(yIntercept*100)/100.0;
    return yIntercept;
}
public String usersNewCoordinate(double x){
        double yValue = ((double)regularSlope*x) + yIntercept();
    double yValueRounded = Math.round(yValue*100.0)/100.0;
        String coordinate = "("+x+","+yValueRounded+")";
        return coordinate;
}
public String toString() {
            System.out.println(linearEquation);

            System.out.println("");
            System.out.print("Here is the Y intercept: ");
            System.out.println(yIntercept());

            System.out.println("");
            System.out.print("Here is the slope: ");
            System.out.println(slopeCalc());

            System.out.println("");
            System.out.print("Here is the distance: ");
            System.out.println(distance());
            System.out.println("");

            return "";

}

}
