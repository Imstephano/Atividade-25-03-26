/* EXERCÍCIO 6 FAÇA UM ALGORITMO QUE (LEIA CÓDIGO, CALCULE O VALOR A SER PAGO PELO CLIENTE
IMPRIMIR O VALOR A SER PAGO E IMPRIMIR O NOME DO PRODUTO) */

import java.util.Scanner;

public class Lanchonete{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = Sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = Sc.nextInt();

        String produto = "";
        double preco = 0.0;
/*
- O programa lê o código e a quantidade.
- Usa um switch para identificar o produto e seu preço.
- Calcula o valor total multiplicando o preço pela quantidade.
- Exibe o nome do produto e o valor final formatado
*/
        switch (codigo) {
            case 100:
                produto = "Cachorro Quente";
                preco = 1.20;
                break;
            case 101:
                produto = "Bauru Simples";
                preco = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preco = 1.50;
                break;
            case 103:
                produto = "Hambúrguer";
                preco = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
                Sc.close();
                return;
        }
        double total = preco * quantidade;

        System.out.println("Produto: " + produto);
        System.out.printf("Valor a ser pago: R$ %.2f%n", total);

        Sc.close();
    }
}