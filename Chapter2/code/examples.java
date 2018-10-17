public class examples {
  public static void main (String args[]){
    int hh = 2;
    int y = 4;
    while (y<10)
    y++;
    hh++;
    System.out.println(y);
    System.out.println(hh);
    double x = 3 + 2 * --y;
    System.out.println("y is " + y + " and x is "  + x);
    //Numeric promotion rules
    int c = 1;
    long d = 33;
    System.out.println(c+d);
    double a = 39.21D;
    float b = 2.1F;
    System.out.println(a+b);


    int j = 10;
    long h = j * 4 - j++;

    System.out.println("h is " + h);

    System.out.println(1%2);





  }
}
