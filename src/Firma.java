import java.util.ArrayList;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {

        ArrayList<Pracownik> lista_pracownikow = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String akcja = "1";
        while (!akcja.equals("stop")) {
            System.out.println("wpisz 'add' aby dodać pracownika,'list' by pokazać listę pracowników, 'x' by zakończyć akcję");
            akcja = input.next();
            if (akcja.equals("x")) {

                break;
            }
            switch (akcja) {
                case "add":
                    lista_pracownikow.add(new Pracownik());
                    break;
                case "list":
                    int i=0;
                    for (Pracownik temp : lista_pracownikow) {
                        System.out.print(i);
                        System.out.println(temp.dane());
                        i++;
                    }
                    break;
                case "delete":
                    System.out.println("Którego pracownika zwolnić? Wpisz jego numer id:");
                    int ktoregoWywalic = input.nextInt();
                    lista_pracownikow.remove(ktoregoWywalic);

                    break;
                case "suma":
                    int wszystkiePlace = 0;
                    for (Pracownik temp : lista_pracownikow){
                        wszystkiePlace+=temp.getPlaca();
                    }
                    System.out.println(wszystkiePlace);

                    break;
                case "raise":
                    System.out.println("Komu dać podwyżkę? Wpisz jego numer id:");
                    int id = input.nextInt();
                    System.out.println("Jaka ilość?");
                    int kasa = input.nextInt();
                    lista_pracownikow.get(id).podwyzka(kasa);
                    break;
            }

        }
    }
}

