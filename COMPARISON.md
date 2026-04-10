# Comparativa: IA vs. Humano - Roman Numerals Kata

Este documento analiza las dos implementaciones presentes en el proyecto: el paquete `ia` (generado por el asistente) y el paquete `human` (implementación histórica del usuario).

## 1. Arquitectura y Diseño

| Característica | Solución IA (`es.aam.kata.ia`) | Solución Humana (`es.aam.kata.human`) |
| :--- | :--- | :--- |
| **Estructura** | Una sola clase concisa. | 3 clases (Fachada + 2 Lógicas separadas). |
| **Enfoque** | Orientado a Datos (Data-Driven). | Orientado a Procedimientos/Reglas. |
| **Complejidad** | Baja. Fácil de entender de un vistazo. | Alta. Fragmentada en múltiples métodos y clases. |

## 2. Análisis del Algoritmo

### Decimal a Romano
- **IA**: Utiliza un enfoque "greedy" (codicioso) recorriendo un mapa de valores de mayor a menor. Es el estándar de oro para este problema por su eficiencia $O(1)$ (espacio de búsqueda constante).
- **Humana**: Convierte el número a String, extrae cada dígito, calcula su potencia decimal mediante `Math.pow` y luego busca el símbolo. Es un enfoque mucho más costoso computacionalmente y menos intuitivo para el dominio del problema.

### Romano a Decimal
- **IA**: Procesa la cadena de derecha a izquierda. Es una lógica brillante porque permite manejar la resta (ej. IV) comparando simplemente si el valor actual es menor que el anterior.
- **Humana**: Utiliza `substring(indice, indice + 2)` para buscar "números compuestos" (IV, IX, etc.). Esto requiere lógica extra para controlar los índices y evitar `StringIndexOutOfBoundsException`.

## 3. Limpieza de Código (Clean Code)

### Puntos Débiles de la Solución Humana:
1. **Violación de DRY (Don't Repeat Yourself)**: Los valores de los números romanos están cableados en múltiples estructuras `if-else` y `switch`.
2. **Acoplamiento**: `RomanToDecimal` y `DecimalToRoman` dependen fuertemente de las constantes en `RomanNumerals`, pero la lógica de qué constituye un número "especial" está duplicada en la lógica de las clases de conversión.
3. **Verbocidad**: El uso de `String.valueOf(numero)` y `substring` para procesar números es un "olor de código" (code smell) en Java cuando se puede usar aritmética simple.

### Puntos Fuertes de la Solución IA:
1. **Extensibilidad**: Para añadir nuevos símbolos (ej. para representar 5000), solo se necesita añadir un valor a dos arrays estáticos. En la versión humana, habría que modificar múltiples métodos y clases.
2. **Eficiencia**: Menor uso de memoria al evitar la creación de múltiples objetos `String` y llamadas a `Math.pow`.

## 4. Conclusión

La **solución humana** es un excelente ejemplo de "programación defensiva" y estructurada, pero cae en la trampa de la **sobre-ingeniería**. Intenta aplicar patrones de diseño complejos a un problema que se resuelve mejor con una estructura de datos sólida.

La **solución IA** demuestra que, a menudo, **el mejor código es el que no se escribe**. Al reducir la lógica a un recorrido de datos, eliminamos la posibilidad de errores en las condiciones `if-else`.

### Veredicto Final:
Si estuviéramos en una revisión de código profesional:
- La versión **IA** se aprueba sin comentarios.
- La versión **Humana** se devuelve para refactorizar, pidiendo que se simplifique la lógica y se elimine la redundancia de clases.
