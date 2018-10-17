public class examples {
  public static void main (String args[]){
    System.out.println("Demonstrating indexOf method");
    String  animal = "animals";
    System.out.println(animal.indexOf('m'));
    System.out.println(animal.indexOf('m',4));
    System.out.println("Demonstrating substring method");
    System.out.println(animal.substring(3));
    System.out.println(animal.substring(3,4)); //this does not include character at position 4
    System.out.println(animal.substring(3,7));
    System.out.println("Playing around with the startWith and endsWith methods");
    System.out.println("abc".startsWith("a"));
    System.out.println("abc".startsWith("A"));
    System.out.println("abc".endsWith("c"));
    System.out.println("abc".endsWith("a"));
    System.out.println("Demonstrating the mutable stringBuilder class");
    StringBuilder alpha = new StringBuilder();
    for (char current = 'a'; current <= 'z' ; current++){
      alpha.append(current);
    }






  }
}
