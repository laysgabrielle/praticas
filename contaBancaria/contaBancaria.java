public class contaBancaria{

    private int numeroConta;
    private String titular;
    private double saldo;

    public contaBancaria(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;      
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        if (deposito > 0){
            saldo += deposito ;
            System.out.println("Seu deposito é de: " + deposito);
        }
        else{
            System.out.println("valor invalido");
        }
    }

    public void exibirSaldo(){
        System.out.println("O titular da conta é: " + this.titular);
        System.out.println("O numero da conta é: " + this.numeroConta);
        System.out.println("O seu saldo é de: " + this.saldo);
        
    }
    
    




}