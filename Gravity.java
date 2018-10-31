public class Gravity {
      public double falling(double time, double velo){
    	  final double g = 9.8;
    	  double d = velo * time + 0.5 * g * Math.pow(time, 2);
    	  return d;
      }
  }