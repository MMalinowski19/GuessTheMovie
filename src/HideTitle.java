import java.util.Scanner;
import java.util.Arrays;


public class HideTitle {

    String title;
    String str;
    char letter;
    void hideTit() {
        str = title.replaceAll("[a-zA-Z]", "_");
        System.out.println(str);
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
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the letter:");
            //letter = scan.nextLine();
            letter = scan.next().charAt(0);

            for (int i = 0; i < title.length(); i++) {
                if (tab[i] == letter){
                    tabstr[i]=letter;
                    System.out.println(tabstr);
                    //tabstr.toString();
                    //str = tabstr

                }

               // System.out.print(tab[i] + " ");
            }
            //    System.out.println(tab[3]);
           // break;
        }
        System.out.println("Brawo! You guess the title!");
    }

}



