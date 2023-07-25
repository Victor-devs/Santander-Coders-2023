package src;

import java.util.Scanner;

public class SwitchCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundoNumero = scan.nextDouble();

        System.out.println("Digite o tipo de operação: +, -, *, /");
        String operacao = scan.next();


        double resultado;

        /**   switch (operacao) {
            case "+" -> resultado = soma(primeiroNumero, segundoNumero);
            case "-" -> resultado = subtracao(primeiroNumero, segundoNumero);
            case "*" -> resultado = multiplicacao(primeiroNumero, segundoNumero);
            case "/" -> resultado = divisao(primeiroNumero, segundoNumero);
            default -> {
                System.out.println("Operação inválida!");
                return;
            }
        } **/

        switch (operacao) {
            case "+": resultado = soma(primeiroNumero,segundoNumero);
            break;

            case "-": resultado = subtracao(primeiroNumero,segundoNumero);
            break;

            case "*": resultado = multiplicacao(primeiroNumero,segundoNumero);
            break;

            case "/": resultado = divisao(primeiroNumero,segundoNumero);
            break;

            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("O resultado da operação é " + primeiroNumero + " " + operacao + " " + segundoNumero + " = " + resultado);
        scan.close();
    }
    public static double soma(double primeiroNumero, double segundoNumero){
        return primeiroNumero + segundoNumero;
    }
    public static double subtracao(double primeiroNumero, double segundoNumero){
        return primeiroNumero - segundoNumero;
    }
    public static double multiplicacao(double primeiroNumero, double segundoNumero){
        return primeiroNumero * segundoNumero;
    }
    public static double divisao(double primeiroNumero, double segundoNumero){
        return primeiroNumero / segundoNumero;
    }
}
