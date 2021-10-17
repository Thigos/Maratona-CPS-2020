import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Media {
	public static void main(String[] args) {
		String linha = "";

        BufferedReader entrada;
        
        
        
		try {
            entrada = new BufferedReader(new InputStreamReader(System.in));
            
            while ((linha = entrada.readLine()) != null) {

                if (linha.equals("0")) {
                    break;
                }
                //= D1 + D2 + D3 + (A11 + A12) / 2 + (A21 + A22 + A23) / 3
                //: D1, D2,D3, A11, A12, A21, A22, A23
                String temp[] = linha.split(" ");
                
                int d1 = Integer.parseInt(temp[0]);
                int d2 = Integer.parseInt(temp[1]);
                int d3 = Integer.parseInt(temp[2]);
                int a11 = Integer.parseInt(temp[3]);
                int a12 = Integer.parseInt(temp[4]);
                int a21 = Integer.parseInt(temp[5]);
                int a22  = Integer.parseInt(temp[6]);
                int a23 = Integer.parseInt(temp[7]);
                
                int media = (int)((d1+d2+d3+(a11+a12)/2) + ((a21+a22+a23)/3));
                
                if(media >= 60) {
                	System.out.println("Aluno aprovado com nota: " + media);
                }else{
                	System.out.println("Aluno reprovado com nota: " + media);
                }
                
            }
            
            entrada.close();
		}catch (Exception e) {
			System.out.println(e.getMessage() + "     " + e.getClass());
		}
	}
}
