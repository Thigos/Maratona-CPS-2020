import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Naval {
	public static void main(String[] args) throws IOException {
		String linha = "";

        BufferedReader entrada;
        
        int quant = 0;
        int cont = 0;
        ArrayList<String> entradas = new ArrayList();
        ArrayList<String> coord = new ArrayList();
        
        entrada = new BufferedReader(new InputStreamReader(System.in));
        
        while ((linha = entrada.readLine()) != null) {

            if (linha.equals("0") || linha.equals("") ) {
                break;
            }
            
            String temp[] = linha.split(" ");
            
            if(quant == 0) {
            	quant = Integer.parseInt(temp[1]);
            	
            }else if(cont <= quant){
            	cont++;
            	//System.out.println(temp[0] + " " );

            	entradas.add(temp[0]);
            
            }else{
            	//System.out.println(temp[0] + " - temp0" );
            	coord.add(temp[0] + " " + temp[1]);
            	
            	
            }
        }
        
        for (String coordenada : coord) {
        	String tempCoord[] = coordenada.split(" ");
        	
        	String colum = entradas.get(Integer.parseInt(tempCoord[0])-1);
        	String navio = colum.substring(Integer.parseInt(tempCoord[1])-1,Integer.parseInt(tempCoord[1]));
        	//System.out.println(navio);
        	
        	if(navio.equals("A")) {
        		System.out.println("agua");
        	}else {
        		System.out.println("acertou");
        	}
        	
        }
        
        entrada.close();
	}
}
