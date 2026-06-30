package estruturaSequencial;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) throws Exception {

        Scanner lg = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        double x;
        x = lg.nextDouble();

        double area;
        area = (3.14159 * Math.pow(x, 2));

        System.out.printf("Área: %.4f%n", area);
    }

}
