//calcular areas com base em medidas
package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.US);
        Scanner lg = new Scanner(System.in);

        System.out.print("Insira as medidas: ");
        Double a, b ,c;
        
        a = lg.nextDouble();
        b = lg.nextDouble();
        c = lg.nextDouble();
        
        double triangulo, raio, trapezio, quadrado, retangulo;
        triangulo = (a * c)/2;
        raio = 3.14159 * Math.pow(c, 2);
        trapezio = (((a + b) * c)/2);
        quadrado = b*b;
        retangulo = a*b;

        System.out.printf("\nTRIANGULO %.3f", triangulo);
        System.out.printf("\nRAIO %.3f", raio);
        System.out.printf("\nTRAPÉZIO %.3f", trapezio);
        System.out.printf("\nQUADRADO %.3f", quadrado);
        System.out.printf("\nRETANGULO %.3f", retangulo);
        lg.close();
    }
}
