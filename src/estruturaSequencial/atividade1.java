package estruturaSequencial;
//leitura e soma de dois valores inteiros
import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) throws Exception {
        Scanner lg = new Scanner(System.in);

        int x;
        x = lg.nextInt();
         int y;
        y = lg.nextInt();

        System.out.println("Soma: " + (x+y));
lg.close();
    }
}
