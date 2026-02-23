package exercicio01;

public class Conta {

        //Atributos ou propiedades ou variaveis de instacias

        String correntista;
        int numero;
        double saldo;

        //metodo para depositar na conta

        public void  depositar (double valor){
            saldo += valor;
        }

        //metodo para sacar na conta

        public void  sacar (double valor){
        saldo -= valor;
    }
}
