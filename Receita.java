import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Receita {
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        boolean primeiro = true;
        int dias = 0;
        int quantBM = 0;
        int quantBC = 0;
        int quantBCH = 0;

		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {

                if (linha.equals("0")) {
                    break;
                }
                
                String temp[] = linha.split(" ");
                
                if(!primeiro) {
                	quantBM += Integer.parseInt(temp[0]);
                	quantBC += Integer.parseInt(temp[1]);
                	quantBCH += Integer.parseInt(temp[2]);
                }else {
                	dias = Integer.parseInt(temp[0]);
                	primeiro = false;
                }
                
            }
            
            // Total
            int milho = (quantBM*200)/1000;
            int oleo = ((quantBM*200) + (quantBC*120) + (quantBCH*240))/1000;
            int acucar = ((quantBM*250) + (quantBC*360) + (quantBCH*160))/1000;
            int fuba = ((quantBM*200) + (quantBC*0) + (quantBCH*0))/1000;
            int ovo = ((quantBM*4) + (quantBC*4) + (quantBCH*2));
            int fTrigo = ((quantBM*15) + (quantBC*240) + (quantBCH*240))/1000;
            int cocoRal = ((quantBM*15) + (quantBC*100) + (quantBCH*0))/1000;
            int ferm = ((quantBM*5) + (quantBC*10) + (quantBCH*15))/1000;
            int leiteCoco = ((quantBM*0) + (quantBC*200) + (quantBCH*0))/1000;
            int chococ = ((quantBM*0) + (quantBC*0) + (quantBCH*90))/1000;
            int leite = ((quantBM*0) + (quantBC*0) + (quantBCH*240))/1000;
            
            System.out.println("1 Milho verde " + milho + "Kg");
            System.out.println("2 Oleo vegetal " + oleo + "L");
            System.out.println("3 Acucar " + acucar + "Kg");
            System.out.println("4 Fuba " + fuba + "Kg");
            System.out.println("5 Ovos " + ovo);
            System.out.println("6 Farinha de trigo " + fTrigo + "Kg");
            System.out.println("7 Coco ralado " + cocoRal + "Kg");
            System.out.println("8 Fermento em po " + ferm + "Kg");
            System.out.println("9 Leite de coco " + leiteCoco + "L");
            System.out.println("10 Chocolate em po " + chococ + "Kg");
            System.out.println("11 Leite " + leite + "L");
            
            entrada.close();
		}catch (Exception e) {
			System.out.println(e.getMessage() + "     " + e.getClass());
		}
	}
}
