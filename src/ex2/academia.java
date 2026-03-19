package ex2;

public class academia {
    String exercicio;
    String resumo;
    int repeticoes;
    int serie;
    String descanco;
    String carga;
    String dificuldade;

    //Metodo => acoes
    //Escrevo im trecho de codigo, esse metodo pode ser usado varias vezes
    //public => metodo publico
    //void => é um tipo (vazio) de retorno / metodo sem retorno
    //Nome de metodo = começa com letra minuscul, usa padrao camelcase, nao pode conter carac. especais

    public void exibir(){
        System.out.println("Exercicio: " + exercicio);
        System.out.println("Descrição: " + resumo);
        System.out.println("Repetições: " + repeticoes);
        System.out.println("Séries: " + serie);
        System.out.println("Tempo de descanço: " + descanco);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("===============================");

    }

    // Metodo com retorno
    // public tipo_retorno nomeMetodo(){}
    // Sempre devemos retornar o tipo solicitado usando a palavra return valor / variavel

    public String exibirComRetorno(){
        String mensagem = "\nDescrição do exercício\n" + exercicio + "\n" +
                resumo   + "\n" +
                "Séries: " + serie + "\n" +
                "Repetições: " + repeticoes + "\n" +
                "Carga: "  + carga + " kg"  + "\n" +
                "Dificuldade: " + dificuldade +"\n" +
                "=============================================";

        return mensagem;
   }
}

