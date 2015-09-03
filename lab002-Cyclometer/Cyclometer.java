//Charles Inwald Cyclometer Lab 9/3/2015 CSE002
//Measure speed/distance/elapsed time
//Ill start with editing the class Cyclometer
public class Cyclometer{
    //then throw in a main method
    public static void main(String[] args)  {
        //input data
        int secsTrip1=560; //Elapsed Time Trip 1 (s)
        int secsTrip2=793; //Elapsed Time Trip 2 (s)
        int countsTrip1=1497; //Rotations Trip 1
        int countsTrip2=2456; //Rotations Trip 2
        
        double wheelDiameter=30.0, //Diameter of wheel for calculating distance
        PI=3.14159, //Pi for calculating distance
        feetPerMile=5280, //unit conversion for calculating distance
        inchesPerFoot=12, //unit conversion for calculating distance
        secondsPerMinute=60; //unit conversion for calculating speed
        double distanceTrip1, distanceTrip2, totalDistance; //establishes variables for distances
        
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had "+countsTrip1+" counts.");  //Output
        System.out.println("Trip 1 took " + (secsTrip2/secondsPerMinute) + " minutes and had "+countsTrip2+" counts.");  //Output
        
        distanceTrip1=(countsTrip1*wheelDiameter*PI) / (inchesPerFoot*feetPerMile); //distance per rotation in inches using C=Pi*Diameter
        distanceTrip2=(countsTrip2*wheelDiameter*PI) / (inchesPerFoot*feetPerMile); //^ for trip 2
        totalDistance=distanceTrip1+distanceTrip2;
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }  
}