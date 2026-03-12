import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        double n1, n2, media;
        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextDouble();
        media = (n1+n2)/2;
        System.out.print("A media desse aluno é: "+media);
    }
}
