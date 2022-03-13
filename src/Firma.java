import java.util.ArrayList;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {

        ArrayList<Pracownik> lista_pracownikow = new ArrayList<>();
        for(int i = 0; i<3;i++){
            lista_pracownikow.add(new Pracownik());
        }
        for(Pracownik i : lista_pracownikow){
            System.out.println(i.toString());
        }
        Scanner input = new Scanner(System.in);
        String akcja = "1";
        while (!akcja.equals("stop")) {
            System.out.println("wpisz 'stop' by zakończyć akcję");
            akcja = input.next();
            if (akcja.equals("stop")) {
                break;
            }
            switch (akcja) {
                case"f":

                    break;
                case"p":


        }

    }
}
