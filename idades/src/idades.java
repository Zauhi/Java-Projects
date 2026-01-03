import java.util.Scanner;
import java.util.Locale;

public class idades 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        String nome1, nome2;
        int idade1, idade2;
        
        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextInt();
        
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextInt();
        
        double media = (idade1 + idade2) / 2.0;
        
        System.out.print("A idade média de " + nome1 + " e " + nome2 + " é de " + String.format("%.1f", media) + " anos");
        
        sc.close();
    }
}