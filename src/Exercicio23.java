//21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da hora da aula");
        double horaAula = teclado.nextDouble();
        System.out.println("Digite o numero de aulas lecionadas");
        double aulasLecionadas = teclado.nextDouble();
        System.out.println("Digite o desconto do INSS");
        double inss = teclado.nextDouble();

        double salarioBruto = horaAula * aulasLecionadas;
        double valorDesconto = salarioBruto * (inss / 100);
        double salarioLiquido = salarioBruto - valorDesconto;

        System.out.println("Valor da hora da aula R$: " + horaAula);
        System.out.println("Numero de aulas Lecionadas " + aulasLecionadas);
        System.out.println("Salario bruto R$: " + salarioBruto);
        System.out.println("Desconto inss " + inss + " % ");
        System.out.println("Salario Liquido R$" + salarioLiquido);





    }
}
