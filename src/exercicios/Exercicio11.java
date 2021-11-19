package exercicios;
/*
Faça um Programa que peça a temperatura em graus Fahrenheit,
transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos graus está ai: ");
        double fahrenheit = sc.nextDouble();

        double celsius = 5 * ((fahrenheit - 32) / 9);
        System.out.println("A temperatura em graus é: " + celsius);

    }

}
