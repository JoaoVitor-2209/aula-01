package ex1;

public class receita {
    public static void main(String[] args) {
        bolo novareceita = new bolo();
        novareceita.titulo = "Bolo de Milho";
        novareceita.autor = "Vanessa Souza";
        novareceita.tempo = "50 min";
        novareceita.nota = Double.parseDouble("4.8");
        novareceita.custo = "Custo Baixo";
        novareceita.receita = "O bolo de milho de lata no liquidificador é uma verdadeira homenagem aos sabores tradicionais da culinária brasileira. Essa receita, além de deliciosa, é extremamente prática, sendo ideal para quem busca um doce caseiro sem abrir mão da facilidade no preparo. A praticidade aliada ao sabor único desse bolo vai conquistar a todos, proporcionando um momento de prazer gastronômico com um toque de tradição brasileira.";
        System.out.println(novareceita.titulo);
        System.out.println(novareceita.autor);
        System.out.println(novareceita.tempo + "\t\t"+ novareceita.nota +"\t\t"+novareceita.custo);
        System.out.println(novareceita);
        bolo outrareceita = new bolo();
        System.out.println(novareceita.receita);
        System.out.println(outrareceita);
        bolo l2 = novareceita;

    }
}

