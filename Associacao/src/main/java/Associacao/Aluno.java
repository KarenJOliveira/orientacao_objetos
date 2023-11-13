package Associacao;

public class Aluno extends Pessoa {

    private Curso curso;
    public Aluno(String nome){
        super(nome);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso invalido");
        }
        this.curso = curso;
    }

    public String getNomeCurso() {
        return this.curso.getNome();
    }
}