import java.io.*;
import java.util.Arrays;

class myCode
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String input = br.readLine();
    //System.out.println(input);
    
    String primeiraPalavra, segundaPalavra, terceiraPalavra;
    
    primeiraPalavra = br.readLine();
    segundaPalavra = br.readLine();
    terceiraPalavra = br.readLine();
    
    char[] a = primeiraPalavra.toCharArray();
    char[] b = segundaPalavra.toCharArray();
    char[] c = terceiraPalavra.toCharArray();
    
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);
    
    if (Arrays.equals(a, b) && Arrays.equals(b, c)) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
    
    
  }
}
