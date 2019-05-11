package Paquetes;

import java.util.ArrayList;

public class Calculadora {

    private String operacion;
    private ArrayList<String> valores;
    private double resultado;

    public Calculadora(String operacion) {
        this.operacion = operacion;
        this.valores = new ArrayList<>();
        this.resultado = 0;
    }

    public void ingresarOperacion(String operacion) {
        String[] datos = operacion.split("");
        for (int i = 0; i < operacion.length(); i++) {
            valores.add(i, datos[i]);
        }
    }

    public void verificarOperaciones() {
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i).equalsIgnoreCase("+")) {
                ajustarArray(i, sumar(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));
            }
            if (valores.get(i).equalsIgnoreCase("-")) {
                ajustarArray(i, restar(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));
            }
            if (valores.get(i).equalsIgnoreCase("*")) {
                ajustarArray(i, multiplicar(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));
            }
            if (valores.get(i).equalsIgnoreCase("/")) {
                ajustarArray(i, dividir(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));
            }
            if (valores.get(i).equalsIgnoreCase("^")) {
                ajustarArray(i, potencia(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));
            }
        }
    }

    public void mostrarResultado() {
        System.out.println(valores.get(1));
    }

    public void ajustarArray(int i, double resultadoOPeracion) {
        valores.set(i - 2, Double.toString(resultadoOPeracion));
        valores.remove(i);
        valores.remove(i - 1);
    }

    public double parseDouble(String numero) {
        return Double.parseDouble(numero);
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error Matematico.");
        }
        return 0;
    }

    public double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }


}
