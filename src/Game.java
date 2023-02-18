import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) throws Exception{
        int numberOfFilms=0;
        String letter;

        ArrayList <String> list = new ArrayList<>();
        File file = new File("films.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            list.add(scanner.nextLine());
            numberOfFilms+=1;
        }
        double numberRandom = Math.random();
        int FilmNumb = (int) (numberRandom * numberOfFilms +1);
        System.out.println(list.get(FilmNumb));
        String s = list.get(FilmNumb);
        HideTitle filmHide = new HideTitle();
        filmHide.title = s;
        filmHide.hideTit();
        filmHide.guessTheMovie();










    }
}
