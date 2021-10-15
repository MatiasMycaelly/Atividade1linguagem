package Atividade1;

public class Quest4_Postagem_Facebook {

    public static void main(String[] args) {

        Quest4_Postagem p1 = new Quest4_Postagem(
                "Se a terra é plana, por que dizemos aquecimento goblal ao inves de a chapa está esquentando?",
                "https://www.instagram.com");

        p1.curtiPost();
        p1.curtiPost();
        p1.curtiPost();

        System.out.println("Quantidade de curtidas: " + p1.numeroCurtidas);

        p1.compartilharPost();
        p1.compartilharPost();

        System.out.println("Quantidade de compartilhamentos: " + p1.numeroCompartilhamento);

    }
}
