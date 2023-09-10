package com.posilki;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test klasy Kolacja - sprawdza czy generuje odpowiedni opis.
 */

class KolacjaTest {

    @Test
    void testGetOpis() {
        Kolacja kolacja = new Kolacja();

        String opis = kolacja.getOpis();

        Assertions.assertNotNull(opis);
        Assertions.assertTrue(opis.contains("Twoja kolacja:"));
    }
}