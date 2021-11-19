package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double soma;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();

        System.out.println(calculaMedia(nota1, nota2, nota3, nota4));

    }

        public static double calculaMedia(double notaum, double notadois, double notatres, double notaquatro){
            double media = (notaum + notadois + notatres + notaquatro) /4;
            return media;
        }
}
