public class ClienteVip {
    // Atributos privados
    private String nome;
    private String cpf;
    private double limiteCredito;

    // Construtor (opcional, mas recomendado para inicializar os dados)
    public ClienteVip(String nome, String cpf, double limiteCredito) {
        this.nome = nome;
        this.cpf = cpf;
        setLimiteCredito(limiteCredito); // Usa o setter para aplicar a validação
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    // Setter com a validação solicitada
    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito >= 1000.0 && limiteCredito <= 100000.0) {
            this.limiteCredito = limiteCredito;
        } else {
            System.out.println("⚠️ Erro: O limite de crédito deve estar entre R$ 1.000,00 e R$ 100.000,00.");
        }
    }

    // Método para exibir os dados de forma formatada
    public void exibirCliente() {
        System.out.println("================================");
        System.out.println("        DADOS DO CLIENTE VIP    ");
        System.out.println("================================");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.printf("Limite de Crédito: R$ %.2f\n", limiteCredito);
        System.out.println("================================");
    }
}