import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, maisVelho;
		
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		maisVelho = 0;
		for (int i = 1; i < n; i++) {
			if (idade[maisVelho] < idade[i]) {
				maisVelho = i;
			}
		}
		System.out.println("Pessoa mais velha: " + nome[maisVelho]);
		
		sc.close();
	}

}
