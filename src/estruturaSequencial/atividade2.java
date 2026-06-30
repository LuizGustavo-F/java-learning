//retornar a area de um circulo com base no raio
package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner lg = new Scanner(System.in);

        double x;
        x = lg.nextDouble();

        double area;
        area = (3.14159 * Math.pow(x, 2));
        System.out.printf("Área: %.4f%n", area);
        lg.close();
    }

}
