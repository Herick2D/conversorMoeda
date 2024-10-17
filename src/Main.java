import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        int valor;
        Conversor conversor = new Conversor();

        while(exit){
            System.out.println("Conversor de moedas");
            System.out.println("*********************************************");
            System.out.println("1: Real brasileiro =>> Peso argentino");
            System.out.println("2: Peso argentino =>> Real brasileiro");
            System.out.println("3: Real brasileiro =>> Dólar americano");
            System.out.println("4: Dólar americano =>> Real brasileiro");
            System.out.println("5: Peso argentino =>> Dólar americano");
            System.out.println("6: Dólar americano =>> Peso argentino");
            System.out.println("*********************************************");

            switch(sc.nextInt()) {
                case 1:
                    System.out.println("Insira o valor que deseja converter: ");
                    valor = value.nextInt();
                    conversor.converte("BRL", "ARS", valor);
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja converter: ");
                    valor = value.nextInt();
                    conversor.converte("ARS", "BRL", valor);
                    break;
                case 3:
                    System.out.println("Insira o valor que deseja converter: ");
                    valor = value.nextInt();
                    conversor.converte("BRL", "USD", valor);
                    break;
                case 4:
                    System.out.println("Insira o valor que deseja converter: ");
                    valor = value.nextInt();
                    conversor.converte("USD", "BRL", valor);
                    break;
                case 5:
                    System.out.println("Insira o valor que deseja converter: ");
                    valor = value.nextInt();
                    conversor.converte("ARS", "USD", valor);
                    break;
                case 6:
                    System.out.println("Insira o valor que deseja converter: ");
                    valor = value.nextInt();
                    conversor.converte("USD", "ARS", valor);
                    break;
                case 7:
                    System.out.println("Saindo... ");
                    exit = false;
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente!");
            }
        }
        
    }
}