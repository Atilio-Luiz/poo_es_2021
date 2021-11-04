import java.util.ArrayList;
import java.util.Scanner;

public class Paragrafo {
    public static void main(String[] args) {
        ArrayList<String> allWords = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String paragraph = in.nextLine();
        Scanner input = new Scanner(paragraph);
        while(input.hasNext()) {
            String word = input.next();
            allWords.add(word);
        }
        System.out.println(allWords);

        // print in reverse
        ArrayList<String> reverseList = new ArrayList<String>();
        for(int i = allWords.size()-1; i >= 0 ; i--) {
            reverseList.add( allWords.get(i) );
        }
        System.out.println(reverseList);
        reverseList = null;

        // print all plural words capitalized
        for(int i = 0; i < allWords.size(); i++) {
            String word = allWords.get(i);
            if(word.endsWith("s")) {
                allWords.set(i, Character.toUpperCase(word.charAt(0)) + word.substring(1,word.length()));
            }
        }
        System.out.println(allWords);

        // remove all plural words
        for(int i = 0; i < allWords.size(); i++) {
            String word = allWords.get(i);
            if(word.endsWith("s")) {
                allWords.remove(i);
                i--;
            }
        }
        System.out.println(allWords);
    }
}