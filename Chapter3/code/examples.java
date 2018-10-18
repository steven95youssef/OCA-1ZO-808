import java.util.*;
import java.time.*;

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

    String [] bugs = {"circket","beetle","ladybug"};
    String [] alias = bugs;
    System.out.println(bugs.equals(alias));
    System.out.println(bugs.toString());

    System.out.println("Sorting an array");
    int [] numbers = {2,4,6,8};
    Arrays.sort(numbers);
    for (int i = 0; i<numbers.length;i++)
    System.out.println(numbers [i]);
    System.out.println(Arrays.binarySearch(numbers,2));
    System.out.println(Arrays.binarySearch(numbers,4));
    System.out.println(Arrays.binarySearch(numbers,1));
    System.out.println(Arrays.binarySearch(numbers,3));
    System.out.println(Arrays.binarySearch(numbers,9));

    System.out.println("creating a multi dimensional array");
    int [][] vars; //2d array
    int vars2 [][]; //2d array
    int [] vars3[]; //2d aray
    int [] vars4 [], space [][]; //a 2d and 3d array

    String [][] rectangle =  new String [3][2];

    System.out.println("loops over a 2d array");
    int [][] twoD = new int [3][2];
    for (int i=0; i<twoD.length;i++){
      for (int j = 0; j < twoD[i].length;j++){
        System.out.print(twoD[i][j] + " ");
      }
    }
    System.out.println();
    System.out.println("Using an arrayList and generics to tell the compiler we only want to allow String objects");
    ArrayList <String> safer = new ArrayList<String> ();
    safer.add ("sparrow");
    System.out.println(safer);

    List <String> birds = new ArrayList<String>();
    birds.add("hawl");
    birds.add(1,"robin");
    birds.add(0,"blue jay");
    birds.add(1,"cardinal");
    System.out.println(birds);

    System.out.println("Turning an arrayList into an array");
    List<String> list = new ArrayList<String>();
    list.add("hawk");
    list.add("robin");
    Object[] objectArray = list.toArray();
    System.out.println(objectArray.length);
    String[] stringArray = list.toArray(new String[0]);
    System.out.println(stringArray.length);

    System.out.println("Backed List");
    String [] arrray = {"hawk","robin"};
    List<String> llist = Arrays.asList(arrray);
    System.out.println("Size of list "+ llist.size());
    llist.set(1,"test");
    arrray[0] = "new";
    for (String b:arrray) System.out.print(b + " ");

    System.out.println("Sorting arrayList");
    List<Integer> numbersList = new ArrayList<Integer>();
    numbersList.add(99);
    numbersList.add(5);
    numbersList.add(81);

    Collections.sort(numbersList);

    System.out.println(numbersList);

    System.out.println("creating date and time objects");
    System.out.println(LocalDate.now());
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());

    System.out.println("Creating date with no time");
    LocalDate date1 = LocalDate.of(2015,Month.JANUARY,20);
    LocalDate date2 = LocalDate.of(2015,1,20); //year, month, day

    System.out.println("DateTimeFormatter class");
    LocalDate date = LocalDate.of(2020,Month.JANUARY,20);
    LocalTime time = LocalTime.of(11,12,34);
    LocalDateTime dateTime = LocalDateTime.of(date,time);

    System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
    System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

  }
}
