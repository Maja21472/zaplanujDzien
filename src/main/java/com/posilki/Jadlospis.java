package com.posilki;

/**
 * Klasa łącząca wszystkie posiłki
 */
public class Jadlospis {
    /**
     * funkcja, która korzystając z wszystkich klas w pakiecie posilki wyświetla jadłospis
     */
    public static void main(String[] args) {
        Sniadanie sniadanie = new Sniadanie();
        Obiad obiad = new Obiad();
        Kolacja kolacja = new Kolacja();

        System.out.println("Jadłospis:");
        System.out.println(sniadanie.getOpis());
        System.out.println(obiad.getOpis());
        System.out.println(kolacja.getOpis());
    }}