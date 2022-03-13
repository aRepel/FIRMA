public class Pracownik {
    private String Imię_i_Nazwisko;
    private String Adres;
    private int placa;

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
    public String toString(){
        String tekst="Imię i Nazwisko: "+Imię_i_Nazwisko+" Adres: "+Adres+"Płaca: "+placa;
        return tekst;
}
