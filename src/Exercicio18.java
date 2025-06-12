//18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.


public class Exercicio18 {
    public static void main(String[] args) {
        int anos = 0;
        int francisco = 150;
        int sara = 110;
       while(sara <= francisco){
           sara += 3;
           francisco += 2;
           anos ++;
       }
        System.out.println(sara);
        System.out.println(francisco);
        System.out.println(anos);
    }
}
