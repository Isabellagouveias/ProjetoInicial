/* Faça um programa que pergunte quantas horas você trabalha
        e o número de horas trabalhadas no mês
        Calcule e mostre o sálario referido ao mês
        11 % para o imposto de Renda
        8 % para o INSS
        5% para o Sindicato */

package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double PorHora = sc.nextDouble();

        System.out.println("Quantas horas trabalhadas no mês? ");
        double HorasTrabalhadas = sc.nextDouble();

        double valorTotal = PorHora * HorasTrabalhadas;

        double inss = valorTotal * 8.0 / 100;

        double impostoRenda = valorTotal * 11.0 / 100;

        double sindicato = valorTotal * 5.0 / 100;

        double descontos = inss + impostoRenda + sindicato;

        double salarioTotal = valorTotal - descontos;

        String TextoPSerExibido = "Salario do mês: " + salarioTotal;
        System.out.println("Desconto do Inss: " + inss);
        System.out.println("Desconto do Imposto de Renda: " + impostoRenda);
        System.out.println("Desconto do Sindicato: " + sindicato);
        System.out.println(TextoPSerExibido);
    }
}

