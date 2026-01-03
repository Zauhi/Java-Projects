import java.util.Scanner;
import java.util.Locale;

public class media_ponderada
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
		int n;
		double x, y, z, media;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		    System.out.println("Digite três números:");
		    x = sc.nextDouble();
		    y = sc.nextDouble();
		    z = sc.nextDouble();
		    media = (x * 2 + y * 3 + z * 5) / 10;
		    System.out.println("Média = " + String.format("%.1f", media));
		}
		sc.close();
	}
}