import java.util.Scanner;

public class Pracownik {
    private String Imię_i_Nazwisko;
    private String Adres;
    private int placa;

    public Pracownik() {
        Scanner input = new Scanner(System.in);
            System.out.print("Podaj Imię i Nazwisko:");
            Imię_i_Nazwisko = input.next();
            System.out.print("Podaj Adres:");
            Adres = input.next();
            System.out.println("Podaj Płacę:");
            this.placa = input.nextInt();
    }

    public String getImię_i_Nazwisko() {
        return Imię_i_Nazwisko;
    }

    public void setImię_i_Nazwisko(String imię_i_Nazwisko) {
        Imię_i_Nazwisko = imię_i_Nazwisko;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String dane() {
        /String tekst = "Imię i Nazwisko: " + this.Imię_i_Nazwisko + " Adres: " + this.Adres + "Płaca: " + this.placa;
        return tekst;
    }
}