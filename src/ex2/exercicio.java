package ex2;

import ex2.academia;

public class exercicio {
    public static void main(String[] args) {
        academia novoex = new academia();
        novoex.exercicio = "supino";
        novoex.resumo = "É um exercício que fortalece e\n" +
                "melhora a definição dos músculos\n" +
                "do peitoral...";
        novoex.repeticoes = 15;
        novoex.serie = 3;
        novoex.descanco = "2 min";
        novoex.carga = "34 kg";
        novoex.dificuldade = "Dificil";
        novoex.exibir();
        novoex.exibirComRetorno();
        System.out.println(novoex.exibirComRetorno());

        academia ex2 = new academia();
        ex2.exercicio = "Puxada frontal";
        ex2.resumo = "É um exercício que fortalece e\n" +
                "melhora a definição dos músculos\n" +
                "da costa...";
        ex2.repeticoes = 12;
        ex2.serie = 3;
        ex2.descanco = "2 min";
        ex2.carga = "50 kg";
        ex2.dificuldade = "Dificil";
        ex2.exibir();
        ex2.exibirComRetorno();
        System.out.println(ex2.exibirComRetorno());


    }
}
