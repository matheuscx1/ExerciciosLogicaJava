//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//
//        (Ex: 5 anos, 2 meses e 15 dias de vida)

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int anoNascimento = teclado.nextInt();
        int anoAtual = data.getYear();
        int anos = anoAtual - anoNascimento;
        int meses = anos * 12;
        int dias = anos * 365;

        System.out.println(" Você já viveu " + anos + " anos " + meses + " meses " + dias + " dias " );

    }
}
