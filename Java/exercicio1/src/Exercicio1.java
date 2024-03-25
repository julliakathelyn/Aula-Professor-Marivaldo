import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) throws Exception {
        
        System.out.println("Sistema teste");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int a =entrada.nextInt();
        System.out.println("Digite o segundo numero");
        int b = entrada.nextInt();
        System.out.println("Digite um nome");
        String nome = entrada.nextLine();

        //String nome = "Jullia";
        //int a = 10;
        //int b = 15;
        int soma = a+b;
        int sub = a-b;
        int mult = a*b;
        float divs = a/b;
        System.out.println("A soma é de A+B é de: "+ soma);
        System.out.println("A subtração de a-b é :" + sub);
        System.out.println("A multiplicaçao de a*b é "+ mult);
        System.out.println("A divisão de a/b é : "+divs);
        System.out.println("O nome é: "+nome);

        entrada.close();



    }
}
