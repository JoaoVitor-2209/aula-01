import java.util.Scanner;
public class calcularipva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double venal,ipva;
        int tipo;

        System.out.print("Digite o valor venal do carro: ");
        venal = entrada.nextDouble();

        System.out.println("Escolha um tipo de veiculo");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Onibus");
        System.out.println("4 - Caminnhonete ");
        System.out.println("5 - Caminhão");
        System.out.println("6 - Locadora");
        tipo = entrada.nextInt();

        if (tipo == 1){
            ipva = venal * 0.040;
        } else if (tipo == 2) {
            ipva = venal * 0.020;
        } else if (tipo == 3) {
            ipva = venal * 0.020;
        } else if (tipo == 4) {
            ipva = venal * 0.020;
        } else if (tipo == 5) {
            ipva = venal * 0.015;
        } else{
            ipva = venal * 0.010;
        }
        System.out.print("O valor do seu ipva é: "+ipva);
    }
}
