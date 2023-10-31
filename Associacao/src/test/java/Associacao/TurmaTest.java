package Associacao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {
    Turma turma;
    Disciplina disciplina;

    @BeforeEach
    void setUp(){
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma(disciplina);

    }

    @Test
    void deveRetornarNomeProfessor(){
        Professor professor = new Professor();
        professor.setNome("Fulano da Silva");
        turma.setProfessor(professor);

        assertEquals("Fulano da Silva", turma.getProfessor());
    }
    @Test
    void deveRetornarNomeAlunos(){
        Curso curso = new Curso();
        Aluno aluno = new Aluno(curso);
        aluno.setNome("Fulano");
        Aluno aluno2 = new Aluno(curso);
        aluno2.setNome("Ciclano");
        Aluno aluno3 = new Aluno(curso);
        aluno3.setNome("Beltrano");
        turma.matricular(aluno);
        turma.matricular(aluno2);
        turma.matricular(aluno3);
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Fulano");
        nomes.add("Ciclano");
        nomes.add("Beltrano");

        for (int i=0;i<nomes.size();i++){
            assertEquals(nomes.get(i), turma.getNomeAlunos().get(i));
        }
    }
}