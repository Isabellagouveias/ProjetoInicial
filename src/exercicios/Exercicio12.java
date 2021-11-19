package exercicios;

/* Verifique se o cpf é válido */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito1;
        int digito2;
        System.out.println("Digite o seu cpf: ");
        String cpf = sc.next();

        String[] nCpf = cpf.split("");
        int numero1 = Integer.parseInt(nCpf[0]);
        int numero2 = Integer.parseInt(nCpf[1]);
        int numero3 = Integer.parseInt(nCpf[2]);
        int numero4 = Integer.parseInt(nCpf[3]);
        int numero5 = Integer.parseInt(nCpf[4]);
        int numero6 = Integer.parseInt(nCpf[5]);
        int numero7 = Integer.parseInt(nCpf[6]);
        int numero8 = Integer.parseInt(nCpf[7]);
        int numero9 = Integer.parseInt(nCpf[8]);
        int numero10 = Integer.parseInt(nCpf[9]);
        int numero11 = Integer.parseInt(nCpf[10]);

        int soma = (numero1 * 10) + (numero2 * 9) + (numero3 * 8) + (numero4 * 7) + (numero5 * 6) + (numero6 * 5) + (numero7 * 4) + (numero8 * 3) + (numero9 * 2);

        int resto = soma % 11;

        if (resto == 0 || resto == 1) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        int soma2 = (numero1 * 11) + (numero2 * 10) + (numero3 * 9) + (numero4 * 8) + (numero5 * 7) + (numero6 * 6) + (numero7 * 5) + (numero8 * 4) + (numero9 * 3) + (digito1 * 2);

        int resto2 = soma2 % 11;
        if (resto2 == 0 || resto2 == 1) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto2;
        }

        if(numero10 == digito1 && numero11 == digito2) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }
}
