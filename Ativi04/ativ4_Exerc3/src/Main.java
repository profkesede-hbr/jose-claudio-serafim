public class Main {
    public static void main(String[] args) {
        // Testando o 1º construtor (valor e prazo, assumindo a taxa padrão de 1.5%)
        Emprestimo emp1 = new Emprestimo(10000.00, 12);
        System.out.println("Empréstimo 1 (Com taxa padrão):");
        emp1.exibirEmprestimo();

        // Testando o 2º construtor (informando todos os valores, ex: taxa de 2.0%)
        Emprestimo emp2 = new Emprestimo(25000.00, 2.0, 24);
        System.out.println("Empréstimo 2 (Com taxa personalizada):");
        emp2.exibirEmprestimo();
    }
}
