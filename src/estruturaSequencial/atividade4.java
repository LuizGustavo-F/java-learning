//calcular salario com base em horas de trabalho
package estruturaSequencial;
import java.util.Scanner;

public class atividade4 {
    public static void main(String [] args) throws Exception{

        Scanner lg = new Scanner(System.in);

        System.out.println("Insira ID funcionario, horas trabalhadas e o ganho por hora: ");
        int id, horas;
        double sal;
        
        id = lg.nextInt();
        horas = lg.nextInt();
        sal = lg.nextDouble();

        double horasTrabalho;
        horasTrabalho = horas * sal; 

        System.out.printf("ID: " + id + "\nSalário: %.2f", horasTrabalho);

        lg.close();
    }

}
