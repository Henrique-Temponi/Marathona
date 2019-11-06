import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Diagonal_Matriz
 */
public class Diagonal_Matriz {

    public static BufferedReader input;

    public static void println(Object x) { System.out.println(x);}

    public static int readInt() {
        
        int numero = 0;

        try {
            String inputIO = input.readLine();
            numero = Integer.parseInt(inputIO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return numero;
    }

    public static int[] readMultipleInt(int tamanho) {
        
        int[] numero = new int [tamanho];

        try {
            String[] inputIO = input.readLine().split("\\s");
            // println(Arrays.toString(inputIO));
            // println(Arrays.toString(numero));
            for (int i = 0; i < tamanho; i++) {
                numero[i] = Integer.parseInt(inputIO[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return numero;
    }

    public static void mostrarDiagonal(int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {      
        try {
            input = new BufferedReader( new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int tamanho = readInt();

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            matriz[i] = readMultipleInt(tamanho);
        }
        // println(Arrays.toString(matriz[0]));

        mostrarDiagonal(matriz);
    }
}