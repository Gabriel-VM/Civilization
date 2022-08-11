public class Cidade {

    private String nome;
    private int nivel = 0;
    private int numHabit = 0;
    private String tipo;

    private Cidade(String nome, int nivel, int numHabit, String  tipo) {
        this.nome = nome;
        this.nivel = nivel;
        this.numHabit = numHabit;
        this.tipo = tipo;
    }

    public Cidade(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNumHabit() {
        return numHabit;
    }

    public void setNumHabit(int numHabit) {
        this.numHabit = numHabit;
    }

    public String  getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void subirNivel(){

        setNivel(getNivel()+1);

        if(getNivel() < 11){
            setTipo("Aldeia");
        }
        else if(getNivel() >= 11 && getNivel() < 21){
            setTipo("Vila");
        } else if (getNivel() > 20){
            setTipo("Cidade");
        }

    }


}
