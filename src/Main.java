import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando as variáveis
        String nomeConta = "Guru Do Himalaia";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.0;
        double valorTransferir = 0;
        int escolhas = 0;

        //Criando a leitura dos dados
        Scanner leitura = new Scanner(System.in);

        //Mostrando os dados do cliente
        System.out.println("\n**************************************");
        System.out.println("Nome da conta:      " + nomeConta);
        System.out.println("Tipo da conta:      " + tipoConta);
        System.out.println("Saldo inicial:      " + saldoInicial);
        System.out.println("**************************************");

        //Criando o loop de repetição
        while (escolhas != 4) {

            //Criando as opções de escolhas
            System.out.println("\nOpções de Consultas");
            System.out.println("\n[1] Consultar saldo");
            System.out.println("[2] Receber valor");
            System.out.println("[3] Transferir valor");
            System.out.println("[4] Sair\n");
            System.out.print("Selecione a opção desejada: ");
            escolhas = leitura.nextInt();


            //Cada escolha tem sua respectiva função
            switch (escolhas) {
                case 1:
                    System.out.println("\nSeu saldo atual: R$ " + saldoInicial + " reais");
                    break;
                case 2:
                    System.out.print("Digite o valor para receber: ");
                    double valorReceber = leitura.nextDouble();
                    saldoInicial += valorReceber;
                    System.out.print("\nSeu saldo atualizado: R$ " + saldoInicial + " reais\n");
                    break;
                case 3:
                    System.out.print("Digite o valor para transferir: ");
                    valorTransferir = leitura.nextDouble();
                    if (valorTransferir > saldoInicial) {
                        System.out.println("Impossível transferir! Seu saldo é insuficiente!");
                    } else
                    saldoInicial -= valorTransferir;
                    System.out.print("\nSeu saldo atualizado: R$ " + saldoInicial + " reais\n");
                    break;
                case 4:
                    System.out.println("\nObrigado por usar o Banco do Guru!");
                    break;
                default:
                    System.out.println("\nOperação Inválida!");
            }
        }
    }
}