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

    public ArrayList<String> listaNomeAlunos(){
        ArrayList<String> nomeAlunos = new ArrayList<String>();
        for (Aluno aluno:this.alunos
             ) {
            nomeAlunos.add(aluno.getNome());
        }
        return nomeAlunos;
    }

    public ArrayList<String> getNomeAlunos() {
        return listaNomeAlunos();
    }
}
