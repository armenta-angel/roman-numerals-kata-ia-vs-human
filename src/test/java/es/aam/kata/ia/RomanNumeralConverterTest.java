package es.aam.kata.ia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

    private RomanNumeralConverter converter = new RomanNumeralConverter();

    // Test cases base - números fundamentales
    @Test
    void shouldConvertOne() {
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    void shouldConvertFive() {
        assertEquals("V", converter.toRoman(5));
    }

    @Test
    void shouldConvertTen() {
        assertEquals("X", converter.toRoman(10));
    }

    @Test
    void shouldConvertFifty() {
        assertEquals("L", converter.toRoman(50));
    }

    @Test
    void shouldConvertHundred() {
        assertEquals("C", converter.toRoman(100));
    }

    @Test
    void shouldConvertFiveHundred() {
        assertEquals("D", converter.toRoman(500));
    }

    @Test
    void shouldConvertThousand() {
        assertEquals("M", converter.toRoman(1000));
    }

    // Test cases para repeticiones
    @Test
    void shouldConvertTwo() {
        assertEquals("II", converter.toRoman(2));
    }

    @Test
    void shouldConvertThree() {
        assertEquals("III", converter.toRoman(3));
    }

    @Test
    void shouldConvertTwenty() {
        assertEquals("XX", converter.toRoman(20));
    }

    @Test
    void shouldConvertThirty() {
        assertEquals("XXX", converter.toRoman(30));
    }

    @Test
    void shouldConvertTwoHundred() {
        assertEquals("CC", converter.toRoman(200));
    }

    @Test
    void shouldConvertThreeHundred() {
        assertEquals("CCC", converter.toRoman(300));
    }

    @Test
    void shouldConvertTwoThousand() {
        assertEquals("MM", converter.toRoman(2000));
    }

    @Test
    void shouldConvertThreeThousand() {
        assertEquals("MMM", converter.toRoman(3000));
    }

    // Test cases para notación sustractiva
    @Test
    void shouldConvertFour() {
        assertEquals("IV", converter.toRoman(4));
    }

    @Test
    void shouldConvertNine() {
        assertEquals("IX", converter.toRoman(9));
    }

    @Test
    void shouldConvertForty() {
        assertEquals("XL", converter.toRoman(40));
    }

    @Test
    void shouldConvertNinety() {
        assertEquals("XC", converter.toRoman(90));
    }

    @Test
    void shouldConvertFourHundred() {
        assertEquals("CD", converter.toRoman(400));
    }

    @Test
    void shouldConvertNineHundred() {
        assertEquals("CM", converter.toRoman(900));
    }

    // Test cases complejos - Combinación de todas las reglas
    @Test
    void shouldConvertSeventeenth() {
        assertEquals("XVII", converter.toRoman(17));
    }

    @Test
    void shouldConvertFortyfour() {
        assertEquals("XLIV", converter.toRoman(44));
    }

    @Test
    void shouldConvertFiftyeight() {
        assertEquals("LVIII", converter.toRoman(58));
    }

    @Test
    void shouldConvertNinetyfour() {
        assertEquals("XCIV", converter.toRoman(94));
    }

    @Test
    void shouldConvertFiveHundredEightyfive() {
        assertEquals("DLXXXV", converter.toRoman(585));
    }

    @Test
    void shouldConvertEightHundredNinetyfour() {
        assertEquals("DCCCXCIV", converter.toRoman(894));
    }

    @Test
    void shouldConvertNineteenNinetyfour() {
        assertEquals("MCMXCIV", converter.toRoman(1994));
    }

    @Test
    void shouldConvertNineteenNinetynine() {
        assertEquals("MCMXCIX", converter.toRoman(1999));
    }

    @Test
    void shouldConvertTwentythree() {
        assertEquals("MMXXIII", converter.toRoman(2023));
    }

    // Test cases para Parte II: Romano → Número
    @Test
    void shouldConvertFromRomanOne() {
        assertEquals(1, converter.fromRoman("I"));
    }

    @Test
    void shouldConvertFromRomanFive() {
        assertEquals(5, converter.fromRoman("V"));
    }

    @Test
    void shouldConvertFromRomanTen() {
        assertEquals(10, converter.fromRoman("X"));
    }

    @Test
    void shouldConvertFromRomanFifty() {
        assertEquals(50, converter.fromRoman("L"));
    }

    @Test
    void shouldConvertFromRomanHundred() {
        assertEquals(100, converter.fromRoman("C"));
    }

    @Test
    void shouldConvertFromRomanFiveHundred() {
        assertEquals(500, converter.fromRoman("D"));
    }

    @Test
    void shouldConvertFromRomanThousand() {
        assertEquals(1000, converter.fromRoman("M"));
    }

    // Test cases para repeticiones en Parte II
    @Test
    void shouldConvertFromRomanTwo() {
        assertEquals(2, converter.fromRoman("II"));
    }

    @Test
    void shouldConvertFromRomanThree() {
        assertEquals(3, converter.fromRoman("III"));
    }

    @Test
    void shouldConvertFromRomanTwenty() {
        assertEquals(20, converter.fromRoman("XX"));
    }

    @Test
    void shouldConvertFromRomanThirty() {
        assertEquals(30, converter.fromRoman("XXX"));
    }

    // Test cases para notación sustractiva en Parte II
    @Test
    void shouldConvertFromRomanFour() {
        assertEquals(4, converter.fromRoman("IV"));
    }

    @Test
    void shouldConvertFromRomanNine() {
        assertEquals(9, converter.fromRoman("IX"));
    }

    @Test
    void shouldConvertFromRomanForty() {
        assertEquals(40, converter.fromRoman("XL"));
    }

    @Test
    void shouldConvertFromRomanNinety() {
        assertEquals(90, converter.fromRoman("XC"));
    }

    @Test
    void shouldConvertFromRomanFourHundred() {
        assertEquals(400, converter.fromRoman("CD"));
    }

    @Test
    void shouldConvertFromRomanNineHundred() {
        assertEquals(900, converter.fromRoman("CM"));
    }

    // Test cases complejos en Parte II
    @Test
    void shouldConvertFromRomanSeventeenth() {
        assertEquals(17, converter.fromRoman("XVII"));
    }

    @Test
    void shouldConvertFromRomanFortyfour() {
        assertEquals(44, converter.fromRoman("XLIV"));
    }

    @Test
    void shouldConvertFromRomanNinetyfour() {
        assertEquals(94, converter.fromRoman("XCIV"));
    }

    @Test
    void shouldConvertFromRomanNineteenNinetyfour() {
        assertEquals(1994, converter.fromRoman("MCMXCIV"));
    }

    @Test
    void shouldConvertFromRomanNineteenNinetynine() {
        assertEquals(1999, converter.fromRoman("MCMXCIX"));
    }

    // Test cases para validación de entrada
    @Test
    void shouldThrowExceptionForInvalidRomanNumeral() {
        assertThrows(IllegalArgumentException.class, () -> converter.fromRoman("Z"));
    }

    @Test
    void shouldThrowExceptionForEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> converter.fromRoman(""));
    }

    @Test
    void shouldThrowExceptionForNullInput() {
        assertThrows(IllegalArgumentException.class, () -> converter.fromRoman(null));
    }
}
