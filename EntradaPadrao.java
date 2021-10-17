import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EntradaPadrao {
	
	
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        
        
		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {

                if (linha.equals("0")) {
                    break;
                }
            }
            
            entrada.close();
		}catch (Exception e) {
			System.out.println(e.getMessage() + "     " + e.getClass());
		}
	}
	
	
}
