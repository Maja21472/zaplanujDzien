package com.posilki;

import java.util.Random;

/**
 * klasa losująca kolację - tym razem tylko 1 element
 */
public class Kolacja {
    String[] baza = {"pierogi", "pizza", "omlet"};
    /**
     * Metoda zwracająca opis kolacji.
     *
     * @return Opis kolacji w formacie "Twoje śniadanie: [baza]."
     */
    public String getOpis() {
        Random random = new Random();
        int bazaIndex = random.nextInt(baza.length);

        String wybranaBaza = baza[bazaIndex];


        return "Twoja kolacja: " + wybranaBaza + ".";
    }
}