package recursividad;

public class Main {

    /**
     * Método principal desde donde se ejecuta el programa
     * Este programa contiene varios ejercicios de recursividad que se desarrollaron en clase de entornos de desarrollo
     * 1º DAM - IES Francisco de los Ríos
     * @param args Argumentos de la línea de comandos
     */
    public static void main(final String[] args) {
        //Ejercicio 0, hecho en clase con el profesor:
        System.out.println("Ejercicio 0:");
        recursiveMethod(6);
        //Ejercicio 1:
        System.out.println("Ejercicio 1:");
        final int sum4 = sumNumbers(4);
        System.out.println("La suma desde 1 hasta 4 es: " + sum4);
        //Ejercicio 2:
        System.out.println("Ejercicio 2:");
        final int[] array = {5, sum4, 15, 20, 25};
        printArrayNumbersFromPosition(array, 1);
        //Ejercicio 3:
        System.out.println("Ejercicio 3:");
        final int searchedNumber = 10;
        final int position = searchNumberOnArray(array, searchedNumber, 0);
        System.out.println("La posicion en el array del número " + searchedNumber + "es: " + position);
        //Ejercicio 4:
        System.out.println("Ejercicio 4:");
        final int[][] matrix = {
                array,
                {30, 35, 40, 45, 50},
                {55, 60, 65, 70, 75}
        };
        printMatrix(matrix, 0, 0);
        //Ejercicio 5:
        System.out.println("Ejercicio 5:");
        final int fibonacciPosition = 6;
        final int fibonacciNumber = fibonacci(fibonacciPosition);
        System.out.println("El número de Fibonacci en la posición " + fibonacciPosition + " es: " + fibonacciNumber);
        //Ejercicio 6:
        System.out.println("Ejercicio 6:");
        final int numberToInvert = 12345;
        final int invertedNumber = invertNum(numberToInvert, String.valueOf(numberToInvert).length() - 1);
        System.out.println("El número " + numberToInvert + " invertido es: " + invertedNumber);
        //Ejercicio 7:
        System.out.println("Ejercicio 7:");
        final String wordToInvert = "Alvaro";
        final String invertedWord = invertString(wordToInvert, wordToInvert.length() - 1);
        System.out.println("La palabra " + wordToInvert + " invertida es: " + invertedWord);
        //Ejercicio 8:
        System.out.println("Ejercicio 8:");
        final int base = 2;
        final int exponent = 3;
        final double powerResult = power(base, exponent);
        System.out.println("El resultado de " + base + " elevado a " + exponent + " es: " + powerResult);
    }

    /**
     * Metodo recursivo que imprime el valor de i hasta llegar a 0
     *
     * @param i Valor inicial desde el que se empieza a decrementar
     */
    private static void recursiveMethod(final int i) {
        final String valueToPrint = i > 0 ? "Valor de i: " + i : "Fin";
        System.out.println(valueToPrint);
        if (i > 0) {
            recursiveMethod(i - 1);
        }
    }

    /**
     * Suma los numeros desde 1 hasta el numero indicado
     *
     * @param number Numero hasta el que se quiere sumar
     * @return La suma desde 1 hasta el numero indicado
     */
    private static int sumNumbers(final int number) {
        return number == 1 ? 1 : number + sumNumbers(number - 1);
    }

    //Ejercicio 2:

    /**
     * Imprime los elementos de un printArrayNumbersFromPosition de enteros desde la posicion n hasta el final de manera recursiva
     *
     * @param array Array de enteros a imprimir
     * @param n     Posicion desde la que se empieza a imprimir
     */
    private static void printArrayNumbersFromPosition(final int[] array, final int n) {
        System.out.println(array[n]);
        if (n != (array.length - 1)) {
            printArrayNumbersFromPosition(array, n + 1);
        }
    }

    //Ejercicio 3:

    /**
     * Busca un numero en un array de enteros y devuelve su posicion o -1 si no se encuentra
     *
     * @param array  Array de enteros donde buscar
     * @param number Numero a buscar
     * @param idx    Indice actual de la busqueda
     * @return Posicion del numero buscado o -1 si no se encuentra
     */
    private static int searchNumberOnArray(final int[] array, final int number, final int idx) {
        if (idx == array.length) return -1;
        if (array[idx] == number) return idx;
        return searchNumberOnArray(array, number, idx + 1);
    }

    //Ejercicio 4:

    /**
     * Imprime una matriz de enteros de manera recursiva
     *
     * @param m Matriz de enteros a imprimir
     * @param i Posicion de la fila actual a imprimir
     * @param j Posicion de la columna actual a imprimir
     */
    private static void printMatrix(final int[][] m, int i, int j) {
        System.out.print(m[i][j] + " ");
        if (j == m[i].length - 1) {
            System.out.println();
            i++;
            j = 0;
        } else {
            j++;
        }
        if (i < m.length) {
            printMatrix(m, i, j);
        }
    }

    //Ejercicio 5:

    /**
     * Invierte un numero de manera recursiva
     *
     * @param num Numero a invertir
     * @param pos Posicion del digito mas alto
     * @return Numero invertido
     */
    private static int invertNum(final int num, final int pos) {
        return num < 10 ? num : (num % 10) * (int) Math.pow(10, pos) + (invertNum(num / 10, pos - 1));
    }

    //Ejercicio 6:

    /**
     * Calcula el numero de Fibonacci en la posicion n de manera recursiva
     *
     * @param n Posicion del numero de Fibonacci a calcular
     * @return Numero de Fibonacci en la posicion n
     */

    private static int fibonacci(final int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Ejercicio 7:

    /**
     * Invierte un String de manera recursiva
     * @param word palabra a invertir
     * @param length longitud de la palabra
     * @return Palabra invertida
     */
    private static String invertString(final String word, final int length) {
        return length == 0 ? String.valueOf(word.charAt(length)) : word.charAt(length) + (invertString(word, length - 1));
    }

    //Ejercicio 8:

    /**
     * Calcula la potencia de un numero de manera recursiva
     * @param base Base de la potencia
     * @param exponent Exponente de la potencia
     * @return Resultado de la potencia
     */
    private static double power(int base, int exponent) {
        return switch (exponent) {
            case 0 -> 1;
            case 1 -> base;
            default -> {
                if (exponent < 0) {
                    yield power(base, exponent + 1) / base;
                }
                yield base * power(base, exponent - 1);
            }
        };
    }
}
