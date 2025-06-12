//12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//
//pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//
//
//
//Tabela de Código de Condições de Pagamento
//
//
//
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
//
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%


import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String produto = teclado.next();
        System.out.println("Digite o valor a ser pago no produto");
        double valorProduto = teclado.nextDouble();
        System.out.println("Valor do " + produto + " é " + valorProduto);
        System.out.println("Digite sua opção:");
        System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println(" 2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println(" 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println(" 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        String opcao = teclado.next();;
        double aVista = valorProduto * 0.15;
        double aVistaCartao = valorProduto * 0.10;
        double parceladoDois = valorProduto / 2;
        double parceladoTresMais = valorProduto * 0.10;
        if (opcao.equals("1")){
            System.out.println("O valor a pagar é: " + (valorProduto - aVista));
        }else if(opcao.equals("2")){
            System.out.println("O valor a pagar é: " + (valorProduto - aVistaCartao));
        }else if(opcao.equals("3")){
            System.out.println("O valor a pagar é: " + valorProduto + " Parcelado em 2x de " + parceladoDois);
        }else {
            System.out.println("O valor a pagar é: " + (valorProduto + parceladoTresMais));
        }

    }
}
