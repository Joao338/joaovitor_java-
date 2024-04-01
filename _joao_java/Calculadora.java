import java.util.ArrayList;

public class Calculadora {
    public double adicionar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return Double.NaN; // Retorna um valor indicando "Not a Number"
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        // Exemplo de uso:
        double resultadoSoma = calculadora.adicionar(10, 5);
        System.out.println("10 + 5 = " + resultadoSoma);

        double resultadoSubtracao = calculadora.subtrair(10, 5);
        System.out.println("10 - 5 = " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplicar(10, 5);
        System.out.println("10 * 5 = " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.dividir(10, 5);
        System.out.println("10 / 5 = " + resultadoDivisao);
    }
}