import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Anagrama {
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        
        
		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {

                if (linha.equals("0")) {
                    break;
                }
                
                long total = 0;
                String anagramas[] = linha.split(" ");
                String palavraPrim = anagramas[0];
                ArrayList<String> letrasPrim = new ArrayList();
                
                for (int i = 1; i <= palavraPrim.length(); i++) {
            		letrasPrim.add(palavraPrim.substring(i-1, i));
            	}
                
                for (int i = 1; i < anagramas.length; i++) {                		
                	int count = 0;
                	ArrayList<String> backup = new ArrayList();
                	backup.addAll(letrasPrim);
                	String anagrama = anagramas[i];
                	for (int j = 1; j <= anagrama.length(); j++) {
                		String letra = anagrama.substring(j-1, j);
                		if(backup.contains(letra)) {
                			backup.remove(letra);
                			//System.out.println(backup + "		" + letra);
                			count++;
                		}
                		
                	}
                	if(count >= anagrama.length()) {
                		total++;
                	}
                }
                
                System.out.println(total);
            }
            
            entrada.close();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a leitura!\n" + e + e.getLocalizedMessage());
        }
	}
}
