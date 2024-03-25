import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        int n1 = entrada.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = entrada.nextInt();

        if(n1 > n2){
            System.out.println("o numero 1 é maior");
        }else if (n2>n1) {
            System.out.println("o numero 2 é maior");
        }else System.out.println("São iguais");

        entrada.close();

    }
}
