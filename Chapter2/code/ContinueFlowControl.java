public class ContinueFlowControl{
  public static void main (String args[]){
    System.out.println("using continue statement to break from inner loop and go to outer loop");
    FIRST_CHAR_LOOP: for (int a =1; a<=4; a++){
      for (char x = 'a';x<='c';x++){
        if (a==2|| x=='b'){
          continue FIRST_CHAR_LOOP;
        }
        System.out.print(" " + a + x);
      }
    }
    System.out.println();
  }
}
