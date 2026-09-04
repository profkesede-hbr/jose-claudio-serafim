public class MainCalculadoraFinanceira {
    public static void main(String[] args) {
        CalculadoraFinanceira calc = new CalculadoraFinanceira();


        double juros1 = calc.calcularJuros(5000.00, 2.0, 6);
        System.out.printf("1. Juros (Completo): R$ %.2f\n", juros1);


        double juros2 = calc.calcularJuros(10000.00, 1.0);
        System.out.printf("2. Juros (Capital e Taxa): R$ %.2f\n", juros2);


        double juros3 = calc.calcularJuros(3000.00);
        System.out.printf("3. Juros (Apenas Capital): R$ %.2f\n", juros3);
    }
}