package exercicios;
//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca
// do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
// João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
// Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor
// da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de peixes do dia: ");
        double quiloDePeixe = sc.nextDouble();

        double kilosExcedentes = 0;
        double multa = 4;
        double valorTotal;

        if (quiloDePeixe > 50) {
            kilosExcedentes = quiloDePeixe - 50;
        }

        valorTotal = kilosExcedentes * multa;
        System.out.println("A quantidade de peixes que você pegou é: " + quiloDePeixe);
        System.out.println("A quantidade excedida é: " + kilosExcedentes);
        System.out.println("A valor total da multa é: " + valorTotal);


    }
}
