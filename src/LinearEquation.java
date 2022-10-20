public class LinearEquation {
    //Instance Variable
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private String slopeInFraction;
    private double regularSlope;
    public LinearEquation(int x1, int x2, int y1, int y2){
   double slope = ((double)y2-y1)/(x2-x1);
   this.regularSlope=slope;
        double yIntercept= y1 - slope*x1;
   slope = Math.round(slope*100)/100.0;
       yIntercept = Math.round(yIntercept*100)/100.0;
       System.out.println("y = " + (int)(slope*100) + "/" +"100" + "x" + " + "+ yIntercept);
       this.x1 = x1;
       this.x2 = x2;
       this.y1 = y1;
       this.y2 = y2;
   }



 public String slopeCalc(){
        this.regularSlope= Math.round(regularSlope*100)/100.0;
     slopeInFraction = (regularSlope*100 + "/" +"100");
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
        double yValue = (regularSlope*x) + yIntercept();
        String coordinate = "("+x+","+yValue+")";
        return coordinate;
}

}
