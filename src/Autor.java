public class Autor {
    private int id;
    private String nome;
    private String dataNascimento;

    private static int contador = 1; // garante ID único automático

    // Construtor: recebe nome e data de nascimento
    public Autor(String nome, String dataNascimento){
        this.id = contador++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    }

