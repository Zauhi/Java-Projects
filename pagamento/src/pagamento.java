import java.util.Scanner;
import java.util.Locale;

public class pagamento 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        String nome;
        double valorHora, pagamento;
        int horas;
        
        System.out.print("Nome: ");
        nome = sc.nextLine();
        
        System.out.print("Valor por hora: ");
        valorHora = sc.nextDouble();
        
        System.out.print("Horas trabalhadas: ");
        horas = sc.nextInt();
        
        pagamento = valorHora * horas;
        
        System.out.print("O pagamento para " + nome + " deve ser " + pagamento);
        
        sc.close();
    }
}