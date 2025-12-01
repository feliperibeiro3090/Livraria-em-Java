import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Emprestimo emprestimo = new Emprestimo();

        int opcao = 0;

        while (opcao != 2) {
            System.out.println("===== BEM-VINDO À NOSSA BIBLIOTECA =====");
            System.out.println("1 - Ver livros disponíveis");
            System.out.println("2 - Sair");
            System.out.print("Decida: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                // Lista livros disponíveis
                biblioteca.ListarLivrosDisponoveis();

                // Permite o usuário escolher um livro pelo ID
                System.out.print("\nDigite o ID do livro que deseja escolher: ");
                int idEscolhido = sc.nextInt();
                sc.nextLine(); // limpar buffer

                Livro livroSelecionado = biblioteca.buscarLivroPorId(idEscolhido);

                if (livroSelecionado != null && livroSelecionado.isDisponivel()) {
                    System.out.println("Você selecionou: " + livroSelecionado.getTitulo() +
                            " | Autor: " + livroSelecionado.getAutor().getNome());
                } else {
                    System.out.println("Livro com esse ID não encontrado ou indisponível.");
                }

                System.out.println("Agora que escolheu o livro faça o cadastro pra reservalo");

                System.out.println("digite seu nome: ");
                String nomecliente = sc.nextLine();
                String dataemprestimo = LocalDate.now().toString();
                System.out.println("Digite a data da devolução no seguinte formato d/m/a");
                String datadevolucao = sc.nextLine();
                livroSelecionado.setDisponivel(false);
                System.out.println("Emprestimo realizado com sucesso, voce reservou - " +livroSelecionado.getTitulo() + " - do autor - " + livroSelecionado.getAutor().getNome()
                        + " Lembresse de devolver na data " + datadevolucao);



            } else if (opcao == 2) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
