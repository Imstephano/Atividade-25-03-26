/*EXERCÍCIO 1 CRIE UM ALGORTIMO QUE LEIA UM NÚMERO DE 1 A 7*/

import java.util.Scanner;

public class Algoritmo {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = Sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Digite um valor entre 1 e 7.");
        }

        Sc.close();
    }
}
