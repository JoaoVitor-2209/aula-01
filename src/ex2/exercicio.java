package ex2;

import ex1.bolo;

public class exercicio {
    public static void main(String[] args) {
        academia novoex = new academia();
        novoex.exercicio = "supino";
        novoex.resumo = "É um exercício que fortalece e\n" +
                "melhora a definição dos músculos\n" +
                "do peitoral...";
        novoex.repeticoes = Integer.parseInt("15");
        novoex.serie = Integer.parseInt("3");
        novoex.descanco = "2 min";
        novoex.carga = "70 kg";
        novoex.dificuldade = "Dificil";

        System.out.println(novoex.exercicio);
        System.out.println(novoex.resumo);
        System.out.println(novoex.repeticoes);
        System.out.println(novoex.serie);
        System.out.println(novoex.descanco);
        System.out.println(novoex.dificuldade);
    }
}
