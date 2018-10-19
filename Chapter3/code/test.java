public class test {
  public static void main (String args[]){
    String s = "Hello";
    String t = new String (s);
    if ("Hello".equals(s)) System.out.println("one");
    if (t == s) System.out.println("two");
    if ( t.equals(s)) System.out.println("three");
    if ("Hello" == s) System.out.println("four");
    if ("Hello" == t) System.out.println("five");

    String s1 = "java";
    StringBuilder s2 = new StringBuilder(s1);
    if (s1.equals(s2)){
      System.out.println("2");
    }
    StringBuilder s3 = new StringBuilder("java");
    int[] l1 = {1,3};
    int[] l2 = {1,3};
  }

}
