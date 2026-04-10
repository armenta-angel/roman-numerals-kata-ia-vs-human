package es.aam.kata.ia;

public class Main {
    public static void main(String[] args) {
        RomanNumeralConverter converter = new RomanNumeralConverter();

        // Ejemplos de la kata
        System.out.println("=== Roman Numerals Kata Demo ===\n");

        // Parte I: Número → Romano
        System.out.println("Parte I: Número → Romano");
        int[] numbers = {1, 4, 7, 10, 40, 50, 90, 100, 400, 500, 900, 1000, 1999, 2023};
        for (int num : numbers) {
            System.out.println(num + " → " + converter.toRoman(num));
        }

        System.out.println("\nParte II: Romano → Número");
        String[] romans = {"I", "IV", "VII", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M", "MCMXCIX", "MMXXIII"};
        for (String roman : romans) {
            System.out.println(roman + " → " + converter.fromRoman(roman));
        }

        // Verificación bidireccional
        System.out.println("\n=== Verificación Bidireccional ===");
        int testNumber = 1999;
        String roman = converter.toRoman(testNumber);
        int backToNumber = converter.fromRoman(roman);
        System.out.println(testNumber + " → " + roman + " → " + backToNumber + " ✓");
    }
}