import java.util.Scanner;

public class glicose
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	    double glicose;
	    
	    System.out.print("Digite a medida da glicose: ");
	    glicose = sc.nextDouble();
	    
	    if (glicose <= 100) {
	        System.out.print("Classificação: normal");
	    }
	    else if (glicose <= 140) {
	        System.out.print("Classificação: elevado");
	    }
	    else {
	        System.out.print("Classificação: diabetes");
	    }
	    
	    sc.close();
	}
}