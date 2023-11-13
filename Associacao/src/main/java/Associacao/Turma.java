package Associacao;

import java.util.ArrayList;

public class Turma {

    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(Disciplina disciplina) {
        this.alunos = new ArrayList<Aluno>();
        this.setDisciplina(disciplina);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("Disciplina invalida");
        }
        this.disciplina = disciplina;
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void desmatricular(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public boolean verificarMatricula(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public int getNumeroAlunos() {
        return this.alunos.size();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<String> getNomeAlunos(){
        ArrayList<String> nomeAlunos = new ArrayList<>();
        for (Aluno aluno:this.alunos
             ) {
            nomeAlunos.add(aluno.getNome());
        }
        return nomeAlunos;
    }

    public String getNomeProfessor() {
        if (this.professor == null) {
            return "Turma sem professor";
        }
        return this.professor.getNome();
    }

    public String getNomeDisciplina(){
        return this.disciplina.getNome();
    }

    public boolean verificaAlunoTurma(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    public boolean excluirAlunoTurma(Aluno aluno){
        if(this.alunos.contains(aluno)){
            alunos.remove(aluno);
            return true;
        }else{
            return false;
        }
    }

}
