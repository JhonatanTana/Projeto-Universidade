package universidade;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String professor;
    
    public void Disciplina (String nome, String professor, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
        
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getcargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getProfessor () {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
