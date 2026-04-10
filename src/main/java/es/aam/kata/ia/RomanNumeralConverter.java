package es.aam.kata.ia;

import es.aam.kata.RomanConverter;

public class RomanNumeralConverter implements RomanConverter {
    
    private static final int[] values = {
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4,
        1
    };
    
    private static final String[] numerals = {
        "M", "CM", "D", "CD",
        "C", "XC", "L", "XL",
        "X", "IX", "V", "IV",
        "I"
    };
    
    @Override
    public String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(numerals[i]);
                number -= values[i];
            }
        }
        
        return result.toString();
    }
    
    @Override
    public int fromRoman(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Roman numeral cannot be null or empty");
        }
        
        int result = 0;
        int previousValue = 0;
        
        // Procesar de derecha a izquierda
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = getRomanValue(roman.charAt(i));
            
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            
            previousValue = currentValue;
        }
        
        return result;
    }
    
    private int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral: " + romanChar);
        }
    }
}
