package ex3;

public class previsao {
    public static void main(String[] args) {
        temp prev = new temp();
        prev.temp = "21 até 33";
        prev.chuva = 10.4;
        prev.vento = 13;
        prev.umid = 56;
        prev.lua = "cheia";

        System.out.println(prev.temp);
        System.out.println(prev.chuva);
        System.out.println(prev.vento);
        System.out.println(prev.umid);
        System.out.println(prev.lua);
    }
}
