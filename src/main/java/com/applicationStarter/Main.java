package com.applicationStarter;

import com.posilki.Kolacja;
import com.posilki.Obiad;
import com.posilki.Sniadanie;
import com.sport.Sport;

/**
 * Klasa łącząca wszystkie pozostałe klasy - ma za zadanie wygenerować nam posiłki na cały dzień i odpowiednią dla dnia tygodnia aktywność
 */
public class Main {
    /**
     * generujemy ostateczny plan posiłki + aktywność
     */
    public static void main(String[] args) {
        Sniadanie sniadanie = new Sniadanie();
        Obiad obiad = new Obiad();
        Kolacja kolacja = new Kolacja();

        System.out.println("Jadłospis:");
        System.out.println(sniadanie.getOpis());
        System.out.println(obiad.getOpis());
        System.out.println(kolacja.getOpis());

        Sport sport = new Sport();
        String wygenerowanaAktywnosc = sport.generujAktywnosc();
        System.out.println("Dziś możesz zająć się: " + wygenerowanaAktywnosc);
    }
}
