package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();


        System.out.println(soma(a, b,"Isa", 5));


    }

    public static int soma(int banana, int arroz, String Isa, int you) {
            return banana * arroz;


        }

}
