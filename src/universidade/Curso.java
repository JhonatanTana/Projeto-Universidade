package universidade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String coordenador;
    private Disciplina disciplina;
    private List<Disciplina> disciplinas;
    
    public Curso (Disciplina disciplina) {
        this.disciplina  = disciplina;
        disciplinas = new ArrayList<>();
    }
    
    public Curso () {
        disciplinas = new ArrayList<>();
    }
    
    public void Curso (String nome, String coordenador) {
        this.nome = nome;
        this.coordenador = coordenador;
        this.disciplinas= new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
}
