/*Desenvolva um algoritmo em Java que leia um número inteiro
 e exiba esse numero - 1 */

package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Número inteiro: ");
        int numeroInt = sc.nextInt();

        int subtracao = -1;
        int numeroCorreto = numeroInt + subtracao;

        System.out.println("O número inteiro é: " + numeroCorreto);

    }
}
