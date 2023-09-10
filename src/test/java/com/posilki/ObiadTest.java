package com.posilki;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * test obiadu - sprawdza czy odpowiedni opis posiłku się generuje
 */

class ObiadTest {

    @Test
    void testGetOpis() {
        Obiad obiad = new Obiad();

        String opis = obiad.getOpis();

        Assertions.assertNotNull(opis);
        Assertions.assertTrue(opis.contains("Twój obiad:"));
    }
}