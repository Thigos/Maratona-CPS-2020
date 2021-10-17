import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.PrintWriter;

/**
 * @author hdblo
 */
public class Megasena {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // PrintWriter saida = new PrintWriter("megasena.sol");

        String linha = "";

        BufferedReader entrada;

        entrada = new BufferedReader(new InputStreamReader(System.in));

        String temp[];

        int dezenas[][] = new int[60][2];

        while ((linha = entrada.readLine()) != null) {

            if (linha.equals("0")) {
                break;
            }

            temp = linha.split(" ");

            for (int x = 2; x < 8; x++) {
                dezenas[Integer.parseInt(temp[x]) - 1][0] = Integer.parseInt(temp[x]);
                // System.out.println(" Dezenas: " + dezenas[Integer.parseInt(temp[x]) - 1][0]);
                dezenas[Integer.parseInt(temp[x]) - 1][1]++;
                // System.out.println(" Dezenas: " + dezenas[Integer.parseInt(temp[x]) - 1][1]);
            }
        }

        int dez[][] = new int[1][1];

        for (int x = 0; x < dezenas.length; x++) {
            boolean trocou = false;
            for (int y = 0; y < dezenas.length - 1; y++) {
                if (dezenas[y][1] < dezenas[y + 1][1]) {
                    trocou = true;
                    dez[0] = dezenas[y + 1];
                    dezenas[y + 1] = dezenas[y];
                    dezenas[y] = dez[0];
                }
            }
            if (!trocou) {
                break;
            }
        }

        int x = 1;

        for (int d[] : dezenas) {
            System.out.println(x + " " + d[0] + " " + d[1]);
            // saida.println(x + " " + d[0] + " " + d[1]);
            x++;
            // soma += d[1];
        }

        // saida.println(soma);
        entrada.close();
        // saida.close();
    }
}
