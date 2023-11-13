package Associacao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    Curso curso;
    @BeforeEach
    void setUp(){
        curso = new Curso();
    }
    //Questao 3 - Quais os nomes dos professores que lecionam em alguma turma de um curso?
    @Test
    void deveRetornarProfessores(){
        Disciplina disciplina = new Disciplina("Orientacao a Objetos");

        Professor professor1 = new Professor("Fulano");
        Professor professor2 = new Professor("Ciclano");
        Professor professor3 = new Professor("Beltrano");

        Turma turma1 = new Turma(disciplina);
        Turma turma2 = new Turma(disciplina);
        Turma turma3 = new Turma(disciplina);
        Turma turma4 = new Turma(disciplina);
        Turma turma5 = new Turma(disciplina);


        turma1.setProfessor(professor1);
        turma2.setProfessor(professor2);
        turma3.setProfessor(professor3);

        List<String> professores = Arrays.asList("Fulano","Ciclano","Beltrano");
        assertEquals(professores, curso.getNomesProfessores());
    }

    //Questao 4 - Quais os nomes dos alunos que estão registrados em alguma turma de um curso?
    @Test
    void deveRetornarAlunosTurmas(){
        Disciplina disciplina = new Disciplina("Orientacao a Objetos");

        Turma turma1 = new Turma(disciplina);
        Turma turma2 = new Turma(disciplina);
        Turma turma3 = new Turma(disciplina);
        Turma turma4 = new Turma(disciplina);
        Turma turma5 = new Turma(disciplina);

        Aluno aluno1 = new Aluno("Lorem");
        Aluno aluno2 = new Aluno("Ipsum");
        Aluno aluno3 = new Aluno("Dolor");
        Aluno aluno4 = new Aluno("Sit");
        Aluno aluno5 = new Aluno("Amet");
        Aluno aluno6 = new Aluno("Consectetur");

        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        turma2.matricular(aluno3);
        turma3.matricular(aluno4);

        curso.adicionaAluno(aluno1);
        curso.adicionaAluno(aluno2);
        curso.adicionaAluno(aluno3);
        curso.adicionaAluno(aluno4);
        curso.adicionaAluno(aluno5);
        curso.adicionaAluno(aluno6);

        List<String> alunos = Arrays.asList("Lorem","Ipsum","Dolor","Sit");
        assertEquals(alunos, curso.getNomesAlunosTurmas());
    }

    //Questao 5 - Quais os nomes dos alunos que estão registrados em um curso?
    @Test
    void deveRetornarAlunosCurso(){
        Aluno aluno1 = new Aluno("Lorem");
        Aluno aluno2 = new Aluno("Ipsum");
        Aluno aluno3 = new Aluno("Dolor");
        Aluno aluno4 = new Aluno("Sit");
        Aluno aluno5 = new Aluno("Amet");
        Aluno aluno6 = new Aluno("Consectetur");

        curso.adicionaAluno(aluno1);
        curso.adicionaAluno(aluno2);
        curso.adicionaAluno(aluno3);
        curso.adicionaAluno(aluno4);
        curso.adicionaAluno(aluno5);
        curso.adicionaAluno(aluno6);

        List<String> alunos = Arrays.asList("Lorem","Ipsum","Dolor","Sit","Amet","Consectetur");
        assertEquals(alunos,curso.getNomesAlunosCurso());
    }

    //Questao 6 - Quais disciplinas estão em alguma turma de um curso?
    @Test
    void deveRetornarDisciplinasTurmas(){
        Turma turma = new Turma(new Disciplina("Algoritmos"));
        Turma turma2 = new Turma(new Disciplina("Orientacao a Objetos"));
        curso.adicionaTurma(turma);
        curso.adicionaTurma(turma2);

        List<String> disciplinas = Arrays.asList("Algoritmos","Orientacao a Objetos");
        assertEquals(disciplinas, curso.getNomesDisciplinasTurmas());
    }

    //Questao 8 - Verificar se um aluno está em um curso
    @Test
    void deveRetornarVerdadeiroAlunoCurso(){
        Aluno aluno = new Aluno("Lorem");
        curso.adicionaAluno(aluno);

        assertTrue(curso.verificaAlunoCurso(aluno));
    }
    @Test
    void deveRetornarFalsoAlunoCurso(){
        Aluno aluno = new Aluno("Lorem");

        assertFalse(curso.verificaAlunoCurso(aluno));
    }
    //Questão 9 - Verificar se uma turma está em um curso
    @Test
    void deveRetornarVerdadeiroTurmaCurso(){
        Turma turma = new Turma(new Disciplina("Orientacao a Objetos"));
        curso.adicionaTurma(turma);

        assertTrue(curso.verificaTurmaCurso(turma));
    }
    @Test
    void deveRetornarFalsoTurmaCurso(){
        Turma turma = new Turma(new Disciplina("Orientacao a Objetos"));

        assertFalse(curso.verificaTurmaCurso(turma));
    }

    @Test
    void deveRetornarVerdadeiroExcluiTurma(){
        Turma turma = new Turma(new Disciplina("Orientacao a Objetos"));
        curso.adicionaTurma(turma);

        assertTrue(curso.excluiTurmaCurso(turma));
    }

    //Questao 11
    @Test
    void deveRetornarFalsoExcluiTurma(){
        Turma turma = new Turma(new Disciplina("Orientacao a Objetos"));

        assertFalse(curso.excluiTurmaCurso(turma));
    }


}