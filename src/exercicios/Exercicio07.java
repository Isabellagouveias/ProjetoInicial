/* Faça um algorítimo que receba o valor que o usuário quer guardar por mês,
mostre o quanto ele vai ter em um ano */

package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dinheiro guardado por mês: ");
        float guardadoMes = sc.nextFloat();

        float emUmAno = guardadoMes * 12;

        System.out.println("O dinheiro guardado é: " + emUmAno);

    }
}
