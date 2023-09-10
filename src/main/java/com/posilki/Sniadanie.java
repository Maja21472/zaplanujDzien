package com.posilki;
import java.util.Random;

/**
 * Klasa losująca przykładowe śniadanie.
 */
public class Sniadanie {
    String[] baza = {"jajecznica", "naleśniki", "owsianka"};
    String[] owoc = {"truskawki", "borówki", "jabłko"};
    String[] dodatek = {"skyr", "baton proteinowy", "serek wiejski"};

    /**
     * Metoda zwracająca opis śniadania.
     *
     * @return Opis śniadania w formacie "Twoje śniadanie: [baza], [owoc] i [dodatek]."
     */
    public String getOpis() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);
        int owocIndex = random.nextInt(owoc.length);
        int dodatekIndex = random.nextInt(dodatek.length);

        String wybranaBaza = baza[bazaIndex];
        String wybranyOwoc = owoc[owocIndex];
        String wybranyDodatek = dodatek[dodatekIndex];

        return "Twoje śniadanie: " + wybranaBaza + ", " + wybranyOwoc + " i " + wybranyDodatek + ".";
    }
    public static void main(String[] args) {
        Sniadanie sniadanie = new Sniadanie();
        System.out.println(sniadanie.getOpis());
    }
}