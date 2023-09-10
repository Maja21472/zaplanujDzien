package com.sport;


import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Klasa reprezentująca aktywność sportową w zależności od dnia tygodnia.
 */
public class Sport {
    private final String[] aktywnosci = {"bieganie", "skakanka", "siłownia", "basen", "rolki", "wrotki", "spacer"};

    /**
     * Metoda generująca aktywność sportową w zależności od rzeczywistego dnia tygodnia.
     *
     * @return Wygenerowana aktywność sportowa.
     */
    public String generujAktywnosc() {
        DayOfWeek dzienTygodnia = LocalDate.now().getDayOfWeek();
        int index = dzienTygodnia.getValue() - 1; // Dni tygodnia numerowane od 1 do 7, a indeksy tablicy od 0 do 6

        if (index >= 0 && index < aktywnosci.length) {
            return aktywnosci[index];
        } else {
            return "Nieznana aktywność";
        }
    }
}