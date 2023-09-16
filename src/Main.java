import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para iniciar a calculadora PA/PG Digite o Valor inicial ");
        int valorInicial = sc.nextInt();
        System.out.println("Agora escolha um valor para a raiz");
        int valorRaiz = sc.nextInt();
        System.out.println("Vamos iniciar a calculadora de PA ou de PG? - Digite 1 para PA e 2 para PG:");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Quer imprimir os Dez primeiros números da PA? Digite 1- SIM ou 2 - NÃO.");
            int escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Os 10 primeiros números da PA são: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print(valorInicial + " ");
                    valorInicial += valorRaiz;
                }
                System.out.println(); 
            } else if (escolha == 2) {
                System.out.println("Programa encerrado, volte sempre.");
            } else {
                System.out.println("Opção inválida, programa encerrado.");
            }
        } else if (opcao == 2) {
            System.out.println("Quer imprimir os Dez primeiros números da PG? Digite 1- SIM ou 2 - NÃO.");
            int escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Os 10 primeiros números da PG são: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print(valorInicial + " ");
                    valorInicial *= valorRaiz;
                }
                System.out.println(); 
            } else if (escolha == 2) {
                System.out.println("Programa encerrado, volte sempre.");
            } else {
                System.out.println("Opção inválida, programa encerrado.");
            }
        } else {
            System.out.println("Opção inválida, programa encerrado.");
        }
    }
}
