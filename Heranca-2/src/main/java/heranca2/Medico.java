package heranca2;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String email, double salario, Endereco endereco, String crm) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CRM: " + this.crm);
    }
}
