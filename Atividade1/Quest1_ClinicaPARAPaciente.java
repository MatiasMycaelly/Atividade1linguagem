public class Quest1_ClinicaPARAPaciente {

    public static void main(String[] args) {

        Quest1_Paciente Mycaelly = new Quest1_Paciente("Mycaelly Jaqueline", 23, "02/08/2004", "Feminina", "Abacaxi",
                "Nenhum", "O+");

        System.out.println("\nTipo Sanguíneo: " + Mycaelly.tipoSanguineo);
        System.out.println("Codigo: " + Mycaelly.codigo);
        System.out.println("Nome: " + Mycaelly.nome);
        System.out.println("Data de Nascimento: " + Mycaelly.dataNascimento);
        System.out.println("Sexo: " + Mycaelly.sexo);
        System.out.println("Plano de saude: " + Mycaelly.planoSaude);
        System.out.println("Alergia: " + Mycaelly.alergia);

        Mycaelly.nome = "Maria Januaria";
        Mycaelly.dataNascimento = "23/03/1972";
        Mycaelly.sexo = "Feminino";
        Mycaelly.tipoSanguineo = "O+";
        Mycaelly.alergia = "Nenhuma";
        Mycaelly.planoSaude = "Nenhum";
        Mycaelly.codigo = 24;

        System.out.println("\nTipo Sanguíneo: " + Mycaelly.tipoSanguineo);
        System.out.println("Codigo: " + Mycaelly.codigo);
        System.out.println("Nome: " + Mycaelly.nome);
        System.out.println("Data de Nascimento: " + Mycaelly.dataNascimento);
        System.out.println("Sexo: " + Mycaelly.sexo);
        System.out.println("Plano de saude: " + Mycaelly.planoSaude);
        System.out.println("Alergia: " + Mycaelly.alergia);

    }
}
