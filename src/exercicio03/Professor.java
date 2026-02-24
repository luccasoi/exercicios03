package exercicio03;

public class Professor {

    String nome;
    int toltaDeAulas;
    double valorDaAula;

    public double calcularSalario(){
        double salarioBase;
        double horaAtividade;
        double descansoSemanalal;

        salarioBase = toltaDeAulas * valorDaAula * 4.5;

        horaAtividade = salarioBase * 5 / 100;

        descansoSemanalal = (salarioBase + horaAtividade )/6;

        return salarioBase + horaAtividade + descansoSemanalal;
    }
}
