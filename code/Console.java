
import java.io.PrintStream;
import java.util.ArrayList;

public class Console {

    private final static PrintStream sout = System.out;

    /**
     * Imprimir CON salto de línea
     *
     *
     * @param data Objeto de cualquier tipo.
     *
     * @see
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * wln("Santiago");
     * wln(43.5);
     * wln(12.5f);
     * wln(12);
     * wln(new ArrayList<String>());
     * wln(new String[] { "uno", "dos" });
     * }
     * </pre>
     * <pre>
     * {@code SALIDA>>
     * Santiago
     * 43.5
     * 12.5
     * 12
     * []
     * [Ljava.lang.String;@5ecddf8f
     * }
     * </pre>
     */
    public static void wln(Object data) {
        try {
            sout.println(data.toString());
        } catch (Exception e) {
            sout.println("Error al imprimir con salto de línea (wln): " + e.toString());
        }
    }

    /**
     * Imprimir SIN salto de línea
     *
     * @param data Objeto de cualquier tipo.
     *
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * w("Santiago");
     * w(43.5);
     * }
     * </pre>
     *
     * {@code SALIDA>>
     * Santiago
     * 43.5
     *
     */
    public static void w(Object data) {
        try {
            sout.print(data.toString());
        } catch (Exception e) {
            sout.println("Error al imprimir (w):" + e.toString());
        }
    }

    /**
     * Imprimir CON FORMATO
     *
     * @param str Cadena con formato.
     * @param data Datos a insertar en el formato.
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * w("Hola %s, su edad es %d.", "Santiago", 19);
     * }
     * </pre>
     *
     * {@code SALIDA>> Hola Santiago, su edad es 19.}
     *
     */
    public static void w(String str, Object... data) {
        try {
            sout.printf(str, data);
        } catch (java.util.IllegalFormatConversionException e) {
            sout.printf(
                    "%nError, el formato (%s%s) no es correcto para el tipo de dato \"%s\" que se quiere imprimir.%n",
                    "%", e.getMessage().charAt(0), e.getArgumentClass().getSimpleName());
        } catch (java.util.MissingFormatArgumentException e) {
            sout.printf("%nError, no se esperaba el formato(%s) para este tipo de dato.%n", e.getFormatSpecifier());
        }
    }

    /**
     * Imprimir arreglo String[]
     *
     * @param data String[]. Arreglo de Strings.
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * String[] names = { "santiago", "Thiago", "Smith" };
     * w(names);
     * }
     * </pre>
     *
     * {@code SALIDA>> [santiago, Thiago, Smith]}
     *
     */
    public static void w(String[] data) {
        String res = "[" + String.join(", ", data) + "]";
        wln(res);
    }

    /**
     * Imprimir arreglo int[]
     *
     * @param data int[]. Arreglo de enteros
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * int[] numbers = { 1, 2, 3 };
     * w(numbers);
     * }
     * </pre>
     *
     * {@code SALIDA>> [1, 2, 3, ...]}
     *
     */
    public static void w(int[] data) {
        String res = "[";
        for (int d : data) {
            res += d + ", ";
        }
        res += "...]";
        wln(res);
    }

    /**
     * Imprimir arreglo float[]
     *
     * @param data float[]. Arreglo de flotantes
     *
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * float[] weights = { 1.3f, 2.3f, 3.1f };
     * w(weights);
     * }
     * </pre>
     *
     * {@code SALIDA>> [1.3, 2.3, 3.1, ...]}
     *
     */
    public static void w(float[] data) {
        String res = "[";
        for (float d : data) {
            res += d + ", ";
        }
        res += "...]";
        wln(res);
    }

    /**
     * Imprimir arreglo float[]
     *
     * @param data float[]. Arreglo de flotantes
     *
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * float[] weights = { 1.3, 2.3, 3.1 };
     * w(weights);
     * }
     * </pre>
     *
     * {@code SALIDA>> [1.3, 2.3, 3.1, ...]}
     *
     */
    public static void w(double[] data) {
        String res = "[";
        for (double d : data) {
            res += d + ", ";
        }
        res += "...]";
        wln(res);
    }

    /**
     * Imprimir arreglo char[]
     *
     * @param data char[]. Arreglo de caracteres
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * char[] letters = { 'S', 'R', 'M' };
     * w(letters);
     * }
     * </pre>
     *
     * {@code SALIDA>> [S, R, M, ...]}
     *
     */
    public static void w(char[] data) {
        String res = "[";
        for (char d : data) {
            res += d + ", ";
        }
        res += "...]";
        wln(res);
    }

    /**
     * Imprimir ArrayList (Elemento por elemento), en el formato [elemento 1,
     * elemento 2, elemento n, ...]
     *
     * @param array ArrayList, de cualquier tipo de dato.
     *
     * <p>
     * Ejemplo de uso:
     * </p>
     *
     * <pre>
     * {@code
     * ArrayList<String> names = new ArrayList<>();
     * names.add("SRM");
     * names.add("TRG");
     * wA(names);
     * }
     * </pre>
     *
     * {@code SALIDA>> [SRM, TRG, ...]}
     *
     */
    public static void w(ArrayList array) {
        String res = "[";
        for (int i = 0; i < array.size(); i++) {
            res += array.get(i) + ", ";
        }
        res += "...]";
        wln(res);
    }

}
