import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * maior_Valor
 */
public class maior_Valor {

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

    public static int[] readMultipleInt() {
        
        int[] numero = null;

        try {
            String[] inputIO = input.readLine().split("\\s");
            numero = new int [inputIO.length];

            if (numero != null)
                for (int i = 1; i < inputIO.length; i++) {
                    numero[i - 1] = Integer.parseInt(inputIO[i]);
                }
           
        } catch (Exception e) {
            e.printStackTrace();
        }

        return numero;
    }

    public static void main(String[] args) {
        
        try {
            input = new BufferedReader( new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Integer> list = new ArrayList<>();
        int[] line = readMultipleInt();
        while (!(line.length == 1 && line[0] == 0)){
            
            Arrays.sort(line);
            list.add(line[line.length - 1]);
            line = readMultipleInt();
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}