package heranca;

public class Funcionario extends Pessoa{
    private String matricula;
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String matricula, String cargo, double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("========== Funcionário ==========\n");
        super.exibirInformacoes();
        System.out.printf("Matricula: " +this.matricula+"\n");
        System.out.printf("Cargo: "+this.cargo + "\n");
        System.out.printf("Salário: R$" +this.salario+ "\n");
    }
}
