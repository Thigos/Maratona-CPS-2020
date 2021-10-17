import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Moeda {
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        int quantEntradas = 0;
        double moedasFlinstons[] = {50.00, 10.00, 5.00, 1.00};
        ArrayList<Integer> valores = new ArrayList();
        
        boolean prim = true;
        int count = 1;
        
		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {
            	
            	
                if(!prim) {
                	int val = Integer.parseInt(linha);
                	
                	//System.out.println(val);
                	int quant50 = 0;
                	int quant10 = 0;
                	int quant5 = 0;
                	int quant1 = 0;
                	
                	if(val/50 >= 1) {
                		quant50 = val/50;
                		val = val%50;
                	}
                	if(val/10 >= 1) {
                		quant10 = val/10;
                		val = val%10;
                	}
                	if(val/5 >= 1) {
                		quant5 = val/5;
                		val = val%5;
                	}
                	if(val/1 >= 1) {
                		quant1 = val/1;
                		val = val%1;
                	}
                	
                	System.out.println("Caso de Teste "+count+": "+ quant50 + " " + quant10 + " " + quant5 + " " + quant1);
                    	
                	count++;
                	
                	
                }else {
                	prim = false;
                	quantEntradas = Integer.parseInt(linha);
                	//System.out.println(quantEntradas);
                }
                
                
                if (count > quantEntradas) {
            		//System.out.println(count);
            		//System.out.println(quantEntradas);
            		break;
                }
                
                
                
            }//Fim while

            
            
            entrada.close();
		}catch (Exception e) {
			System.out.println(e.getMessage() + "     " + e.getClass());
		}
		
	}
}
