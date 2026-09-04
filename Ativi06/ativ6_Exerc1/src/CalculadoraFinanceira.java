public class CalculadoraFinanceira {

    // 1. Método que recebe capital, taxa de juros mensal e tempo em meses
    public double calcularJuros(double capital, double taxaMensal, int tempoMeses) {
        // Fórmula de juros simples: C * (i / 100) * t
        return capital * (taxaMensal / 100.0) * tempoMeses;
    }

    // 2. Método que recebe capital e taxa, assumindo tempo padrão de 12 meses
    public double calcularJuros(double capital, double taxaMensal) {
        // Reutilizamos o primeiro método passando 12 como tempo padrão
        return calcularJuros(capital, taxaMensal, 12);
    }

    // 3. Método que recebe apenas o capital (taxa padrão de 1.5% e tempo de 12 meses)
    public double calcularJuros(double capital) {
        // Reutilizamos o primeiro método passando 1.5% de taxa e 12 meses
        return calcularJuros(capital, 1.5, 12);
    }
}