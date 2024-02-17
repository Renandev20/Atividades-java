import java.util.Scanner;

public class notas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1;
        System.out.println("me informe a nota do primeiro bimestre");
        nota1 = scan.nextFloat();
        float nota2;
        System.out.println("me informe a nota do segundo bimestre ");
        nota2 = scan.nextFloat();
        float nota3;
        System.out.println("me informe a nota do terceiro bimestre");
        nota3 = scan.nextFloat();
        float nota4;
        System.out.println("me informe a nota do quarto bimestre ");
        nota4 = scan.nextFloat();
        float notafinal = (nota1 + nota2 + nota3 + nota4) / 4.0f;
        if (notafinal < 5) {
            System.out.println("esse aluno teve a media de " + notafinal + " e essa nota está abaixo da média, ou seja, ele está de recuperação");
        } else {
            System.out.println("esse aluno teve a media de " + notafinal + " e foi aprovado. Parabéns!!!!!");
        }
    }
}
