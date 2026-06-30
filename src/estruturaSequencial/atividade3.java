//calculo da diferença com a,b,c,d
package estruturaSequencial;

import java.util.Scanner;

public class atividade3{
    public static void main(String [] args) throws Exception{

        int a,b,c,d;

        Scanner lg = new Scanner(System.in);
        a = lg.nextInt();
        b = lg.nextInt();
        c = lg.nextInt();
        d = lg.nextInt();

        int dif;
        dif = ((a*b) - c*d);

        System.out.println("Diferença: " + dif);
        lg.close();
    }

}