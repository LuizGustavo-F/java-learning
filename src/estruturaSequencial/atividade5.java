package estruturaSequencial;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) throws Exception {
        
        Scanner lg = new Scanner(System.in);

               System.out.print("Insira ID, numero de peças e valor (PEÇA 1)");

        int id_1, numPeca1;
        Double valorPeca1;

        id_1 = lg.nextInt();
        numPeca1 = lg.nextInt();
        valorPeca1 = lg.nextDouble();

                System.out.print("Insira ID, numero de peças e valor (PEÇA 2)");

        int id_2, numPeca2;
        Double valorPeca2;

        id_2 = lg.nextInt();
        numPeca2 = lg.nextInt();
        valorPeca2 = lg.nextDouble();

        Double valorTotal;
        valorTotal = ((numPeca1 * valorPeca1)+(numPeca2 * valorPeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
        lg.close();
    }
}
