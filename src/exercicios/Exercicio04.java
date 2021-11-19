package exercicios;

import java.util.Scanner;

class Exercicio04 {

    public static void main(String[] args) {
        System.out.print("Escreva o valor do raio: ");
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = Math.PI * raio * raio;

        System.out.print("O valor da area é" + " " + area);
    }


}
