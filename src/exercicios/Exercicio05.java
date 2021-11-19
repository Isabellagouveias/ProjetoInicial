/*
  Pergunte quanto você ganha por hora
  Pergunte quantas horas trabalhadas no mês
  Calcule o sálario
  Mostre o sálario do mês
 */

package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double PorHora = sc.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês? ");
        double HorasTrabalhadas = sc.nextDouble();

        double SalarioCalculado = HorasTrabalhadas * PorHora;

        String TextoPSerExibido = "Salario do mês: " + SalarioCalculado;
        System.out.println(TextoPSerExibido);

    }
}
