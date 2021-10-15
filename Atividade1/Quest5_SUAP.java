public class Quest5_SUAP {

    public static void main(String[] args) {

        double media;

        Quest5_discente notaAluno1 = new Quest5_discente("Jaqueline", "171.717.171-71");

        notaAluno1.nota1 = 1;
        notaAluno1.nota2 = 1;
        notaAluno1.nota3 = 1;

        media = notaAluno1.calcularM();

        System.out.println("Media do aluno/a: " + media);

        notaAluno1.nota2 = 10;

        media = notaAluno1.calcularM();

        System.out.println("Media do aluno/a: " + media);

    }
}
