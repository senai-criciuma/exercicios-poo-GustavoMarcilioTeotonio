package ex41;

public class ContaCorrente extends ContaBancaria{

    //possui limite de saque diário

    private Double saldo;

    public void sacarDinheiro(Double saque){
        System.out.println("Limite de saque: R$ 5.000,00 ");
        if (saldo >= saque){
            if (saque <= 5000){
                System.out.println("Saque bem sucedido!");

            }else {
                System.out.println("Limite ultrapassado");
            }

        }else{
            System.out.println("Saldo insuficiente!!");
        }
    }

}
