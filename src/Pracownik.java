import java.util.Scanner;

public class Pracownik {
    private String Imię_i_Nazwisko;
    private String Adres;
    private int placa;

    public Pracownik() {
        Scanner input = new Scanner(System.in);
            System.out.print("Podaj Imię i Nazwisko:");
            this.Imię_i_Nazwisko = input.next();
            System.out.print("Podaj Adres:");
            this.Adres = input.next();
            System.out.print("Podaj Płacę:");
            this.placa = input.nextInt();
    }

    public String getImię_i_Nazwisko() {
        return this.Imię_i_Nazwisko;
    }

    public void setImię_i_Nazwisko(String imię_i_Nazwisko) {
        this.Imię_i_Nazwisko = imię_i_Nazwisko;
    }

    public String getAdres() {
        return this.Adres;
    }

    public void setAdres(String adres) {
        this.Adres = adres;
    }

    public int getPlaca() {
        return this.placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public void podwyzka(int placa){
        this.placa += placa;
    }
    public String dane() {
        return "Imię i Nazwisko: " + this.Imię_i_Nazwisko + "\tAdres: " + this.Adres + "\tPłaca: " + this.placa;
    }
}