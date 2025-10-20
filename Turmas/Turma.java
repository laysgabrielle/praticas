/*Classe Aluno

Atributos:

nome (String)

matricula (String)

lista de cursos (List<Curso>)

Métodos:

adicionarCurso(Curso c) → usa add() para inserir curso na lista.

listarCursos() → exibe todos os cursos do aluno.

toString() → retorna algo como:
"Aluno: João (Matrícula: 2025A)" */

class Aluno{

    private String nome;
    private int matricula;
    private List<Curso> cursos;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public List<Curso> getCursos(){
        return cursos;
    }

    public void setCursos(List<Curso> cursos){
        this.cursos = cursos;
    }


}