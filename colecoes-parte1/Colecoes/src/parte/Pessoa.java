package parte;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }

    public int compareTo(Pessoa aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
