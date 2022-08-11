public class Main {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Julius", "José", "Martins", "zemartins@gmail.com");

        Personagem personagem = new Personagem("Napoleão", "Moderna");
        personagem.criaCidade("Cidade do Napoleão");
        System.out.println(personagem.getCidades());

        jogador.criaPersona("Cleópatra", "Antiga");
        System.out.println(jogador.getPersonagens());




    }
}
