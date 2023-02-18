import java.util.Scanner;

public class HideTitle {

    String title;
    String str;
    String str1;
    String str2;
    String str3;
    String letter;
    //String[] tab;

void hideTit(){
    str = title.replaceAll("[a-zA-Z]","_");
    System.out.println(str);

}
void guessTheMovie(){


    while (str.contains("_")) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter:");
        letter = scan.nextLine();
        char [] tab = new char[title.length()];
        char [] tabstr = new char[str.length()];
        for (int i=0; i<title.length(); i++) {
            tab[i] = title.charAt(i);
        }
        for (int i=0; i<str.length(); i++) {
            tabstr[i] = str.charAt(i);
        }
        if (title.contains(letter)) {
            char[] charls = letter.toCharArray();
            //str1 = title.replaceAll(letter,"1");
            //str2 = str1.replaceAll("[a-zA-Z]","_");
            //str3 = str2.replaceAll("1",letter);
            //System.out.println(str1);
            //System.out.println(str2);
            //char [] tab = new char[title.length()];
            //for (int i=0; i<title.length(); i++){
              //  tab[i]=title.charAt(i);
            for (int i=0; i<title.length(); i++){
                if (charls[1]!=tab[i]){
                    tab[i] = tabstr[i];

                }

            }
            }
         //   tab [n] = title;
          //  str = str3;
            for (int i=0; i<title.length(); i++){

                System.out.print(tab[i]+" ");
            }
        //    System.out.println(tab[3]);
        break;
    }
    //System.out.println(str);
        //System.out.println("Brawo! You guess the title!");

    }

}
