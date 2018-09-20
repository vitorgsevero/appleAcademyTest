
import java.io.*;

class MyCodeDiferencaValores {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		// System.out.println(input);

		int n = Integer.parseInt(input);

		int valores[] = new int[n];

		int diferenca = 0;
		int maior = 0;
		
		for(int i=0; i<n; i++) {
			String input2 = br.readLine();
			int elemento = Integer.parseInt(input2);
			valores[i] = elemento;
		}
		

		for (int j=0; j<n; j++) {
			for (int i=0; i<n-1; i++) {

				 if(valores[i]<valores[i+1]) {
				 diferenca = valores[i+1] - valores[i];	
				 	if(diferenca>maior) {
				 		maior = diferenca;
				 	}
				 } else if (valores[i] > valores[i + 1]) {
					diferenca = valores[i] - valores[i + 1];
					if (diferenca > maior) {
						maior = diferenca;
					}
				}
			}
		}

		System.out.println(maior);

	}
}