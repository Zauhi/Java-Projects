import java.util.Scanner;
import java.util.Locale;

public class troco
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double preco, recebido, troco;
        int qtd;
        
        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();
        
        System.out.print("Quantidade comprada: ");
        qtd = sc.nextInt();
        
        System.out.print("Dinheiro recebido: ");
        recebido = sc.nextDouble();
        
        troco = recebido - qtd * preco;
        
        System.out.print("Troco = " + String.format("%.2f", troco));
        
        sc.close();
    }
}