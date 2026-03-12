import java.util.*;
public class idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nasceu, ano_atual, data;
        System.out.print("Digite o ano que voce nasceu: ");
        nasceu = entrada.nextInt();
        System.out.print("Digite o ano atual: ");
        ano_atual = entrada.nextInt();
        data = ano_atual - nasceu;
        System.out.print("Voce esta com "+data+" anos");
    }
}
