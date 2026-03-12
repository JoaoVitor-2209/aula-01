import java.util.*;
public class primeiroprograma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, outronun,soma;
        System.out.print("Digite o primeiro numero: ");
        numero = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        outronun = entrada.nextInt();
        soma = numero + outronun;
        System.out.print("A soma dos dois numeros é: "+ soma);
    }
}