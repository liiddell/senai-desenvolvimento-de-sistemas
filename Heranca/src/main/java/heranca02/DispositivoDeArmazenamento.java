package heranca02;

public class DispositivoDeArmazenamento extends Memoria{

    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String marca, String modelo, int capacidadeArmazenamento, String tipoDeConexao) {
        super(marca, modelo, capacidadeArmazenamento);
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Tipo de conexão: "+ this.tipoDeConexao);
    }
}
