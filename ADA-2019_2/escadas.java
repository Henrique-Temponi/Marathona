import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * escadas
 */
public class escadas {

    public static BufferedReader input;
    public static boolean stop = false;

    public static void println(Object x) { System.out.println(x);}

    public static String read() {
        String inut = null;

        try {
            inut = input.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return inut;
    }

    public static int readInt() {
        
        int numero = 0;

        try {
            String inputIO = input.readLine();
            
            if (inputIO.compareTo("FIM") == 0) {
                stop = true;
                return -1;
            }

            numero = Integer.parseInt(inputIO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return numero;
    }

    public static int[] readMultipleInt(int tamanho) {
        
        int[] numero = null;

        if ( tamanho > 0){
            numero = new int [tamanho];

            try {
                String[] inputIO = input.readLine().split("\\s");

                if (numero != null)
                    for (int i = 0; i < inputIO.length; i++) {
                        numero[i] = Integer.parseInt(inputIO[i]);
                    }
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return numero;
    }

    public static void escadinha(int[] elementos) {
        
        if (elementos == null) return;

        int diferenca = 0;
        int diferencaPassada = 0;
        int maiorDiff = -1;

        for (int i = 0; i < elementos.length - 1; i++) {
            
            diferencaPassada = diferenca;
            diferenca =  elementos[i + 1] - elementos[i];
            

            // println(elementos[i-1]);
            // println(elementos[i]);
            // // println(elementos[i+1]);
            // println(diferencaPassada);
            // println(diferenca);

            if ( diferencaPassada == diferenca && diferenca > maiorDiff) {
                maiorDiff = diferenca;
            }


            // if (maiorDiff < diferenca) {
            //     maiorDiff = diferenca;
            // }
        }

        if (maiorDiff <= 0){
            maiorDiff = 1;
        }

        println(maiorDiff);
    }

    public static void main(String[] args) {
        
        try {
            input = new BufferedReader( new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int tamanho = 0;
        int [] valores = null;

        while (!stop){

            tamanho = readInt();
            valores = readMultipleInt(tamanho);

            escadinha(valores);
        }
    }
}