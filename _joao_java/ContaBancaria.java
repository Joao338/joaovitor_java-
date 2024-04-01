import java.util.ArrayList;
public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    
   
    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }
    
   
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
    
   
    public double consultarSaldo() {
        return saldo;
    }
    
    
    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta + "\nTitular: " + nomeTitular + "\nSaldo: R$" + saldo;
    }

    public static void main(String[] args) {
        // Exemplo de uso:
        ContaBancaria conta1 = new ContaBancaria(12345, "Vitor", 1000);
        System.out.println(conta1); // Chama automaticamente o método toString()
        
        conta1.depositar(500);
        System.out.println("Novo saldo após depósito: R$" + conta1.consultarSaldo());
        
        conta1.sacar(200);
        System.out.println("Novo saldo após saque: R$" + conta1.consultarSaldo());
    }
}