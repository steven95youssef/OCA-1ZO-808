public class BreakStatement{
  public static void main (String args[]){
    int dayOfWeek=5;
    switch(dayOfWeek){
      case 0:
        System.out.println("Monday");
        break;
      case 1:
        System.out.println("Tuesday");
        break;
      default:
        System.out.println("Weekday");
        break;
    }
  }
}
