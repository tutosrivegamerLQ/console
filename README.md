# console [Code](code)

> **NOTA**: Los siguientes símbolos serán usados para mostrar la salida por consola.
>
> - \n = Salto de línea
>
> Es clarividente que el archivo [Console.java](code/Console.java) debe ponerse en un directorio donde usted pueda acceder a él fácilmente.

_Salida de información por consola_, **ahorrar** tiempo al escribir:

- **System.out.println()**
- **System.out.print()**
- **System.out.printf()**

Además, agregué la funcionalidad de imprimir arreglos de todo tipo (En cuanto a arreglos positivos se refiere).

> Es muy simple de usar y usé el mismo nombre del método para imprimir los datos para simplificar la escritiura.

Los métodos disponibles se describen a continuación:

## Métodos:

> - [wln(Object data)](#wlnobject-data)
> - [w(Object data)](#wobject-data)
> - [w(String str, Object ... data)](#wstring-str-object-data)
> - [w(String[] data)](#wstring-data)
> - [w(int[] data)](#wint-data)
> - [w(float[] data)](#wfloat-data)
> - [w(double[] data)](#wdouble-data)
> - [w(char[] data)](#wchar-data)
> - [w(ArrayList array)](#warraylist-array)

## wln(Object data) [métodos](#métodos)

> "Imprime" por **consola** el **Objeto** que se pasa por parámetro, más un salto de línea.

Parámetro (**data**):

Este parámetro es un **Objeto** cualquiera el cual en caso de no tener un **toString()** implementado por el usuario, la salida por consola será su nombre como **Objeto** (_[Ljava.lang.String;@5ecddf8f_, par el caso de un **String[]**)

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           String name = "Santiago";
> 4           wln(name);
> 5       }
> 6  }
> ```
>
> SALIDA>>
>
> ```python
> >>> Santiago \n
> >>>
> ```

## w(Object data) [métodos](#métodos)

> "Imprime" por **consola** el **Objeto** que se pasa por parámetro, SIN un salto de línea.

Parámetro (**data**):

Este parámetro es un **Objeto** cualquiera el cual en caso de no tener un **toString()** implementado por el usuario, la salida por consola será su nombre como **Objeto** (_[Ljava.lang.String;@5ecddf8f_, par el caso de un **String[]**)

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           String name = "Santiago";
> 4           w(name);
> 5       }
> 6  }
> ```
>
> SALIDA>>
>
> ```python
> >>> Santiago
> ```

## w(String str, Object... data) [métodos](#métodos)

> "Imprime" por **consola** una cadena de texto (_String_) formateada.

_Parámetro_ (**str**):

Cadena de texto (_String_) con sus respectivos carácteres de **formateo** (_%s_, _%d_, _%f_, e.t.c).

_Parámetro_ (...**data**):

Este parámetro (**_varargs_**) puede recibir distintios tipos de **Objetos**, claro, siempre y cuando correspondan con el tipo de dato según el **Carácter de Formateo** especificado en la cadena de texto (_String_)

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           String name = "Santiago";
> 4           w("Hello World %s.", name);
> 5       }
> 6  }
> ```
>
> SALIDA>>
>
> ```python
> >>> Hello World Santiago.
> ```

## w(String[] data) [métodos](#métodos)

> Agrega cada elemento del **arreglo** a una cadena de texto e "Imprime" por **consola** una cadena de texto (_String_) con un formato similar al de un **Array** (_[Elemento 1, Elemento 2, e.t.c.]_).

_Parámetro_ (**data**):

Este parámetro es un **arreglo** de tipo **String** (_Cadena de Texto_).

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           String[] names = {
> 4                         "Santiago", "Isabella",
> 5                          "Samuel", "Smith"
> 6                       };
> 7           w(names);
> 8      }
> 9 }
> ```
>
> SALIDA>>
>
> ```python
> >>> [Santiago, Isabella, Samuel, Smith]
> ```

## w(int[] data) [métodos](#métodos)

> Agrega cada elemento del **arreglo** a una cadena de texto e "Imprime" por **consola** una cadena de texto (_String_) con un formato similar al de un **Array** (_[Elemento 1, Elemento 2, e.t.c.]_).

_Parámetro_ (**data**):

Este parámetro es un **arreglo** de tipo **int** (_Entero_).

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           int[] numbers = {1, 2, 3, 4};
> 4           w(numbers);
> 5      }
> 6 }
> ```
>
> SALIDA>>
>
> ```python
> >>> [1, 2, 3, 4, ...]
> ```

## w(float[] data) [métodos](#métodos)

> Agrega cada elemento del **arreglo** a una cadena de texto e "Imprime" por **consola** una cadena de texto (_String_) con un formato similar al de un **Array** (_[Elemento 1, Elemento 2, e.t.c.]_).

_Parámetro_ (**data**):

Este parámetro es un **arreglo** de tipo **float** (_Flotante - Decimal_).

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           float[] numbers = {1.3f, 2.56f, 3.3f, 4.2f};
> 4           w(numbers);
> 5      }
> 6 }
> ```
>
> SALIDA>>
>
> ```python
> >>> [1.3, 2.56, 3.3, 4.2, ...]
> ```

## w(double[] data) [métodos](#métodos)

> Agrega cada elemento del **arreglo** a una cadena de texto e "Imprime" por **consola** una cadena de texto (_String_) con un formato similar al de un **Array** (_[Elemento 1, Elemento 2, e.t.c.]_).

_Parámetro_ (**data**):

Este parámetro es un **arreglo** de tipo **double** (_Flotante Doble Presición - Decimal_).

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           double[] numbers = {1.3, 2.56, 3.3, 4.2};
> 4           w(numbers);
> 5      }
> 6 }
> ```
>
> SALIDA>>
>
> ```python
> >>> [1.3, 2.56, 3.3, 4.2, ...]
> ```

## w(char[] data) [métodos](#métodos)

> Agrega cada elemento del **arreglo** a una cadena de texto e "Imprime" por **consola** una cadena de texto (_String_) con un formato similar al de un **Array** (_[Elemento 1, Elemento 2, e.t.c.]_).

_Parámetro_ (**data**):

Este parámetro es un **arreglo** de tipo **char** (_Caracter_).

> Ejemplo de uso:
>
> ```java
> 1   public class Main extends Console {
> 2       public static void main(String[] args){
> 3           char[] letters = {'S', 'R', 'M'};
> 4           w(letters);
> 5      }
> 6 }
> ```
>
> SALIDA>>
>
> ```python
> >>> [S, R, M, ...]
> ```

## w(ArrayList array) [métodos](#métodos)

> Agrega cada elemento del **arreglo** a una cadena de texto e "Imprime" por **consola** una cadena de texto (_String_) con un formato similar al de un **Array** (_[Elemento 1, Elemento 2, e.t.c.]_).

_Parámetro_ (**array**):

Este parámetro es un **arreglo - ArrayList** de tipo el cual admite los diferentes tipos de datos respecto al **ArrayList**.

> Ejemplo de uso:
>
> ```java
> 1   import java.util.ArrayList;
> 2   public class Main extends Console {
> 3       public static void main(String[] args){
> 4           ArrayList<Object> things = new ArrayList<>();
> 5
> 6           things.add("Santiago");
> 7           things.add(12);
> 8           things.add(12.5f);
> 9           things.add(23.4);
> 10          things.add('S');
> 11
> 12          w(things);
> 13     }
> 14 }
> ```
>
> SALIDA>>
>
> ```python
> >>> [Santiago, 12, 12.5, 23.4, S, ...]
> ```

# Nota:

Agradezco cualquier tipo de reporte **crítico**, ya sea de mejora o de errores (código redundante, bloques de código innecesarios, e.t.c).
