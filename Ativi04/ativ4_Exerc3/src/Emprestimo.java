public class Emprestimo {
    // Atributos privados
    private double valor;
    private double taxaJuros;
    private int prazoMeses;

    // 1. Construtor que recebe valor e prazoMeses (define uma taxa padrão de 1.5%)
    public Emprestimo(double valor, int prazoMeses) {
        this.valor = valor;
        this.prazoMeses = prazoMeses;
        this.taxaJuros = 1.5; // Taxa de juros padrão
    }

    // 2. Construtor que recebe todos os três atributos
    public Emprestimo(double valor, double taxaJuros, int prazoMeses) {
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;
    }

    // --- Getters e Setters ---

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    // Método auxiliar para exibir os dados do empréstimo
    public void exibirEmprestimo() {
        System.out.printf("Valor do Empréstimo: R$ %.2f\n", valor);
        System.out.printf("Taxa de Juros: %.2f%% ao mês\n", taxaJuros);
        System.out.println("Prazo: " + prazoMeses + " meses");
        System.out.println("--------------------------------");
    }
}