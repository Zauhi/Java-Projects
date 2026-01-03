import java.util.Scanner;
import java.util.Locale;

public class circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double raio, area;
        
        System.out.print("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();
        
        area = Math.pow(raio, 2) * 3.14159;
        
        System.out.print("Área = " + String.format("%.3f", area));
        
        sc.close();
    }
}