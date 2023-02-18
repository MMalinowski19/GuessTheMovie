import java.util.Scanner;
import java.util.Arrays;


public class HideTitle {

    String title;
    String str;
    char letter;
    int j=0;
    void hideTit() {
        str = title.replaceAll("[a-zA-Z]", "_");
       // System.out.println(str);
    }

    void guessTheMovie() {
        char[] tab = new char[title.length()];
        char[] tabstr = new char[str.length()];
        for (int i = 0; i < title.length(); i++) {
            tab[i] = title.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            tabstr[i] = str.charAt(i);

        }
        while (str.contains("_")) {
            System.out.println(str);
            Scanner scan = new Scanner(System.in);
            System.out.println("Guess a letter:");
            letter = scan.next().charAt(0);
            for (int i = 0; i < title.length(); i++) {
                if (tab[i] == letter){
                    tabstr[i]=letter;
                    String tabstrString = String.valueOf(tabstr);
                    str =tabstrString;
                }
            }
        }
        System.out.println("Brawo! You win! You have gueesed '" +title + "' correctly.");
    }
}



