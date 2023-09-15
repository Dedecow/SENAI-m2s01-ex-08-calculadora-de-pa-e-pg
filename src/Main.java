import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para iniciar a calculadora PA/PG Digite 2 numeros separados por virgula: Valor inicial e valor para raiz. Exemplo: 5 , 2");
        String entrada = sc.nextLine();
        String[] valores = entrada.split(",");
        if (valores.length == 2){
            int valorInicial = Integer.parseInt(valores[0].trim());
            int valorRaiz = Integer.parseInt(valores[1].trim());
            System.out.printf(" Você digitou %d para valor inicial e %d para valor da raiz.", valorInicial, valorRaiz);
        }
    }
}