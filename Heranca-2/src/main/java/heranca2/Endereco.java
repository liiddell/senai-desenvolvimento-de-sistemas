package heranca2;

public class Endereco {
    private String logadouro;
    private String numero;
    private String cep;
    private String cidade;

    public Endereco(String logadouro, String numero, String cep, String cidade) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String exibirEndereco() {
        return this.logadouro + ", " + this.numero + " - " + this.cidade + " - " + this.cep;
    }
}
