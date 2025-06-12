import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tempo a ser percorrido ");
        int tempoPercorrido = teclado.nextInt();
        System.out.println("Digite a velocidade media ");
        int velocidadeMedia = teclado.nextInt();
        int distancia = tempoPercorrido * velocidadeMedia;
        int litrosUsados = distancia /12;
        System.out.println("Distancia percorrida " + distancia + "km");
        System.out.println("Litros usados " + litrosUsados + "L");


    }
}
