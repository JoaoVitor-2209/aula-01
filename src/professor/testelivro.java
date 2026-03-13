package professor;

public class testelivro {
    public static void main(String[] args) {
        //Criar objetos - instanciar
        livro meuLivro = new livro();
        meuLivro.titulo = "Harry Potter";
        meuLivro.editora = "editora";
        System.out.println(meuLivro.titulo);
        System.out.println(meuLivro.editora);
        System.out.println(meuLivro);
    }
}