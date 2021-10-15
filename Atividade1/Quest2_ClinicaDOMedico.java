package Atividade1;

public class Quest2_ClinicaDOMedico {

    public static void main(String[] args) {

        Quest2_endereco endereco = new Quest2_endereco("00001", "51232323", "Presidente Maiara", "Rua do presidente",
                "Centro", "Santos", "PA");

        Quest2_medico medico = new Quest2_medico(222333, "Breno Araujo", "Masculino", "Geral", endereco);

        System.out.println("\nDados Medico:");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Dados Endereco:");
        endereco.Endereco();

        endereco.numero = "333222";
        endereco.cep = "12312312";
        endereco.rua = "Souza de Araujo";
        endereco.complemento = "Sem";
        endereco.bairro = "Casinha";
        endereco.cidade = "Rio de Janeiro";
        endereco.uf = "RJ";

        medico.codigo = 213123;
        medico.nome = "Micaelli";
        medico.sexo = "Feminino";
        medico.especialidade = "Ginecologista";

        System.out.println("\nDados Medico:");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Dados Endereco:");
        endereco.Endereco();

    }
}
