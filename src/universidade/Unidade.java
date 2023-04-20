package universidade;

import java.util.ArrayList;
import java.util.List;

public class Unidade {
    private String nome;
    private String gestor;
    private Curso curso;
    private List<Curso> cursos;
    
    public Unidade (Curso curso) {
        this.curso  = curso;
        cursos = new ArrayList<>();
    }
    
    public Unidade () {
        cursos = new ArrayList<>();
    }
    
    public void Unidade (String nome, String gestor) {
        this.nome = nome;
        this.gestor = gestor;
        this.cursos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }
}