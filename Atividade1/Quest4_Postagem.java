package Atividade1;

public class Quest4_Postagem {

    String text, link;
    int numeroCurtidas, numeroCompartilhamento;

    public Quest4_Postagem(String text, String link) {

        this.text = text;
        this.link = link;

    }

    public void curtiPost() {
        this.numeroCurtidas++;
    }

    public void compartilharPost() {
        this.numeroCompartilhamento++;
    }

}
