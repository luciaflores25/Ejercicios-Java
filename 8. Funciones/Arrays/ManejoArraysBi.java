package matematicas;

public class ManejoArraysBi {

  /**
   * Genera un array bidimensional de tamaño [fila][columna] con números
   * aleatorios cuyo intervalo (mínimo y máximo) también se indica como
   * parámetro.
   *
   * @param fila número entero que indica el tamaño de las filas del array
   * @param columna número entero que indica el tamaño de las columnas del array
   * @param minimo número entero que indica el intervalo mínimo del array
   * @param maximo número entero que indica el intervalo máximo del array
   * @return devuelve el array generado
   */
  public static int[][] generaArrayBiInt(int fila, int columna, int minimo, int maximo) {

    int[][] x = new int[fila][columna];

    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        x[i][j] = ((int) (Math.random() * ((maximo - minimo)) + 1 + minimo));
      }
    }
    return x;
  }

  /**
   * Genera un array bidimensional de tamaño [fila][columna] de números
   * aleatorios
   *
   * @param fila número entero que indica el tamaño de las filas del array
   * @param columna número entero que indica el tamaño de las columnas del array
   * @return devuelve el array generado
   */
  public static int[][] generaArrayBiInt(int fila, int columna) {

    int[][] x = new int[fila][columna];

    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        x[i][j] = ((int) (Math.random() * 10));
      }
    }
    return x;
  }

  /**
   * Muestra un array bidimensional previamente generado que se pasa como
   * parámetro
   *
   * @param a array bidimiensional de números enteros
   */
  public static void muestraArrayBiInt(int a[][]) {

    for (int i = 0; i < a.length; i++) {
      System.out.print("Fila: " + i);
      for (int j = 0; j < a[0].length; j++) {
        System.out.printf("%10d ", a[i][j]);

      }
      System.out.println();
    }
  }

  /**
   * Devuelve una fila (array unidimensional) de un array bidimensional que se
   * pasa como parámetro.
   *
   * @param x array bidimiensional de números enteros
   * @param numFila número de la fila que se quiere extraer del array
   * @return devuelve la fila en forma de array unidimensional
   */
  public static int[] filaDeArrayBiInt(int x[][], int numFila) {
    int[] fila = new int[x[0].length];

    for (int columna = 0; columna < x[0].length; columna++) {
      fila[columna] = x[numFila][columna];
    }

    return fila;
  }

  /**
   * Devuelve una columna (array unidimensional) de un array bidimensional que
   * se pasa como parámetro.
   *
   * @param x array bidimiensional de números enteros
   * @param numColumna número de la columna que se quiere extraer del array
   * @return columna en forma de array unidimensional
   */
  public static int[] columnaDeArrayBiInt(int x[][], int numColumna) {
    int[] columna = new int[x.length];

    for (int fila = 0; fila < x.length; fila++) {
      columna[fila] = x[fila][numColumna];
    }

    return columna;
  }

  /**
   * Devuelve la fila y la columna de la primera ocurrencia de un número dentro
   * de un array bidimensional. Si el número no se encuentra en el array, la
   * función devuelve -1.
   *
   * @param x array bidimiensional de números enteros
   * @param n número que se buscará dentro del array
   * @return devuelve las coordenadas de n o (-1,-1) si el número a buscar no se
   * encuntra en el array
   */
  public static int[] coordenadasEnArrayBiInt(int x[][], int n) {
    for (int fila = 0; fila < x.length; fila++) {
      for (int columna = 0; columna < x[0].length; columna++) {
        if (x[fila][columna] == n) {
          int[] coordenadas = {fila, columna};
          return coordenadas;
        }
      }
    }
    int[] coordenadas = {-1, -1};
    return coordenadas;
  }

  /**
   * Dice si un número que se encuentra en una posición determinada de una
   * matriz (un array bidimensional) que se pasa como parámetro es o no punto de
   * silla.
   * <p>
   * El punto de silla cumple la condición de ser el mínimo en su fila y máximo
   * en su columna.
   *
   * @param x array bidimiensional de números enteros
   * @param i fila dentro del array <code>x</code>
   * @param j columna dentro del array <code>x</code>
   * @return verdadero si el número que se encuentra en la fila <code>i
   * </code> y la columna <code>j</code> es el mínimo en su fila y el máximo en
   * su columna.
   */
  public static boolean esPuntoDeSilla(int x[][], int i, int j) {

    int[] fila = filaDeArrayBiInt(x, i);
    int[] columna = columnaDeArrayBiInt(x, j);

    return ((ManejoArrays.minimoArrayInt(fila) == x[i][j])
            && (ManejoArrays.maximoArrayInt(columna) == x[i][j]));
  }

  /**
   * Devuelve un array que contiene una de las diagonales del array
   * bidimensional que se pasa como parámetro.
   *
   * @param x, array bidimiensional de números enteros
   * @param fila, fila del número que marcará las dos posibles diagonales dentro del array
   * @param columna, columna del número que marcará las dos posibles diagonales dentro del array
   * @param direccion, indica cuál de las dos posibles diagonales se devolverá 
   * @return devuelve un array unidimensional con los elementos de la diagonal
   */
  public static int[] diagonal(int x[][], int fila, int columna, String direccion) {

    int elementos = 0, i, j;
    int[] diagonalAux = new int[1000];

    for (i = 0; i < x.length; i++) {
      for (j = 0; j < x[0].length; j++) {
        if ((((columna - j) == (fila - i)) && (direccion.equals("nose")))
                || (((columna - j) == (i - fila)) && (direccion.equals("neso")))) {
          diagonalAux[elementos++] = x[i][j];
        }
      }
    }

    int[] diagonal = new int[elementos];
    for (j = 0; j < elementos; j++) {
      diagonal[j] = diagonalAux[j];
    }

    return diagonal;
  }
  
  /**
   * Devuelve el valor máximo de un array bidimensional que se pasa como
   * parámetro.
   * 
   * @param x array bidimiensional de números enteros
   * @return  número máximo encontrado en el array
   */
  public static int maximoArrayBiInt(int x[][]) {
    int maximo = Integer.MIN_VALUE;
    
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        if (x[f][c] > maximo) {
          maximo = x[f][c];
        }
      }
    }  

    return maximo;
  }
  
  /**
   * Devuelve el valor mínimo de un array bidimensional que se pasa como
   * parámetro.
   * 
   * @param x array bidimiensional de números enteros
   * @return  número máximo encontrado en el array
   */
  public static int minimoArrayBiInt(int x[][]) {
    int minimo = Integer.MAX_VALUE;
    
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        if (x[f][c] < minimo) {
          minimo = x[f][c];
        }
      }
    }  

    return minimo;
  }
}
