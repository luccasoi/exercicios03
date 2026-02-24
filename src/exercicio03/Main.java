package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor();

        professor.toltaDeAulas =  40;
        professor.valorDaAula = 220;

        System.out.println("salario do professor: " + professor.calcularSalario());
    }
}
