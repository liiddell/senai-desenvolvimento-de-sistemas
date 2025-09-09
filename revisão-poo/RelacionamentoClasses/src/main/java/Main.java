import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Endereco e1 = new Endereco("Teste", "12", "Casa", "2545455", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa p1 = new Pessoa("Jorge", 20, "719484384", "ashfjksd@gmail.com", Sexo.MASCULINO, e1);
        pessoas.add(p1);
        Pessoa p2 = new Pessoa("Maria", 16, "719484384", "ashhd@gmail.com", Sexo.FEMININO, e1);
        pessoas.add(p2);

        for(Pessoa pessoa: pessoas){
            System.out.printf(pessoa.toString());
        }
    }
}
