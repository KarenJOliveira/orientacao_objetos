package Associacao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {
    Turma turma;
    Disciplina disciplina;

    @BeforeEach
    void setUp(){
        Disciplina disciplina = new Disciplina("Orientacao a Objetos");
        turma = new Turma(disciplina);
    }

    //Questao 1
    @Test
    void deveRetornarNomeProfessor(){
        Professor professor = new Professor("Fulano da Silva");
        turma.setProfessor(professor);

        assertEquals("Fulano da Silva", turma.getProfessor().getNome());
    }

    //Questao 2
    @Test
    void deveRetornarNomeAlunos(){

        Aluno aluno = new Aluno("Fulano");
        Aluno aluno2 = new Aluno("Ciclano");
        Aluno aluno3 = new Aluno("Beltrano");
        turma.matricular(aluno);
        turma.matricular(aluno2);
        turma.matricular(aluno3);
        List<String> nomes = Arrays.asList("Fulano","Ciclano","Beltrano");

        assertEquals(nomes, turma.getNomeAlunos());
    }

    //Questao 7 - Verificar se um aluno está em uma turma
    @Test
    void deveRetornarVerdadeiroAlunoTurma(){
        Disciplina disciplina = new Disciplina("Orientacao a Objetos");

        Turma turma = new Turma(disciplina);
        Aluno aluno = new Aluno("Lorem");
        turma.matricular(aluno);

        assertTrue(turma.verificaAlunoTurma(aluno));
    }
    //Questao 10 - Excluir aluno de uma turma
    @Test
    void deveRetornarVerdadeiroExcluiAluno(){
        Aluno aluno = new Aluno("Lorem");
        Turma turma = new Turma(new Disciplina("Orientacao a Objetos"));
        turma.matricular(aluno);

        assertTrue(turma.excluirAlunoTurma(aluno));
    }
    @Test
    void deveRetornarFalsoExcluiAluno(){
        Aluno aluno = new Aluno("Lorem");
        Turma turma = new Turma(new Disciplina("Orientacao a Objetos"));

        assertFalse(turma.excluirAlunoTurma(aluno));
    }
    

}