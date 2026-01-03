import java.util.Scanner;
import java.util.Locale;

public class retangulo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double base, altura, area, perimetro, diagonal;
        
        System.out.print("Base do retângulo: ");
        base = sc.nextDouble();
        
        System.out.print("Altura do retângulo: ");
        altura = sc.nextDouble();
        
        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        
        System.out.println("Área = " + String.format("%.4f", area));
        System.out.println("Perímetro = " + String.format("%.4f", perimetro));
        System.out.println("Diagonal = " + String.format("%.4f", diagonal));
        
        sc.close();
    }
}