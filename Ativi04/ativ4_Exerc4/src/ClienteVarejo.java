public class ClienteVarejo {
    // Atributos privados
    private String nome;
    private String cpf;

    // 1. Construtor sem parâmetros (inicializa com strings vazias)
    public ClienteVarejo() {
        this.nome = "";
        this.cpf = "";
    }

    // 2. Construtor que recebe nome e cpf
    public ClienteVarejo(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // --- Getters e Setters ---

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

    // Método auxiliar para exibir os dados do cliente
    public void exibirCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("--------------------------------");
    }
}