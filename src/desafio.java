import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Killiam King";
        String tipoConta = "Corrente";
        double saldo = 3000.00;
        int opcao = 0;

//Dados do cliente
        System.out.println("-------------------------------------");
        System.out.println("\nBEM VINDO AO BANCO, SEU DINHEIRO E NOSSO");
        System.out.println("\nCliente: " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Seu Saldo atual: " + saldo);
        System.out.println("\n-------------------------------------");

//Menu
        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Tranferir Valor
                3 - Receber Valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println(" O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println(" Qual o valor que deseja tranferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println(" Não há saldo para realizar a tranferência ");
                } else {
                    saldo -= valor;
                    System.out.println("Agora seu saldo atual é de " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Agora seu saldo atual é de " + saldo);
                
            } else if (opcao != 4){
                System.out.println("Opção invalida ");
            }
        }
    }
}
