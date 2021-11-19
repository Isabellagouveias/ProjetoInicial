package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double valor;
        double porcentagem;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valor = sc.nextDouble();

        System.out.println("Digite a porcentagem de desconto: ");
        porcentagem = sc.nextDouble();

        double resultado = (valor * porcentagem) /100;
        double valorTotal = valor - resultado;
        System.out.println("O valor que o cliente irá pagar na mercadoria é: " + valorTotal);
    }
}
