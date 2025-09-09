package heranca2;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String nome, String email, double salario, Endereco endereco, String crea) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CREA: " + this.crea);
    }
}
