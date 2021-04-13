import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n1=0, n2=1, n3=0, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME O NÚMERO QUE DESEJA VERIFICAR SE ESTÁ NA SEQUÊNCIA FIBONACCI: ");
		i=sc.nextInt();
		
		while(i>n3) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
		}
		
		if (i==0) {
			System.out.println("O NUMERO 0 ESTÁ NA SEQUÊNCIA DE FIBONACCI. \nO PRÓCIMO NÚMERO É 1");
		
		} else if (i==n3){
			System.out.println("O NÚMERO " + i + " ESTÁ NA SEQUÊNCIA DE FIBONACCI. \nO PRÓXIMO NÚMERO É: " + (n1+i));
			
		}else
			System.out.println("ESTE NÚMERO NÃO FAZ PARTE DA SEQUENCIA FIBONACCI");
		
		
	}

}
