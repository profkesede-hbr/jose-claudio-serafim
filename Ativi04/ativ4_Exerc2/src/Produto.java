public class Produto {
    // Atributos privados
    private String codigo;
    private String nome;
    private double preco;

    // 1. Construtor sem parâmetros (valores padrão)
    public Produto() {
        this.codigo = "";
        this.nome = "";
        this.preco = 0.0;
    }

    // 2. Construtor que recebe codigo e nome (preço inicia com zero)
    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = 0.0; // Opcional, mas deixa explícito
    }

    // 3. Construtor que recebe todos os três atributos
    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // --- Getters e Setters ---

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método auxiliar para exibir os dados do produto
    public void exibirProduto() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome do Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("--------------------------------");
    }
}