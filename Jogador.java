import java.util.ArrayList;

public class Jogador {

    private String nickName;
    private String nome;
    private String sobrenome;
    private String email;
    private double tempoJogo = 0;
    private ArrayList<String> personagens = new ArrayList(); // Variável criada para confirmar que o jogador consegue criar uma personagem.


    public Jogador(String nickName, String nome, String sobrenome, String email) {
        this.nickName = nickName;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTempoJogo() {
        return tempoJogo;
    }

    public void setTempoJogo(double tempoJogo) {
        this.tempoJogo = tempoJogo;
    }

    public ArrayList<String> getPersonagens() {
        return personagens;
    }

    public void adicTempo(){
        tempoJogo += getTempoJogo(); // Deveria haver uma forma de contar o tempo que o jogador passa jogando.

    }

    public void criaPersona(String nome, String epoca){
        Personagem personagem = new Personagem(nome,epoca);
        getPersonagens().add(personagem.getNome()); // Confirmar se a personagem foi criada.
    }
}
