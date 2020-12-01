public class Operacao {
    
    public static double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public static double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public static double divisao(double valor1, double valor2) {
        return (valor2 == 0 ? 0 : valor1 / valor2);
    }
}
