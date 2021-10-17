import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palin {
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        
        
		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {

                if (linha.equals("0")) {
                    break;
                }
                
                String num = Integer.toString(Integer.parseInt(linha), 2);
                String numInverso = "";
                for (int i = num.length(); i >= 1; i--) {
                	numInverso += num.substring(i-1, i);
                }
                if(numInverso.equals(num)) {
                	System.out.println("V");
                }else {
                	System.out.println("F");
                }
            }
            
            entrada.close();
		}catch (Exception e) {
			System.out.println(e.getMessage() + "     " + e.getClass());
		}
	}
}
