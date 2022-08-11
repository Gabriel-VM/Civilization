import java.util.ArrayList;

public class Personagem {

    private String nome;
    private String epoca;
    private int nivel = 0;
    private int dinheiro = 0;
    private ArrayList<String> cidades = new ArrayList<>(); // Variável criada para verificar se a cidade é criada.

    private Personagem(String nome, String epoca, int nivel, int dinheiro) {
        this.nome = nome;
        this.epoca = epoca;
        this.nivel = nivel;
        this.dinheiro = dinheiro;
    }

    public Personagem(String nome, String epoca){
        this.nome = nome;
        this.epoca = epoca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public ArrayList<String> getCidades() {
        return cidades;
    }

    public void criaCidade(String nome){
        Cidade cidade = new Cidade(nome);
        getCidades().add(cidade.getNome()); // Confirmar se a cidade foi criada.


    }


}
