/*Classe Curso

Atributos:

nome (String)

cargaHoraria (int)

professor (String)

Métodos:

toString() → retorna algo como:
"Curso: Java | Carga Horária: 40h | Professor: Ana Souza"
 * 
 */

 class Curso{
    private String nome;
    private int cargaHoraria;
    private String professor;

    public Curso(String nome, int cargaHoraria, String professor){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor(){
        return professor;
    }

    public void setProfessor(String professor){
        this.professor = professor;
    }

    public void toString(){
        
    }
 }