package ex33;

public class ContaBancaria {

    private int numeroDaConta;
    private String titular;
    private Double saldo;

    public void depositar(Double deposito){
        this.saldo += deposito;

    }

    public void sacar(Double saque){
        if (saldo >= saque){
            saldo =- saque;
        }



    }

    public void consultarSaldo(){


    }
}
