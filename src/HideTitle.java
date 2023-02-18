public class HideTitle {

    String title;
void hideTit(){
    String str = title.replaceAll("[a-zA-Z]","_");
    System.out.println(str);

}
}
