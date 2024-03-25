import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = entrada.nextLine();

        System.out.println("Digite a nota 1 e tecle enter");
        int n1 = entrada.nextInt();

        System.out.println("Digite a nota 2 e tecle enter");
        int n2 = entrada.nextInt();

        System.out.println("Digite a nota 3 e tecle enter");
        int n3 = entrada.nextInt();

        System.out.println("Digite a nota 4 e tecle enter");
        int n4 = entrada.nextInt();

        System.out.println("Digite o numero de faltas e tecle enter");
        int faltas = entrada.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7 && faltas <= 5) {
            System.out.println("O Aluno(a) " + nome + "media: " + media + "Aprovado");
        } else if (media >= 7 && faltas > 5) {
            System.out.println("O Aluno(a) " + nome + "media: " + media + "reprovado por faltas");
        } else if (media < 7 && faltas <= 5) {
            System.out.println("O Aluno(a) " + nome + "media: " + media + "reprovado por media");
        }

        entrada.close();

    }
}
