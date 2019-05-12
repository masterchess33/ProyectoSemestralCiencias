package Paquetes;

import java.util.ArrayList;

public class Calculadora {

    private String operacion;
    private ArrayList<String> valores;
    private String resultado;


    public Calculadora(String operacion) {
        this.operacion = operacion;
        this.valores = new ArrayList<>();
        this.resultado="";
    }

    public void ingresarOperacion() {
        String[] datos = this.operacion.split(" ");
        for (int i = 0; i < datos.length; i++) {
            valores.add(datos[i]);
        }
    }

    public void verificarOperaciones() {
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i).equalsIgnoreCase("+")) {
                ajustarArray(i, sumar(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));i=0;
            }
            if (valores.get(i).equalsIgnoreCase("-")) {
                ajustarArray(i, restar(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));i=0;
            }
            if (valores.get(i).equalsIgnoreCase("*")) {
                ajustarArray(i, multiplicar(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));i=0;
            }
            if (valores.get(i).equalsIgnoreCase("/")) {
                ajustarArray(i, dividir(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));i=0;
            }
            if (valores.get(i).equalsIgnoreCase("^")) {
                ajustarArray(i, potencia(parseDouble(valores.get(i - 2)), parseDouble(valores.get(i - 1))));i=0;
            }
        }
    }

    public void mostrarResultado() {
        for (String s: valores){
            System.out.println(s);
        }
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado() {
        String[] resultado= this.resultado.split(".");
        double res=Double.parseDouble(valores.get(0));
        this.resultado= Double.toString(res);
    }

    public ArrayList<String> getValores() {
        return valores;
    }
}
