import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) throws Exception{
        int numberOfFilms=0;

        ArrayList <String> list = new ArrayList<>();
        File file = new File("films.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            //String line = scanner.nextLine();
            //System.out.println(line);
            list.add(scanner.nextLine());
            numberOfFilms+=1;
        }
        //System.out.println(list.get(5));
        //System.out.println(numberOfFilms);
        double numberRandom = Math.random();
        int FilmNumb = (int) (numberRandom * numberOfFilms +1);
        //System.out.println(FilmNumb);
        System.out.println(list.get(FilmNumb));
        String s = list.get(FilmNumb);
        //hideTitle
        HideTitle filmHide = new HideTitle();
        filmHide.title = s;
        filmHide.hideTit();
        //ArrayList <String> title = new ArrayList<>();







    }
}
