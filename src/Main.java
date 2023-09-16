import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para iniciar a calculadora PA/PG Digite o Valor inicial ");
        int valorInicial = sc.nextInt();
        System.out.println("Agora escolha um valor para a raiz");
        int valorRaiz = sc.nextInt();
        System.out.println("Vamos iniciar a calculadora de PA ou de PG? - Digite 1 para PA e 2 para PG:");
        int opcao = sc.nextInt();
        if (opcao == 1){
        System.out.println("Quer imprimir os Dez primeiros números da PA? Digite 1- SIM ou 2 - NÃo.");
        int opcao = sc.nextInt();
            if(opcao == 1){
                System.out.println("Os 10 primeiros números da PA são: ");
                for (int i = 0; i < 10; i++) {
                valorInicial += valorRaiz;
                }
            }else if(opcao==2){
                System.out.println("Programa encerrado, volte sempre.");
            }else {
            System.out.println("Programa encerrado, volte sempre.");
            }
        }else if (opcao == 2){
        System.out.println("Quer imprimir os Dez primeiros números da PG? Digite 1- SIM ou 2 - NÃo.");
        int opcao = sc.nextInt();
            if(opcao == 1){
                System.out.println("Os 10 primeiros números da PG são: ");
                for (int i = 0; i < 10; i++) {
                valorInicial *= valorRaiz;
                }
            }else if(opcao==2){
            System.out.println("Programa encerrado, volte sempre.");
            }else {
            System.out.println("Programa encerrado, volte sempre.");
        }
    }
}