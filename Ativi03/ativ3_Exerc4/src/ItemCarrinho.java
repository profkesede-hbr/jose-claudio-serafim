public class ItemCarrinho {
    // Atributos privados
    private String produto;
    private int quantidade;
    private double precoUnitario;

    // Construtor para inicializar os dados utilizando os setters (garantindo validações)
    public ItemCarrinho(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    // Getters e Setters com validações
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        // Quantidade não pode ser menor que 1
        if (quantidade >= 1) {
            this.quantidade = quantidade;
        } else {
            System.out.println("⚠️ Erro: A quantidade deve ser de pelo menos 1 unidade.");
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        // Preço unitário deve ser positivo (maior que zero)
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            System.out.println("⚠️ Erro: O preço unitário deve ser positivo.");
        }
    }

    // Método para calcular o subtotal do item
    public double calcularSubtotal() {
        return this.quantidade * this.precoUnitario;
    }

    // Método auxiliar para exibir os dados do item formatados
    public void exibirItem() {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço Unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Subtotal: R$ %.2f\n", calcularSubtotal());
        System.out.println("--------------------------------");
    }
}