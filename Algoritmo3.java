/* EXERCÍCIO 3 FAÇA UM ALGORITMO QUE LEIA O PERÍODO EM QUE UM ALUNO ESTUDA */

import java.util.Scanner;

public class Algoritmo3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
    
    System.out.print("Digite o período em que você estuda (M/V/N): ");
    char periodo = Sc.next().toUpperCase().charAt(0);

    switch (periodo) {
        case 'M':
            System.out.println("Bom dia");
            break;
        case 'V':
            System.out.println("Boa Tarde");
            break;
        case 'N':
            System.out.println("Boa Noite");
            break;
        default:
            System.out.println("Opção inválida. Digite M, V ou N.");
    }
    Sc.close();
    }
}
