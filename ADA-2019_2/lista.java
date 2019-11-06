import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * lista
 */
public class lista {
    public static BufferedReader input;

    public static void println(Object x) { System.out.println(x);}

    public static String read() {
        String inpuut = null;

        try {
            inpuut = input.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return inpuut;
    }

    public static void main(String[] args) {
        

        try {
            input = new BufferedReader( new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Integer> lista = new ArrayList<>();

        String entrada = null;
        String op = null;
        String[] aux = null;
        entrada = read();
        while (entrada.compareTo("0") != 0) {
            if (entrada.contains("II ")) {
                op = entrada.replace("II ", "");
                lista.add(0, Integer.parseInt(op));
            }
            else if (entrada.contains("RI")){
                op = entrada.replace("RI", "");
                lista.remove(0);
            }
            else if (entrada.contains("IF ")){
                op = entrada.replace("IF ", "");
                lista.add(lista.size(), Integer.parseInt(op));
            }
            else if (entrada.contains("RF")){
                op = entrada.replace("RF", "");
                lista.remove(lista.size() - 1);
            }
            else if (entrada.contains("I ")){
                op = entrada.replace("I ", "");
                aux = op.split("\\s");
                lista.add(Integer.parseInt(aux[1]), Integer.parseInt(aux[0]));
            }
            else if (entrada.contains("R ")){
                op = entrada.replace("R ", "");
                aux = op.split("\\s");
                lista.remove((Integer.parseInt(aux[0])));
                
            }
            else if (entrada.contains("M")){
                for (Integer i : lista) {
                    System.out.print(i + " ");
                }
                System.out.print("\n");
            }

            //System.out.println( Arrays.toString(lista.toArray()));
            entrada = read();
        }
    }   
}