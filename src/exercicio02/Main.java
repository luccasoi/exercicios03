package exercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pacientes pacientes = new Pacientes();

        double[] alvo;

        System.out.print("Paciente: ");
        pacientes.nome = sc.next();

        System.out.print("Idade do Paciente: ");
        pacientes.idade = sc.nextInt();


        System.out.println("Frequencia Max = " + pacientes.frequenciaMaxima());

        alvo = pacientes.frequenciaAlvo();

        System.out.println("Inicio Frequencia Alvo = " + alvo [0] );
        System.out.println("Fim Frequencia Alvo = "+ alvo [1]);
    }


}
