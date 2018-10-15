public class Chick {
  private String name = "fluffy";
  {System.out.println("Setting fields");}
  public Chick (){
    name = "tiny";
    System.out.println("In constructor");
  }
  public static void main (String args[]){
    Chick chick = new Chick();
    System.out.println(chick.name);
  }
}
