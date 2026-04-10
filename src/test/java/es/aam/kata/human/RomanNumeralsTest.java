package es.aam.kata.human;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

	RomanNumerals romNum = new RomanNumerals();
	
	@Test
	public void testCompleto() {
		for (int i = 1; i <= 3000; i++) {
			
			String roman = romNum.toRoman(i);

			assertEquals(i, romNum.fromRoman(roman));
			assertEquals(roman, romNum.toRoman(i));
			
		}
	}

}
