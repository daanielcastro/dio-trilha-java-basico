public class ContaTerminal {

    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(String agencia,int numeroConta,String nomeCliente,double saldo){
        if(agencia.equals(null))
            throw new IllegalArgumentException("Numero de agência inválido");
        if(numeroConta < 0)
            throw new IllegalArgumentException("Numero da conta inválido");
        if(nomeCliente.equals(null))
            throw new IllegalArgumentException("Nome inválido");
        if(saldo < 0)
            throw new IllegalArgumentException("Saldo inválido");
        
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void setSaldo(double s){
        if(s > 0)
            this.saldo+=s;
        else
        throw new IllegalArgumentException("Valor inválido");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    
    
}
