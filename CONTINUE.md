# CONTINUE.md - Project Evolution & Maintenance

## 🚀 Current Project State
The project has evolved from a single implementation into a **Comparative Kata Suite**. It now features two distinct approaches to the Roman Numerals problem, both adhering to the same interface.

### Key Components:
- **`es.aam.kata.RomanConverter`**: The shared interface.
- **`es.aam.kata.human`**: A rule-based implementation focusing on digit decomposition.
- **`es.aam.kata.ia`**: A data-driven implementation using a greedy algorithm.
- **`es.aam.kata.RomanComparisonTest`**: A cross-validation test suite that ensures parity between both versions (1-3999).

## 🛠 Tech Stack
- **Java 11**
- **Maven 3.6+**
- **JUnit 5** (with Parameterized Tests)

## 📋 Ongoing Tasks
- [x] Implement Human version.
- [x] Implement AI version.
- [x] Create shared interface.
- [x] Add functional comparison tests.
- [ ] **Performance Benchmarking**: Add a JMH (Java Microbenchmark Harness) module to measure throughput/latency of both implementations.
- [ ] **Extended Validation**: Test for edge cases like invalid Roman strings in both implementations.

## 📂 Project Structure
- `src/main/java/es/aam/kata/`:
  - `RomanConverter.java`: Common interface.
  - `human/`: Historical procedural logic.
  - `ia/`: Modern data-driven logic.
- `src/test/java/es/aam/kata/`:
  - `human/`, `ia/`: Unit tests for each specific implementation.
  - `RomanComparisonTest.java`: Global consistency tests.

## 🚦 How to Run
```bash
# Run all tests (including comparison)
mvn test

# Run only the comparison test
mvn test -Dtest=RomanComparisonTest
```

## 📖 Related Documents
- `README`: Original problem description.
- `COMPARISON.md`: Detailed architectural and algorithmic analysis (Multilingual).
