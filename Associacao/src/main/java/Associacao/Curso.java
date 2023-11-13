package Associacao;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private Professor coordenador;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso(){
        this.turmas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public String getNomeCoordenador() {
        if (this.coordenador == null) {
            throw new NullPointerException("Curso sem coordenador");
        }
        return this.coordenador.getNome();
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionaTurma(Turma turma){
        this.turmas.add(turma);
    }
    public void adicionaAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public ArrayList<String> getNomesProfessores(){
        ArrayList<String> nomesProfessores = new ArrayList<>();
        for (Turma turma:this.turmas
             ) {
            if(!turma.getNomeProfessor().equals("Turma sem professor")){
                nomesProfessores.add(turma.getNomeProfessor());
            }
        }
        return nomesProfessores;
    }
    public ArrayList<String> getNomesAlunosTurmas(){
        ArrayList<String> nomeAlunos = new ArrayList<>();
        for (Turma turma:this.turmas
             ) {
            nomeAlunos.addAll(turma.getNomeAlunos());
        }
        return nomeAlunos;
    }
    public ArrayList<String> getNomesAlunosCurso(){
        ArrayList<String> nomesAlunos = new ArrayList<>();
        for (Aluno aluno:this.alunos
             ) {
            nomesAlunos.add(aluno.getNome());
        }
        return nomesAlunos;
    }
    public ArrayList<String> getNomesDisciplinasTurmas(){
        ArrayList<String> nomesDisciplinas = new ArrayList<>();
        for (Turma turma:this.turmas
             ) {
            nomesDisciplinas.add(turma.getNomeDisciplina());
        }
        return nomesDisciplinas;
    }
    public boolean verificaAlunoCurso(Aluno aluno){
        return this.alunos.contains(aluno);
    }
    public boolean verificaTurmaCurso(Turma turma){
        return this.turmas.contains(turma);
    }
    public boolean excluiTurmaCurso(Turma turma){
        if(this.turmas.contains(turma)){
            this.turmas.remove(turma);
            return true;
        }else{
            return false;
        }
    }
     public boolean excluiAlunoCurso(Aluno aluno){
         if(this.alunos.contains(aluno)){
             this.alunos.remove(aluno);
             return true;
         }else{
             return false;
         }
     }
}
