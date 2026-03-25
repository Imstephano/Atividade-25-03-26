/* EXERCÍCIO 5 FAÇA UM ALGORITMO QUE RECEBA DOIS NÚMEROS(OPÇÃO E MENSAGEM) */

import java.util.Scanner;

public class OperacoesNumeros {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = Sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = Sc.nextDouble();

        System.out.print("Escolha a operação (M - média, S - subtração, P - produto, D - divisão): ");
        char opcao = Sc.next().toUpperCase().charAt(0);
/*
M → calcula a média dos números
S → calcula a diferença do maior pelo menor
P → calcula o produto
D → calcula a divisão do primeiro pelo segundo (com verificação de divisão por zero)
*/
        switch (opcao) {
            case 'M':
                double media = (num1 + num2) / 2;
                System.out.println("Média: " + media);
                break;

            case 'S':
                double diferenca = Math.abs(num1 - num2);
                System.out.println("Diferença entre o maior e o menor: " + diferenca);
                break;

            case 'P':
                double produto = num1 * num2;
                System.out.println("Produto: " + produto);
                break;

            case 'D':
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }
        Sc.close();
    }
}