package universidade;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;
    private List<Curso> cursos;
    
    public Aluno (Curso curso) {
        this.curso  = curso;
        cursos = new ArrayList<>();
    }
    
    public Aluno () {
        cursos = new ArrayList<>();
    }
    
    public void Aluno (String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
