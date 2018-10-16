public class examples {
  public static void main (String args[]){
    int y = 4;
    double x = 3 + 2 * --y;
    System.out.println("y is " + y + " and x is "  + x);
    //Numeric promotion rules
    int c = 1;
    long d = 33;
    System.out.println(c+d);
    double a = 39.21D;
    float b = 2.1F;
    System.out.println(a+b);
  }
}
