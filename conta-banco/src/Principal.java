import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        int numero;
        double saldo;
        String nome,agencia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Terminal Bancário, bom dia :)\n\n");
        System.out.println("Digite o nome:");
        nome = sc.nextLine();
        System.out.println("Digite o numero da conta");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a agência");
        agencia = sc.nextLine();
        System.out.println("Digite o saldo da conta");
        saldo = sc.nextDouble();

        ContaTerminal conta1 = new ContaTerminal(agencia, numero, nome, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f "+
        "já está disponível para saque\n",conta1.getNomeCliente(),conta1.getAgencia(),conta1.getNumeroConta(),conta1.getSaldo());

        


        
                
    }
}
