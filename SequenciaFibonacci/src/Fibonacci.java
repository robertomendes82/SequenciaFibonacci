import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n1=0, n2=1, n3=0, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INFORME O N�MERO QUE DESEJA VERIFICAR SE EST� NA SEQU�NCIA FIBONACCI: ");
		i=sc.nextInt();
		
		while(i>n3) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
		}
		
		if (i==0) {
			System.out.println("O NUMERO 0 EST� NA SEQU�NCIA DE FIBONACCI. \nO PR�CIMO N�MERO � 1");
		
		} else if (i==n3){
			System.out.println("O N�MERO " + i + " EST� NA SEQU�NCIA DE FIBONACCI. \nO PR�XIMO N�MERO �: " + (n1+i));
			
		}else
			System.out.println("ESTE N�MERO N�O FAZ PARTE DA SEQUENCIA FIBONACCI");
		
		
	}

}
