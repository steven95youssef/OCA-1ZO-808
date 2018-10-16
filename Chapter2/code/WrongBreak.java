public class WrongBreak
{
  public static void main (String args[]){
    int dayOfWeek = 5;
    switch(dayOfWeek){
      case 0:
      System.out.println("Sunday");
      default:
        System.out.println("Weekday");
      case 6:
        System.out.println("Saturday");
      case 7:
        System.out.println("Friday");
        break;
    }
  }
}
