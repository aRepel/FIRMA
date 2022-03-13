import java.util.ArrayList;

public class Firma {
    public static void main(String[] args) {
        ArrayList<Pracownik> lista_pracowników = new ArrayList<>();
        for(int i = 0; i<3;i++){
            lista_pracowników.add(new Pracownik());
        }
        for(Pracownik i : lista_pracowników){
            System.out.println(i.toString());
        }


    }
}
