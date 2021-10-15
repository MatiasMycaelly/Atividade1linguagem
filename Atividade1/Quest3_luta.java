package Atividade1;

public class Quest3_luta {

    public static void main(String[] args) {

        Quest3_lutador l1 = new Quest3_lutador(100, 10, "Ryu");
        Quest3_lutador l2 = new Quest3_lutador(100, 12, "Bison");

        l1.aplicarGolpe(l2);
        l1.aplicarGolpe(l2);
        l1.aplicarGolpe(l2);

        System.out.println("Energia ( " + l2.nome + "): " + l2.energia);

        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);
        l2.aplicarGolpe(l1);

        System.out.println("Energia ( " + l1.nome + "): " + l1.energia);

    }
}
