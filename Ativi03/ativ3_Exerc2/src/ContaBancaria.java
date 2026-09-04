 class Produto {


    private String nome;
    private double preco;
    private int estoque;

    // Construtor
    public Produto(String nome, double preco, int estoqueInicial) {
        this.nome = nome;
        setPreco(preco); // Usa a validação do setter
        if (estoqueInicial >= 0) {
            this.estoque = estoqueInicial;
        } else {
            this.estoque = 0;
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    // Regra: preço não pode ser negativo
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    // Apenas Getter para o estoque (sem setEstoque)
    public int getEstoque() {
        return estoque;
    }

    // Método para adicionar ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println(quantidade + " unidade(s) adicionada(s) ao estoque.");
        } else {
            System.out.println("Erro: A quantidade deve ser maior que zero.");
        }
    }

    // Método para remover do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade deve ser maior que zero.");
        } else if (quantidade <= this.estoque) {
            this.estoque -= quantidade;
            System.out.println(quantidade + " unidade(s) removida(s) do estoque.");
        } else {
            System.out.println("Erro: Estoque insuficiente.");
        }
    }

    // Método para exibir informações
    public void exibirProduto() {
        System.out.println("\n--- DADOS DO PRODUTO ---");
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço: R$ %.2f%n", this.preco);
        System.out.println("Estoque Atual: " + this.estoque + " unidades");
        System.out.println("------------------------\n");
    }
}