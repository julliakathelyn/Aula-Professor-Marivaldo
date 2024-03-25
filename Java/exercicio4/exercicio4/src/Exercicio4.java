import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {

        System.out.println("Os tres valores ");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de a e tecle enter");
        int a = entrada.nextInt();

        System.out.println("Digite o valor de b e tecle enter");
        int b = entrada.nextInt();

        System.out.println("Digite o valor de c e tecle enter");
        int c = entrada.nextInt();

        if (a>b & a>c){
            System.out.println(" A é o maior valor");
        }else if (b>a & b>c){
            System.out.println("B é o maior valor");
        }else if (c>a & c>b) {
            System.out.println("C é o maior valor");
        }else System.out.println("São iguais");

        entrada.close();

    }
}