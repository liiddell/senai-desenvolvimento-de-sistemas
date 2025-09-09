package Atividade01;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Rex", 5, "Labrador", "Grande", "Ração Premium");
        Pet pet2 = new Pet("Mimi", 3, "Siamês", "Pequeno", "Ração Especial");

        System.out.println("Dados do Pet 1:");
        pet1.exibirDados();
        System.out.println("Dados do Pet 2:");
        pet2.exibirDados();
    }
}
