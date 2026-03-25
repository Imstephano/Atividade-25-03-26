/* EXERCÍCIO 4 UM FUNCIONÁRIO RECEBERÁ AUMENTO DE ACORDO COM SEU PLANO DE TRABALHO. */

import java.util.Scanner;

public class Funcionário {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Digite o plano de trabalho (A, B, ou C): ");
        char plano = Sc.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário atual: ");
        double salario = Sc.nextDouble();
        
        double novoSalario;
/*
Plano A = Aumento de 10%
Plano B = Aumento de 15%
Plano C = Aumento de 20%
*/
        switch (plano) {
            case 'A':
                novoSalario = salario * 1.10;
                break;
            case 'B':
                novoSalario = salario * 1.15;
                break;
            case 'C':
                novoSalario = salario * 1.20;
                break;
            default:
                System.out.println("Plano inválido.");
                Sc.close();
                return;
        }
        System.out.println("Novo salário: R$ " + novoSalario);

        Sc.close();
    }
}
