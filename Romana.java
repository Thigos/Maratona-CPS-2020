import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Romana {
		
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        ArrayList<String> numRomanos = new ArrayList();
        numRomanos.add("I");
        numRomanos.add("IV");
        numRomanos.add("V");
        numRomanos.add("IX");
        numRomanos.add("X");
        numRomanos.add("XL");
        numRomanos.add("L");
        numRomanos.add("XC");
        numRomanos.add("IC");
        numRomanos.add("C");
        numRomanos.add("ID");
        numRomanos.add("D");
        numRomanos.add("M");
        
        
        ArrayList<Integer> valores = new ArrayList();
        valores.add(1);
        valores.add(4);
        valores.add(5);
        valores.add(9);
        valores.add(10);
        valores.add(40);
        valores.add(50);
        valores.add(90);
        valores.add(99);
        valores.add(100);
        valores.add(499);
        valores.add(500);
        valores.add(1000);
        
        
        
        
        
        
        
		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {

                if (linha.equals("0")) {
                    break;
                }
                
                String temp[] = linha.split("\\+");
                int total = 0; 
                
                for(String letras : temp) {
                	if(numRomanos.contains(letras)) {
                		total += valores.get(numRomanos.indexOf(letras));
                	}else {
                		String anterior = "";
                		for (int i = 1; i <= letras.length(); i++) {
                			String letra = letras.substring(i-1, i);
                			//System.out.println("Letra: " + letra);
                			if(numRomanos.contains((anterior + letra)) && (anterior + letra).length() == 2){
                				
            					//System.out.println((anterior + letra));
            					total -= valores.get(numRomanos.indexOf((anterior))); //Remover o valor do anterior
            					total += valores.get(numRomanos.indexOf((anterior + letra))); //Somar o anterior - atual
                				
                				
                			}else {
                				total += valores.get(numRomanos.indexOf(letra));
                			}
                				//System.out.println(letra);
                    			
                			//}
                			
                			anterior = letra;
                		}
                	}
                	//System.out.println("Total Atual: " +total);
                }
                
                // total para romano
                String totalRom = "";
                //System.out.println(total);
                
                int tempTotal = total;
                for (int i = 12; i >= 0; i--) {
                	int val = valores.get(i);
                	//System.out.println(tempTotal + "/" + val + "=" + tempTotal/val);
                	for(int j = tempTotal/val; j > 0; j--) {
                		
                		totalRom += numRomanos.get(valores.indexOf(val));
                		tempTotal -= val;
                	}
                	
                }
                
                System.out.println(totalRom);
            }
            
            entrada.close();
		}catch (IOException e) {
			System.out.println(e.getMessage() + "     " + e.getClass());
		}
	}
		
		
	

}
