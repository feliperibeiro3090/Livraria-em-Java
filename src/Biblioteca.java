import java.util.ArrayList;
import java.util.List;



public class Biblioteca {
    private List<Autor> autores = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();


    public void ListarLivrosDisponoveis(){
        boolean disponivel = false;
        System.out.println("==== livros disponiveis ====");
        for(Livro livro: livros)
            if(livro.isDisponivel()){
                System.out.println("ID: " + livro.getId() + " | " + livro.getTitulo() + " | Autor: " + livro.getAutor().getNome());
                disponivel = true;

            }

        if (!disponivel){
            System.out.println("livro nao esta diponivel");

        }

    }

    public Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id)  { // aqui nessa linha com o == estou vendo se o id escolhido bate com o id existente se sim ele avança.
                return livro; // retorna o livro se o ID bater
            }
        }
        return null; // retorna null se não encontrar
    }


    public Biblioteca(){
       Autor a1 = new Autor("Machado de assis","17/03/1967");
       Autor a2 = new Autor("joão doria","17/03/1999");
       Autor a3 = new Autor("Cleber fonseca","17/03/1897");

       autores.add(a1); autores.add(a2); autores.add(a3);

        Livro livro1 = new Livro("O homem macaco" , a1 , true , "27/11/2025" , "27/11/2025");
        Livro livro2 = new Livro("O homem amendoim" , a1 , true , "27/11/2025" , "27/11/2025");
        Livro livro3 = new Livro("O homem banana" , a1 , true , "27/11/2025" , "27/11/2025");

        Livro livro4 = new Livro("Cidade de são paulo" , a2 , true , "27/11/2025" , "27/11/2025");
        Livro livro5 = new Livro("Como ser eleito" , a2 , true , "27/11/2025" , "27/11/2025");
        Livro livro6 = new Livro("Economia de são paulo" , a2 , true , "27/11/2025" , "27/11/2025");

        Livro livro7 = new Livro("Justiça quando ?" , a3 , true , "27/11/2025" , "27/11/2025");
        Livro livro8 = new Livro("Verdades não ditas " , a3 , true , "27/11/2025" , "27/11/2025");
        Livro livro9 = new Livro("A verdade " , a3 , true , "27/11/2025" , "27/11/2025");

        livros.add(livro1); livros.add(livro2); livros.add(livro3); livros.add(livro4); livros.add(livro5); livros.add(livro6);
        livros.add(livro7); livros.add(livro8); livros.add(livro9);
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
