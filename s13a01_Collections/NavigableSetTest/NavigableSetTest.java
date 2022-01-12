// Using SortedSets and TreeSets.
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetTest {
   public static void main(String[] args) {
      // create TreeSet from array colors
      String[] colors = {"yellow", "green", "black", "tan", "grey",
         "white", "orange", "red", "green"};
      NavigableSet<String> tree = new TreeSet<>(Arrays.asList(colors));

      System.out.print("navigable set: ");
      printSet(tree); 

      // get headSet based on "orange"
      System.out.print("headSet (\"orange\"):  ");
      printSet(tree.headSet("orange"));

      // get tailSet based upon "orange"
      System.out.print("tailSet (\"orange\"):  ");
      printSet(tree.tailSet("orange"));

      // get first and last elements
      System.out.printf("first: %s%n", tree.first());
      System.out.printf("last : %s%n", tree.last());

      // using function ceiling from interface NavigableSet
      System.out.print("ceiling (\"blue\"): ");
      System.out.println(tree.ceiling("blue"));

      // using function floor from interface NavigableSet
      System.out.print("floor (\"blue\"): ");
      System.out.println(tree.floor("blue"));
   } 

   // output SortedSet using enhanced for statement
   private static void printSet(SortedSet<String> set) {
      for (String s : set) {
         System.out.printf("%s ", s);
      }

      System.out.println();
   } 
} 
