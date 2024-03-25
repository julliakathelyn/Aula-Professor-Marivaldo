import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Sistemas de notas");

        System.out.println("Digite o nome do aluno");
        String nome = entrada.nextLine();

        System.out.println("Digite a Nota 1 e tecle enter");
        int nota1 = entrada.nextInt();

        System.out.println("Digite a Nota 2 e tecle enter");
        int nota2 = entrada.nextInt();

        System.out.println("Digite Nota 3 e tecle enter");
        int nota3 = entrada.nextInt();

        System.out.println("Digite Nota 4 e tecle enter");
        int nota4 = entrada.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media é " + media);

        if (media >= 7) {
            System.out.println("O aluno" + nome + "Esta aprovado" + "A media é : " + media);
        } else

            System.out.println("Aluno " + nome + " Esta reprovado" + " a media é : " + media);

            entrada.close();

    }
}
