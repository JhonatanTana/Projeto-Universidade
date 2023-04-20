package universidade;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

    private String nome;
    private String endereco;
    private String cidade;
    private Unidade unidade;
    private List<Unidade> unidades;
    
    public static void main(String[] args) {

    }
    
    public Universidade (Unidade unidade) {
        this.unidade  = unidade;
        unidades = new ArrayList<>();
    }
    
    public Universidade () {
        unidades = new ArrayList<>();
    }
    
    public void Universidade (String nome, String endereco, String cidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.unidades = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getCidade () {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }    
}
