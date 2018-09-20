import java.io.*;

class myCodeMedia
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    //System.out.println(input);
    
    int n = Integer.parseInt(input);
    
    int valores[] = new int[n];
    
    int media=0;
    int soma=0;
    
    for(int i=0; i<n; i++) {
    	//System.out.println("Informe um valor inteiro:");
    	String input2 = br.readLine();
    	int aux = Integer.parseInt(input2);
    	valores[i] = aux;
    	soma = (soma + valores[i]);
    }
    
    	media = soma/n;
   
    System.out.println(media);
    
    
  }
}