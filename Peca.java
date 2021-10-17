import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Peca {
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        int quant = 0;
        
		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {

                if (linha.equals("0")) {
                    break;
                }
                
                String temp[] = linha.split(" ");
                ArrayList<Integer> nums = new ArrayList();
                
                if(quant == 0) {
                	//primeiro
                	quant = Integer.parseInt(linha);
                	
                }else {
                	for(String num: temp) {
                		nums.add(Integer.parseInt(num));
                	}
                	
                	for(int i = 1; i <= quant; i++) {
                		
                		
                		if(!nums.contains(i)) {
                			System.out.println(i);
                		}
                		
                		
                		if(quant == i) {
                			quant = 0;
                		}
                	}
                }
            }
            
            entrada.close();
		}catch (Exception e) {
			System.out.println(e.getMessage() + "     " + e.getClass());
		}
	}
}
