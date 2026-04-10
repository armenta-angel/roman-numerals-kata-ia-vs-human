package es.aam.kata;

import es.aam.kata.human.RomanNumerals;
import es.aam.kata.ia.RomanNumeralConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanComparisonTest {

    private final RomanConverter humanSolution = new RomanNumerals();
    private final RomanConverter iaSolution = new RomanNumeralConverter();

    @ParameterizedTest(name = "Comparing implementations for number {0}")
    @ValueSource(ints = {1, 4, 9, 40, 90, 400, 900, 1994, 2023, 3999})
    @DisplayName("Compare Human and IA solutions for specific key values")
    void compareSpecificValues(int number) {
        String humanRoman = humanSolution.toRoman(number);
        String iaRoman = iaSolution.toRoman(number);

        assertEquals(humanRoman, iaRoman, "toRoman result should be the same for " + number);
        assertEquals(humanSolution.fromRoman(humanRoman), iaSolution.fromRoman(iaRoman), "fromRoman result should be the same for " + humanRoman);
    }

    @ParameterizedTest(name = "Testing range consistency for number {0}")
    @DisplayName("Check consistency across a wide range (1-3999)")
    @ValueSource(ints = {1, 10, 50, 100, 500, 1000, 3999}) // We can expand this or use a MethodSource
    void compareRange(int number) {
        // For brevity in the logs we only use some, but we could test all 3999
        String humanRoman = humanSolution.toRoman(number);
        String iaRoman = iaSolution.toRoman(number);
        
        assertEquals(humanRoman, iaRoman);
        assertEquals(number, humanSolution.fromRoman(humanRoman));
        assertEquals(number, iaSolution.fromRoman(iaRoman));
    }
}
