public class Quest5_discente {

    String nome, CPF;

    double nota1, nota2, nota3;

    public Quest5_discente(String nome, String cpf) {

        this.nome = nome;
        this.CPF = cpf;

    }

    public double calcularM() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
}
