# CONTINUE.md - Roman Numerals Kata Project Guide

## 1. Project Overview
This project is a Java implementation of the **Roman Numerals Kata**. Its primary goal is to provide a robust converter between Arabic integers and Roman numeral strings, following the rules of the Roman numbering system.

- **Key Technologies:** Java 11, Maven, JUnit 5.
- **Architecture:** A simple library-style structure with a core converter class and its corresponding test suite.

## 2. Getting Started
### Prerequisites
- **JDK 11** or higher.
- **Maven 3.6+** installed.

### Installation
Clone the repository and build the project using Maven:
```bash
mvn clean install
```

### Basic Usage
You can use the `RomanNumeralConverter` class in your code:
```java
RomanNumeralConverter converter = new RomanNumeralConverter();
String roman = converter.toRoman(1994); // Returns "MCMXCIV"
int number = converter.fromRoman("MCMXCIV"); // Returns 1994
```

### Running Tests
To run the full test suite:
```bash
mvn test
```

## 3. Project Structure
- `src/main/java/`: Contains the source code.
  - `RomanNumeralConverter.java`: The main logic for conversion.
  - `Main.java`: Entry point (if applicable).
- `src/test/java/`: Contains the unit tests.
  - `RomanNumeralConverterTest.java`: Comprehensive JUnit 5 tests.
- `pom.xml`: Maven configuration file, managing dependencies (JUnit 5) and build plugins.

## 4. Development Workflow
- **TDD (Test-Driven Development):** This project is designed as a Kata, meaning it's ideal for practicing TDD. Add a test case in `RomanNumeralConverterTest.java` before implementing new logic.
- **Coding Standards:** Follow standard Java naming conventions (camelCase for methods/variables, PascalCase for classes).
- **CI/CD:** Basic Maven lifecycle (clean, compile, test, package).

## 5. Key Concepts
- **Roman Numeral Rules:**
  - **Additive:** `I=1`, `V=5`, `X=10`, `L=50`, `C=100`, `D=500`, `M=1000`.
  - **Subtractive:** Used when a smaller value precedes a larger one (e.g., `IV` for 4, `IX` for 9).
  - **Repetition:** Symbols can be repeated up to three times (e.g., `III`, `XXX`).
- **Algorithm:**
  - `toRoman`: Uses a greedy approach with predefined mapping arrays.
  - `fromRoman`: Processes the string from right to left to handle subtractive notation efficiently.

## 6. Common Tasks
### Adding a new conversion rule
1. Modify the `values` and `numerals` arrays in `RomanNumeralConverter.java`.
2. Add a corresponding test case in `RomanNumeralConverterTest.java`.

### Handling errors
The `fromRoman` method throws `IllegalArgumentException` for:
- Null or empty input.
- Invalid Roman characters (not in `I, V, X, L, C, D, M`).

## 7. Troubleshooting
- **Maven issues:** Ensure your `JAVA_HOME` is set to JDK 11+. Run `mvn -v` to check.
- **Test failures:** Check the expected vs actual value in the JUnit output. Subtractive logic is the most common source of errors.

## 8. References
- [Roman Numerals Wikipedia](https://en.wikipedia.org/wiki/Roman_numerals)
- [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Getting Started](https://maven.apache.org/guides/getting-started/index.html)
